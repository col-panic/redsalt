package org.redsalt.core.importer;

import java.io.InputStream;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;

public interface Importer<T> {
	
	public String getImporterId();
	
	public String getImporterLabel();

	public IStatus importFromInputStream(InputStream is, EObject parent,
			EReference accountsAccounts, AbstractImporterCallback iac,
			IProgressMonitor monitor);

}
