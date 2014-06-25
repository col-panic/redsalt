package org.redsalt.e4swt.ui.part;

import javax.annotation.PostConstruct;

import org.eclipse.e4.ui.services.EMenuService;
import org.eclipse.e4.ui.workbench.modeling.ESelectionService;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.TableViewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Table;
import org.eclipse.swt.widgets.Text;
import org.redsalt.core.services.RedSaltModelService;

public class ContactListPart {
	private TableViewer contactsTableViewer;
	private Text searchText;
	
	@PostConstruct
	public void postConstruct(Composite parent,
			final RedSaltModelService applicationManager, final EMenuService menuService, final ESelectionService selectionService ) {
		parent.setLayout(new GridLayout(1, false));
		
		Composite headerComposite = new Composite(parent, SWT.NONE);
		GridLayout gl_headerComposite = new GridLayout(2, false);
		gl_headerComposite.verticalSpacing = 0;
		gl_headerComposite.marginWidth = 0;
		gl_headerComposite.marginHeight = 0;
		headerComposite.setLayout(gl_headerComposite);
		headerComposite.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		headerComposite.setBounds(0, 0, 64, 64);
		
		searchText = new Text(headerComposite, SWT.BORDER | SWT.SEARCH);
		searchText.setLayoutData(new GridData(SWT.FILL, SWT.CENTER, true, false, 1, 1));
		
		Button addButton = new Button(headerComposite, SWT.FLAT | SWT.ARROW | SWT.DOWN);
		addButton.setText("add");
		
		// table viewer 
		contactsTableViewer = new TableViewer(parent, SWT.BORDER
				| SWT.FULL_SELECTION);
		Table table = contactsTableViewer.getTable();
		table.setLayoutData(new GridData(SWT.FILL, SWT.FILL, true, true, 1, 1));

		menuService.registerContextMenu(contactsTableViewer, "contactListPart.popupMenu");
		
		AdapterFactoryContentProvider adapterFactoryContentProvider = new AdapterFactoryContentProvider(applicationManager.getAdapterFactory());
		contactsTableViewer.setContentProvider(adapterFactoryContentProvider);
		AdapterFactoryLabelProvider adapterFactoryLabelProvider = new AdapterFactoryLabelProvider(applicationManager.getAdapterFactory());
		contactsTableViewer.setLabelProvider(adapterFactoryLabelProvider);
		
		contactsTableViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				StructuredSelection selection = (StructuredSelection) event.getSelection();
				Object firstElement = selection.getFirstElement();
				System.out.println("SETTING "+firstElement);
				selectionService.setSelection(firstElement);
			}
		});
		
		contactsTableViewer.setInput(applicationManager.getContacts());
	}
}