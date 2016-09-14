package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.Renderer;
import def.angular.router.Router;
import def.primeng.components.dom.domhandler.DomHandler;
public class Menu extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public Renderer renderer;
    public Router router;
    public MenuItem[] model;
    public Boolean popup;
    public Object style;
    public String styleClass;
    public Object appendTo;
    public Object container;
    public Object documentClickListener;
    public Object preventDocumentDefault;
    public Menu(ElementRef el, DomHandler domHandler, Renderer renderer, Router router){}
    native public void ngAfterViewInit();
    native public void toggle(Object event);
    native public void show(Object event);
    native public void hide();
    native public void itemClick(Object event, MenuItem item);
    native public void ngOnDestroy();
    native public Boolean hasSubMenu();
    native public void unsubscribe(Object item);
    protected Menu(){}
}

