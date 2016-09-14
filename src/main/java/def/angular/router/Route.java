package def.angular.router;

import def.angular.core.Type;
import jsweet.lang.Interface;
import jsweet.lang.ObjectType;
import jsweet.lang.Optional;

@Interface
public class Route {

	@Optional
	String path;
	@Optional
	String pathMatch;
	@Optional
	Type<?> component;
	@Optional
	String redirectTo;
	@Optional
	String outlet;
	@Optional
	Object[] canActivate;
	@Optional
	Object[] canActivateChild;
	@Optional
	Object[] canDeactivate;
	@Optional
	Object[] canLoad;
	@Optional
	Data data;
	@Optional
	ResolveData resolve;
	@Optional
	Route[] children;
	@Optional
	Object loadChildren;

	@ObjectType
	class Data extends jsweet.lang.Object {
		public native Object $get(String name);
	}

	@ObjectType
	class ResolveData extends jsweet.lang.Object {
		public native Object $get(String name);
	}

}
