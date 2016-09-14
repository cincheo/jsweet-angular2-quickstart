package def.primeng.primeng;
import def.angular.router.Router;
import def.primeng.components.dom.domhandler.DomHandler;
public class MenubarSub extends jsweet.lang.Object {
    public DomHandler domHandler;
    public Router router;
    public MenuItem item;
    public Boolean root;
    public MenubarSub(DomHandler domHandler, Router router){}
    public Object activeItem;
    public Object activeLink;
    native public void onItemMouseEnter(Object event, Object item);
    native public void onItemMouseLeave(Object event, Object link);
    native public void itemClick(Object event, MenuItem item);
    native public void listClick(Object event);
    protected MenubarSub(){}
}

