package org.redsalt.core.services.model;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.redsalt.core.appmodel.Accounts;
import org.redsalt.core.appmodel.AppmodelFactory;
import org.redsalt.core.appmodel.Contacts;
import org.redsalt.core.appmodel.RedSaltApplication;
import org.redsalt.core.appmodel.provider.AppmodelItemProviderAdapterFactory;
import org.redsalt.core.datamodel.provider.DatamodelItemProviderAdapterFactory;
import org.redsalt.core.services.RedSaltModelService;

public class RedSaltModelServiceImpl implements RedSaltModelService {

	private URI redSaltAppModelUri = null;
	private ResourceSet resSet = new ResourceSetImpl();

	protected EditingDomain editingDomain;
	protected Resource redSaltApplicationResource;
	protected ComposedAdapterFactory adapterFactory;

	public RedSaltModelServiceImpl() {
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
//		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new DatamodelItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new AppmodelItemProviderAdapterFactory());
//		adapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());

		BasicCommandStack commandStack = new BasicCommandStack();
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory,
				commandStack);
		
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
		 .put("xmi", new XMIResourceFactoryImpl());
	}

	@Override
	public AdapterFactory getAdapterFactory() {
		return adapterFactory;
	}

	@Override
	public EditingDomain getEditingDomain() {
		if (checkResource()) {
			editingDomain.getResourceSet().getResources()
					.add(redSaltApplicationResource);
		}
		return editingDomain;
	}

	/**
	 * 
	 * @return whether resource initialization was required
	 */
	private boolean checkResource() {
		if (redSaltApplicationResource != null)
			return false;

		if (redSaltAppModelUri == null) {
			String basePath = System.getProperty("user.home") + File.separator
					+ "redsalt";
			File redSaltHomeDir = new File(basePath);
			if (!redSaltHomeDir.exists()) {
				redSaltHomeDir.mkdirs();
			}
			File redSaltAppModel = new File(redSaltHomeDir, "redsalt.xmi");

			redSaltAppModelUri = URI.createFileURI(redSaltAppModel.getPath());
			if(!redSaltAppModel.exists()) {
				initializeApplicationModel();
			}
		}

	    // Get the resource
	    redSaltApplicationResource = resSet.getResource(redSaltAppModelUri, true);

		return true;
	}

	/**
	 * Initialize a new RedSalt Application model; requires creation of contacts, accounts
	 * holders etc ...
	 */
	private void initializeApplicationModel() {
		Resource res = resSet.createResource(redSaltAppModelUri);
		RedSaltApplication rsa = AppmodelFactory.eINSTANCE.createRedSaltApplication();
		rsa.setContacts(AppmodelFactory.eINSTANCE.createContacts());
		rsa.setAccounts(AppmodelFactory.eINSTANCE.createAccounts());
		res.getContents().add(rsa);
		try {
			res.save(getResourceSaveOptions());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public Map<String, String> getResourceSaveOptions() {
		Map<String, String> options = new HashMap<String, String>();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");
		return options;
	}

	@Override
	public RedSaltApplication getAppModel() {
		checkResource();
		return (RedSaltApplication) redSaltApplicationResource.getContents()
				.get(0);
	}

	@Override
	public Contacts getContacts() {
		return getAppModel().getContacts();
	}

	@Override
	public Accounts getAccounts() {
		return getAppModel().getAccounts();
	}
}
