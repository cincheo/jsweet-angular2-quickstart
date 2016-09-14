package def.primeng.primeng;

import def.angular.core.TemplateRef;
import def.angular.core.ViewContainerRef;

public class TemplateLoader extends jsweet.lang.Object {
    public ViewContainerRef viewContainer;
    public TemplateRef<?> template;
    public TemplateLoader(ViewContainerRef viewContainer){}
    native public void ngOnInit();
    protected TemplateLoader(){}
}

