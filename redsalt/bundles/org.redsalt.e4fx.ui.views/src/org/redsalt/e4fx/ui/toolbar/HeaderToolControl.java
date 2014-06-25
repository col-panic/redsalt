package org.redsalt.e4fx.ui.toolbar;

import java.io.IOException;
import java.net.URL;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.control.TabPane;
import javafx.scene.control.ToggleButton;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.model.application.ui.advanced.MPerspectiveStack;
import org.eclipse.e4.ui.model.application.ui.basic.MWindow;
import org.eclipse.e4.ui.model.application.ui.basic.MWindowElement;
import org.eclipse.e4.ui.workbench.modeling.EModelService;

public class HeaderToolControl {

	private MPerspectiveStack mStack;
	private TabPane mFolder;

	@FXML
	private ToggleButton contactsToggleButton;
	
	@PostConstruct
	public void createUi(Group parent, MWindow window, EModelService service) {
		URL location = getClass().getResource("topTrimbar.fxml");
		FXMLLoader fxmlLoader = new FXMLLoader(location);

		Node root = null;
		try {
			root = fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		findStack(window);
		
		contactsToggleButton.setSelected(true);
		
		parent.getChildren().add(root);
	}

	private void findStack(MWindow window) {
		for (MWindowElement elem : window.getChildren())
			if (elem instanceof MPerspectiveStack) {
				mStack = (MPerspectiveStack) elem;
				return;
			}
	}
	
}
