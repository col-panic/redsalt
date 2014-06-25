package org.redsalt.core.importer.at;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.NumberFormat;
import java.text.ParseException;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.joda.money.CurrencyUnit;
import org.redsalt.core.datamodel.Account;
import org.redsalt.core.datamodel.Booking;
import org.redsalt.core.datamodel.DatamodelFactory;
import org.redsalt.core.datamodel.DatamodelPackage;
import org.redsalt.core.importer.AbstractImporterCallback;
import org.redsalt.core.importer.Importer;

import au.com.bytecode.opencsv.CSVReader;
import au.com.bytecode.opencsv.bean.ColumnPositionMappingStrategy;
import au.com.bytecode.opencsv.bean.CsvToBean;

public class SparkasseATBookingsImporter implements Importer<Booking> {

	private NumberFormat format = NumberFormat.getInstance(Locale.GERMAN);

	@Override
	public IStatus importFromInputStream(InputStream is, EObject parent,
			EReference target, AbstractImporterCallback iac,
			IProgressMonitor monitor) {

		EList<Booking> bookings = (EList<Booking>) parent.eGet(target, true);

		HashMap<String, Booking> hashedBookings = new HashMap<String, Booking>(
				bookings.size());
		for (Booking booking : bookings) {
			hashedBookings.put(booking.getEntryReference(), booking);
		}

		// perform import
		Account owningAccount = (Account) iac
				.askForValueSelection(DatamodelPackage.Literals.ACCOUNT);

		CSVReader csvReader;
		try {
			csvReader = new CSVReader(new InputStreamReader(is, "ISO-8859-15"), ';');

			ColumnPositionMappingStrategy<SparkasseATImportLineBean> strat = new ColumnPositionMappingStrategy<SparkasseATImportLineBean>();
			strat.setType(SparkasseATImportLineBean.class);
			strat.setColumnMapping(SparkasseATImportLineBean.columns);

			CsvToBean<SparkasseATImportLineBean> csv = new CsvToBean<SparkasseATImportLineBean>();
			List<SparkasseATImportLineBean> list = csv.parse(strat, csvReader);
			list.remove(0); // skip header
			for (SparkasseATImportLineBean line : list) {
				if (hashedBookings
						.containsKey(line.getErsterfassungsreferenz())) {
					System.out.println("Skipping " + line);
					continue;
				}
				System.out.println(line);

				addBookingToList(owningAccount, line, bookings);

			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		//

		// TODO Auto-generated method stub
		return null;
	}

	private void addBookingToList(Account owningAccount,
			SparkasseATImportLineBean line, EList<Booking> bookings) {
		Booking nb = DatamodelFactory.eINSTANCE.createBooking();
		nb.setAccount(owningAccount);
		try {
			nb.setAmount(format.parse(line.getBetrag()).doubleValue());
		} catch (ParseException e) {
			System.out.println("error setting amount " + line.getBetrag());
		}
		nb.setAvailabilityDate(LocalDate.parse(line.getValutadatum(),
				SparkasseATImportLineBean.dateTimeFormatter));
		nb.setBookingDate(LocalDate.parse(line.getBuchungsdatum(),
				SparkasseATImportLineBean.dateTimeFormatter));
		nb.setCurrency(CurrencyUnit.EUR);
		nb.setDescription(line.getBezeichnung());
		nb.setEntryReference(line.getErsterfassungsreferenz());
		nb.setLineItem(line.getUmsatzzeile1()+"\n "+line.getUmsatzzeile2());
		nb.setAdditionalText(line.getZusatztext());
		bookings.add(nb);

	}

	@Override
	public String getImporterId() {
		return "bookings.sparkasse.at";
	}

	@Override
	public String getImporterLabel() {
		return "Sparkasse Österreich Buchungen";
	}

}
