package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.Renderer;
import def.primeng.components.dom.domhandler.DomHandler;
public class ContextMenu extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public Renderer renderer;
    public MenuItem[] model;
    public Boolean global;
    public Object style;
    public String styleClass;
    public Boolean visible;
    public double left;
    public double top;
    public Object container;
    public Object documentClickListener;
    public Object documentRightClickListener;
    public ContextMenu(ElementRef el, DomHandler domHandler, Renderer renderer){}
    native public void ngAfterViewInit();
    native public void toggle(Object event);
    native public void show(Object event);
    native public void hide();
    native public void unsubscribe(Object item);
    native public void ngOnDestroy();
    protected ContextMenu(){}
}

