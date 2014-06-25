package org.redsalt.e4fx.ui.views;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javafx.beans.property.ReadOnlyObjectWrapper;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableColumn.CellDataFeatures;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;

import javax.inject.Inject;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.redsalt.core.datamodel.Account;
import org.redsalt.core.datamodel.Booking;
import org.redsalt.core.services.RedSaltModelService;

public class BookingTableView {

	private TableView<Booking> tableView;
	private AdapterFactory adapterFactory;

	private DateTimeFormatter myDateFormatter = DateTimeFormatter
			.ofPattern("dd.MM.yyyy");

	@Inject
	public BookingTableView(BorderPane parent, final MApplication application,
			final RedSaltModelService applicationManager,
			final EMenuService menuService) {
		adapterFactory = applicationManager.getAdapterFactory();

		// create the table
		tableView = new TableView<Booking>();
		parent.setCenter(tableView);

		// add a table column
		// TableColumn<Booking, String> bookingDateCol = new
		// TableColumn<Booking, String>();
		// bookingDateCol
		// .setCellValueFactory(new Callback<CellDataFeatures<Booking, String>,
		// ObservableValue<String>>() {
		//
		// @Override
		// public ObservableValue<String> call(
		// CellDataFeatures<Booking, String> param) {
		// return new ReadOnlyObjectWrapper<String>(param.getValue()
		// .getBookingDate().toString());
		// }
		// });
		// tableView.getColumns().add(bookingDateCol);
		TableColumn<Booking, LocalDate> bookingDateCol = new TableColumn<Booking, LocalDate>(
				"booking date");
		// The cell must know which part of Booking it needs to display
		// bookingDateCol.setCellValueFactory(new
		// Callback<TableColumn.CellDataFeatures<Booking,LocalDate>,
		// ObservableValue<LocalDate>>() {
		// @Override
		// public ObservableValue<LocalDate> call(
		// CellDataFeatures<Booking, LocalDate> param) {
		// return new
		// ReadOnlyObjectWrapper<LocalDate>(param.getValue().getBookingDate());
		// }
		// });

		bookingDateCol.setCellValueFactory((
				CellDataFeatures<Booking, LocalDate> param) -> {
			return new ReadOnlyObjectWrapper<LocalDate>(param.getValue()
					.getBookingDate());
		});

		bookingDateCol.setCellFactory(column -> {
			return new TableCell<Booking, LocalDate>() {
				@Override
				protected void updateItem(LocalDate item, boolean empty) {
					super.updateItem(item, empty);

					if (item == null || empty) {
						setText(null);
						setStyle("");
					} else {
						setText(myDateFormatter.format(item));
					}
				}
			};
		});
		tableView.getColumns().add(bookingDateCol);
		
		TableColumn<Booking, Double> amountCol = new TableColumn<Booking, Double>("amount");
		amountCol.setCellValueFactory((CellDataFeatures<Booking, Double> param) -> {
			return new ReadOnlyObjectWrapper(param.getValue().getAmount());
		});
		tableView.getColumns().add(amountCol);

		TableColumn<Booking, String> descriptionCol = new TableColumn<Booking, String>(
				"description");
		descriptionCol
				.setCellValueFactory(new Callback<CellDataFeatures<Booking, String>, ObservableValue<String>>() {

					@Override
					public ObservableValue<String> call(
							CellDataFeatures<Booking, String> param) {
						return new ReadOnlyObjectWrapper<String>(param
								.getValue().getDescription());
					}
				});
		tableView.getColumns().add(descriptionCol);

		// how to create the cells? what capabilities should they have?

		// AdapterFactoryListCellFactory listCellFactory = new
		// AdapterFactoryListCellFactory(
		// adapterFactory);
		// clv.setCellFactory(listCellFactory);

		// clv.getSelectionModel().selectedItemProperty()
		// .addListener(new ChangeListener<Object>() {
		//
		// @SuppressWarnings("unchecked")
		// public void changed(ObservableValue<? extends Object> arg0,
		// Object arg1, Object arg2) {
		// application.getContext().set(
		// (Class<Object>) objectClass, arg2);
		// }
		//
		// });

	}

	@Inject
	public void setSelection(@Optional Account account,
			RedSaltModelService applicationManager) {
		if (account == null)
			return;
		// Booking booking = DatamodelFactory.eINSTANCE.createBooking();
		// booking.setDescription("NewBooking");
		// booking.setBookingDate(LocalDate.now());
		// booking.setAmount(5d);
		// account.getBookings().add(booking);
		ObservableList<Booking> observableList = FXCollections
				.observableList(account.getBookings());
		tableView.setItems(observableList);
	}

}
