package app;

import static def.angular.platform_browser_dynamic.Globals.platformBrowserDynamic;

import app.module.AppModule;

public class Globals {

	static {
		platformBrowserDynamic().bootstrapModule(AppModule.class);
	}

}
