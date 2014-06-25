package org.redsalt.e4fx.ui.views;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ListView;
import javafx.scene.layout.BorderPane;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryListCellFactory;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryObservableList;
import org.redsalt.core.services.RedSaltModelService;

public class AbstractListView {

	public AbstractListView(BorderPane parent, final MApplication application,
			final RedSaltModelService applicationManager,
			final EMenuService menuService, Object rootObject,
			Class<?> objectClass, String contextMenuId) {
		AdapterFactory adapterFactory = applicationManager.getAdapterFactory();

		// create and populate the list
		ListView<Object> clv = new ListView<Object>();
		clv.setItems(new AdapterFactoryObservableList<Object>(adapterFactory,
				rootObject));

		// how to create the cells? what capabilities should they have?
		AdapterFactoryListCellFactory listCellFactory = new AdapterFactoryListCellFactory(
				adapterFactory);
		clv.setCellFactory(listCellFactory);

		clv.getSelectionModel().selectedItemProperty()
				.addListener(new ChangeListener<Object>() {

					@SuppressWarnings("unchecked")
					public void changed(ObservableValue<? extends Object> arg0,
							Object arg1, Object arg2) {
						application.getContext().set(
								(Class<Object>) objectClass, arg2);
					}

				});

		menuService.registerContextMenu(clv, contextMenuId);

		parent.setCenter(clv);
	}
}
