package org.redsalt.core.importer.internal;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.redsalt.core.datamodel.DatamodelPackage;
import org.redsalt.core.importer.Importer;
import org.redsalt.core.importer.RedSaltImportService;
import org.redsalt.core.importer.at.SparkasseATBookingsImporter;

public class RedSaltImportServiceImpl implements RedSaltImportService {

	private static HashMap<EClass, List<Importer<?>>> importerHashMap;

	public RedSaltImportServiceImpl() {
		if (importerHashMap == null) {
			importerHashMap = new HashMap<EClass, List<Importer<?>>>();

			List<Importer<?>> bookingImporters = new ArrayList<Importer<?>>();
			bookingImporters.add(new SparkasseATBookingsImporter());
			importerHashMap.put(DatamodelPackage.Literals.BOOKING,
					bookingImporters);
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.redsalt.core.importer.RedSaltImporterService#getImportersforType(
	 * org.eclipse.emf.ecore.EClass)
	 */
	@Override
	public List<Importer<?>> getImportersforType(EClass clazz) {
		return importerHashMap.get(clazz);
	}
}
