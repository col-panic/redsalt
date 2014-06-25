/******************************************************************************* 
 * Copyright (c) 2012 TESIS DYNAware GmbH and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     Torsten Sommer <torsten.sommer@tesis.de> - initial API and implementation 
 *******************************************************************************/
package org.redsalt.e4fx.ui.views.controllers;

import java.time.LocalDate;

import javafx.beans.property.Property;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.fx.emf.databinding.edit.EMFEditFXProperties;
import org.redsalt.core.datamodel.Contact;
import org.redsalt.core.datamodel.DatamodelPackage;

public class ContactDetailsViewController extends AbstractDetailsViewController {

	@FXML
	private ImageView imageView;

	@FXML
	private TextField title;
	private Property<String> titleProperty;

	@FXML
	private TextField name;
	private Property<String> firstNameProperty;

	
	// @FXML
	// public void initialize() {
	//
	// }

	public void updateBindings(Contact contact, EditingDomain editingDomain) {
		// General
		titleProperty = rebindTextField(title, titleProperty, contact,
				DatamodelPackage.eINSTANCE.getContact_Title(), editingDomain);
		firstNameProperty = rebindTextField(name, firstNameProperty,
				contact, DatamodelPackage.eINSTANCE.getContact_Name(),
				editingDomain);
		
		// // image
		// Image image = null;
		// if (contact != null) {
		// String jpegString = contact.getJpegString();
		// if (jpegString != null) {
		// byte[] imageBytes = Base64.decode(jpegString.getBytes());
		// ByteArrayInputStream is = new ByteArrayInputStream(imageBytes);
		// image = new Image(is);
		// }
		// }
		// imageView.setImage(image);
	}

}
