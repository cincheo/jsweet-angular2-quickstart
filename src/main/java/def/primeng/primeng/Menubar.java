package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.Renderer;
import def.primeng.components.dom.domhandler.DomHandler;
public class Menubar extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public Renderer renderer;
    public MenuItem[] model;
    public Object style;
    public String styleClass;
    public Menubar(ElementRef el, DomHandler domHandler, Renderer renderer){}
    native public void unsubscribe(Object item);
    native public void ngOnDestroy();
    protected Menubar(){}
}

