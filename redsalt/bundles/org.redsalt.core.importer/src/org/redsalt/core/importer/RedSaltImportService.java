package org.redsalt.core.importer;

import java.util.List;

import org.eclipse.emf.ecore.EClass;

public interface RedSaltImportService {

	public abstract List<Importer<?>> getImportersforType(EClass clazz);

}