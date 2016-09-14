package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.Renderer;
import def.angular.router.Router;
import def.primeng.components.dom.domhandler.DomHandler;
public class MegaMenu extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public Renderer renderer;
    public Router router;
    public MenuItem[] model;
    public Object style;
    public String styleClass;
    public String orientation;
    public Object activeItem;
    public Object activeLink;
    public MegaMenu(ElementRef el, DomHandler domHandler, Renderer renderer, Router router){}
    native public void onItemMouseEnter(Object event, Object item);
    native public void onItemMouseLeave(Object event, Object link);
    native public void itemClick(Object event, MenuItem item);
    native public void unsubscribe(Object item);
    native public void ngOnDestroy();
    native public Object getColumnClass(MenuItem menuitem);
    protected MegaMenu(){}
}

