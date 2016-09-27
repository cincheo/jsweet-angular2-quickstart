package app;

import static def.angular.platform_browser_dynamic.Globals.platformBrowserDynamic;

public class Globals {

	static {
		platformBrowserDynamic().bootstrapModule(AppModule.class);
	}

}
