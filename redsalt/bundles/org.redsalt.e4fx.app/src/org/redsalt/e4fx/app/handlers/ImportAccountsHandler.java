 
package org.redsalt.e4fx.app.handlers;

import org.eclipse.e4.core.di.annotations.Execute;
import org.redsalt.core.services.RedSaltModelService;

public class ImportAccountsHandler {
	@Execute
	public void execute(RedSaltModelService modelService) {
		System.out.println("import accounts");
//		ImportService is = new ImportService();
//		List<Importer<?>> importersforType = is.getImportersforType(DatamodelPackage.Literals.ACCOUNT);
//		// select importer
//		Importer<?> importer = importersforType.get(0);
//		// select file
//		File file = new File("foo");
//		try {
//			ImportAccountsCallback iac = new ImportAccountsCallback();
//			IStatus status = importer.importFromInputStream(new FileInputStream(file), modelService.getAccounts(), AppmodelPackage.Literals.ACCOUNTS__ACCOUNTS, iac, new NullProgressMonitor());
//		} catch (FileNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

		
}