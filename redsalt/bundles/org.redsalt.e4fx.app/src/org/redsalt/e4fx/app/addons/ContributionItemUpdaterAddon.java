package org.redsalt.e4fx.app.addons;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.contexts.RunAndTrack;

public class ContributionItemUpdaterAddon {
	
//	private HandlerRunAndTrack handlerRunAndTrack = new HandlerRunAndTrack();
	
//	@Inject
//	public void handleHandlerEvent(@Optional @EventTopic(UIEvents.Handler) Object event) {
//		System.out.println(event);
//	}
	
//	@Inject
//	public void initialize(IEclipseContext mainContext) {
//		mainContext.runAndTrack(new RunAndTrack() {
//			
//			@Override
//			public boolean changed(IEclipseContext context) {
//				System.out.println(context.get("handler::command.add"));
//				return true;
//			}
//		});
//	}
	
//	@Inject
//	EModelService modelService;
//	
//	@Inject
//	public void bla(@Optional @Active @Named("handler::command.add") Object value, MApplication application) {
//		System.out.println(value);
//	
//		
//		List<MHandledItem> findElements = modelService.findElements(application, null, MHandledItem.class, null);
//		for (MHandledItem mHandledItem : findElements) {
//			// find @HandlerUpdater method
//			// execute value.method(findElements);
//			System.out.println(mHandledItem);
//		}
//		
//	}
	
//	private class HandlerRunAndTrack extends RunAndTrack {
//
//	@Override
//	public boolean changed(IEclipseContext context) {
//		final Object obj = context.get("handler::command.add");
//		context.set("handler::command.add", obj);
//		System.out.println(obj);
//		return true;
//	}
//		
//	}
}
