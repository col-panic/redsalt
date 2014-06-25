package org.redsalt.e4fx.ui.views.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.redsalt.core.datamodel.Contact;

public class BookingTableViewController extends AbstractDetailsViewController {

	@FXML
	private TableColumn bookingDate;

	public void updateBindings(Contact selectedItem, EditingDomain editingDomain) {
		// TODO Auto-generated method stub

	}

}
