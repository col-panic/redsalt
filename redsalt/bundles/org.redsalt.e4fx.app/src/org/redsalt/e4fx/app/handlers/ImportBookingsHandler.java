package org.redsalt.e4fx.app.handlers;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import javafx.stage.FileChooser;
import javafx.stage.Stage;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.redsalt.core.datamodel.Account;
import org.redsalt.core.datamodel.DatamodelPackage;
import org.redsalt.core.importer.AbstractImporterCallback;
import org.redsalt.core.importer.Importer;
import org.redsalt.core.importer.RedSaltImportService;

public class ImportBookingsHandler {
	@Execute
	public void execute(@Optional Account parent, RedSaltImportService is, Stage window) {
		if (parent == null)
			return;

		List<Importer<?>> importersforType = is
				.getImportersforType(DatamodelPackage.Literals.BOOKING);
		// select importer
		Importer<?> importer = importersforType.get(0);
		// select file
		
		FileChooser fileChooser = new FileChooser();
		fileChooser.setTitle("Open Import File");
		File importFile = fileChooser.showOpenDialog(window);
		if(importFile == null) return;
		
		try {
			ImportBookingCallback iac = new ImportBookingCallback();
			IStatus status = importer.importFromInputStream(
					new FileInputStream(importFile), parent,
					DatamodelPackage.Literals.ACCOUNT__BOOKINGS, iac,
					new NullProgressMonitor());
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@CanExecute
	public boolean canExecute(RedSaltImportService ris) {
		return (ris.getImportersforType(DatamodelPackage.Literals.BOOKING) != null);
	}

	private class ImportBookingCallback extends AbstractImporterCallback {

	}

}