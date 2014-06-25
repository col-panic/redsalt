package org.redsalt.e4swt.ui.part;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.e4.ui.services.IServiceConstants;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecp.ui.view.ECPRendererException;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTView;
import org.eclipse.emf.ecp.ui.view.swt.ECPSWTViewRenderer;
import org.eclipse.emf.ecp.view.model.provider.xmi.ViewModelFileExtensionsManager;
import org.eclipse.emf.ecp.view.spi.model.VView;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.redsalt.core.datamodel.Contact;
import org.redsalt.core.services.RedSaltModelService;

public class ContactDetailPart {

	@Inject
	RedSaltModelService applicationManager;
	
	private Composite parentC;
	private VView view;
	
	@PostConstruct
	public void postConstruct(Composite parent,
			final RedSaltModelService applicationManager) {

			final URI uri = URI
					.createURI("platform:/plugin/org.redsalt.core.datamodel.viewmodel/viewmodels/Contact.view"); //$NON-NLS-1$
			final Resource resource = ViewModelFileExtensionsManager
					.loadResource(uri);
			final EObject eObject = resource.getContents().get(0);
			view = (VView) eObject;
			
			parentC = parent;

	}

	@Inject
	public void setSelection(@Optional @Named(IServiceConstants.ACTIVE_SELECTION) Contact selectedItem) {
		if(selectedItem!=null) {
			selectedItem.eAdapters().add(new Adapter() {
				
				@Override
				public void setTarget(Notifier newTarget) {
					// TODO Auto-generated method stub
					
				}
				
				@Override
				public void notifyChanged(Notification notification) {
					System.out.println(notification);
					
				}
				
				@Override
				public boolean isAdapterForType(Object type) {
					// TODO Auto-generated method stub
					return false;
				}
				
				@Override
				public Notifier getTarget() {
					// TODO Auto-generated method stub
					return null;
				}
			});
			
			selectedItem.setCity("bla!");
		}
		

		
		if(parentC==null) {
			return;
		}
		Control[] children = parentC.getChildren();
		if(children!=null && children.length>0) {
			for (Control control : children) {
				control.dispose();
			}
		}
		parentC.update();
		
		try {
			ECPSWTView render = ECPSWTViewRenderer.INSTANCE.render(parentC, selectedItem, view);
		} catch (ECPRendererException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}