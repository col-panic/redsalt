package org.redsalt.core;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLConnection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.redsalt.core.appmodel.AppmodelFactory;
import org.redsalt.core.appmodel.AppmodelPackage;
import org.redsalt.core.appmodel.RedSaltApplication;
import org.redsalt.core.jdt.Nullable;

public class RedSalt {

	private static ResourceSet resourceSet = new ResourceSetImpl();

	private static RedSaltApplication appModel;

	static {
		EPackage.Registry.INSTANCE.put(AppmodelPackage.eNS_URI,
				AppmodelPackage.eINSTANCE);
	}

	/**
	 * Load the main {@link RedSaltApplication} model from a given resource, or
	 * initiate a new {@link RedSaltApplication}
	 * 
	 * @param res
	 *            if <code>null</code> initialize a new
	 *            {@link RedSaltApplication} model
	 * @return
	 */
	private static void loadOrInitAppModelFromResource(@Nullable Resource res) {
		RedSaltApplication ret = null;
		if (res == null) {
			appModel = AppmodelFactory.eINSTANCE.createRedSaltApplication();
		} else {
			appModel = (RedSaltApplication) res.getContents().get(0);
		}
	}

	/**
	 * Store the {@link RedSaltApplication} model to a file.
	 * 
	 * @param file
	 * @param rsapp
	 * @param encryptionCipher
	 *            cipher to encrypt the storage file with, <code>null</code>
	 *            does not encrypt the storage file
	 * @throws IOException
	 */
	private static void storeToFile(File file, RedSaltApplication rsapp,
			String encryptionCipher) throws IOException {

		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		URI fileUri = URI.createFileURI(file.getPath());
		Resource res = resourceSet.createResource(fileUri);
		res.getContents().add(rsapp);

		Map<String, String> options = new HashMap<String, String>();
		options.put(XMLResource.OPTION_ENCODING, "UTF-8");

		res.save(options);
	}

	private static void loadOrInitAppModelFromURL(
			java.net.URL url) throws IOException {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
		Map<String, Object> m = reg.getExtensionToFactoryMap();
		m.put("xmi", new XMIResourceFactoryImpl());

		URI uri = URI.createURI(url.toString());
		Resource res = resourceSet.createResource(uri);

		URLConnection connection = url.openConnection();
		InputStream inputStream = connection.getInputStream();
		connection.connect();

		res.load(inputStream, Collections.EMPTY_MAP);
		loadOrInitAppModelFromResource(res);

	}

	public static RedSaltApplication getAppmodel() {
		return appModel;
	}

}
