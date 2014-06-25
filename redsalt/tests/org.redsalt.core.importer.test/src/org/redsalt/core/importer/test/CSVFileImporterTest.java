package org.redsalt.core.importer.test;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.junit.Test;
import org.xml.sax.SAXException;

public class CSVFileImporterTest {

	@Test
	public void test() throws FileNotFoundException, IOException, SAXException {
		
//		RedSalt.loadOrInitAppModelFromURL(CommonTestConstants.XMI_CA_FILE.toURI().toURL());
//		
//		File importFile = new File("/Volumes/TC_DROPBOX/Firmendaten/03100733223_20100626_20120626.csv");
//		File importRuleFile = new File("/Users/marco/git/redsalt/redsalt/bundles/org.redsalt.core.importer/rsc/sparkasse_smooks.xml");
//		List<Booking> resultList = CSVFileImporter.performImport(importRuleFile, importFile, Charset.forName("ISO-8859-15"));
//		double total = 0.0d;
//		for (Booking booking : resultList) {
//			System.out.println(booking.getAvailabilityDate()+" "+booking.getDescription()+"\t\t "+booking.getAmount()+"\t"+booking.getEntryReference());
//			total+=booking.getAmount();
//			RedSalt.getAppmodel().getBookings().add(booking);
//		}
//		System.out.println("Resulting list size "+resultList.size());
//		System.out.println("Result amount "+total);
//		
//		RedSalt.storeToFile(CommonTestConstants.XMI_CAB_FILE, RedSalt.getAppmodel(), null);
	}

}
