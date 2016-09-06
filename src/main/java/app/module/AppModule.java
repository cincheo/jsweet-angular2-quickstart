package app.module;

import app.component.AppComponent;
import def.angular.core.NgModule;
import def.angular.platform_browser.BrowserModule;

@NgModule(
	  imports = { BrowserModule.class },
	  declarations = { AppComponent.class },
	  bootstrap = { AppComponent.class }
	)
public class AppModule {

}
