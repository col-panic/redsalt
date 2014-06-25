package org.redsalt.e4fx.app.handlers;

import javafx.application.Platform;
import org.eclipse.e4.core.di.annotations.Execute;

public class ExitHandler {
	@Execute
	public void exit() {
		// TODO better life cycle support
		Platform.exit();
	}
}
