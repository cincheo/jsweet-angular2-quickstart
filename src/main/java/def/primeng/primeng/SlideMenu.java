package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.Renderer;
import def.primeng.components.dom.domhandler.DomHandler;
public class SlideMenu extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public Renderer renderer;
    public MenuItem[] model;
    public Boolean popup;
    public Object style;
    public String styleClass;
    public double menuWidth;
    public double viewportHeight;
    public Object effectDuration;
    public String easing;
    public String backLabel;
    public Object container;
    public Object documentClickListener;
    public Object preventDocumentDefault;
    public double left;
    public SlideMenu(ElementRef el, DomHandler domHandler, Renderer renderer){}
    native public void ngAfterViewInit();
    native public void toggle(Object event);
    native public void show(Object event);
    native public void hide();
    native public void unsubscribe(Object item);
    native public void onClick(Object event);
    native public void goBack();
    native public void ngOnDestroy();
    protected SlideMenu(){}
}

