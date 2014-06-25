package org.redsalt.e4fx.ui.views.controllers;

import java.util.List;

import javafx.beans.property.ListProperty;
import javafx.beans.property.Property;
import javafx.beans.property.SimpleListProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.fx.emf.databinding.edit.EMFEditFXProperties;
import org.redsalt.core.datamodel.Contact;

public abstract class AbstractDetailsViewController {

	Property<String> rebindTextField(TextField textField,
			Property<String> oldProperty, EObject object,
			EStructuralFeature feature, EditingDomain editingDomain) {
		if (oldProperty != null)
			textField.textProperty().unbindBidirectional(oldProperty);

		Property<String> property = null;
		if (object != null) {
			property = EMFEditFXProperties
					.value(editingDomain, object, feature);
			textField.textProperty().bindBidirectional(property);
		}

		textField.setDisable(object == null);

		if (object == null)
			textField.clear();

		return property;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	Property<?> rebindComboBox(ComboBox comboBox, Property<?> comboBoxProperty,
			List comboBoxValues, EObject object, EStructuralFeature feature,
			EditingDomain editingDomain) {
		if (comboBoxProperty != null)
			comboBox.valueProperty().unbindBidirectional(comboBoxProperty);

		// bind the list of selectable values
		if (!comboBox.itemsProperty().isBound()) {
			ObservableList<Contact> valuesObservableList = FXCollections
					.observableArrayList(comboBoxValues);
			ListProperty<Contact> valuesListProperty = new SimpleListProperty<Contact>(
					valuesObservableList);
			comboBox.itemsProperty().bind(valuesListProperty);
		}

		// bind the actual property of the selected value
		Property<?> property = null;
		if (object != null) {
			property = EMFEditFXProperties
					.value(editingDomain, object, feature);
			comboBox.valueProperty().bindBidirectional(property);
		}

		comboBox.setDisable(object == null);

		return property;
	}
}
