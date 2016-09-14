package def.primeng.primeng;

import def.angular.core.TemplateRef;
import def.angular.core.ViewContainerRef;

public class TemplateWrapper extends jsweet.lang.Object {
    public ViewContainerRef viewContainer;
    public Object item;
    public TemplateRef<?> templateRef;
    public TemplateWrapper(ViewContainerRef viewContainer){}
    native public void ngOnInit();
    protected TemplateWrapper(){}
}

