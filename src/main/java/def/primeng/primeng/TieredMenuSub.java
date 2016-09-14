package def.primeng.primeng;
import def.angular.router.Router;
import def.angular.common.Location;
import def.primeng.components.dom.domhandler.DomHandler;
public class TieredMenuSub extends jsweet.lang.Object {
    public DomHandler domHandler;
    public Router router;
    public Location location;
    public MenuItem item;
    public Boolean root;
    public TieredMenuSub(DomHandler domHandler, Router router, Location location){}
    public Object activeItem;
    public Object activeLink;
    native public void onItemMouseEnter(Object event, Object item);
    native public void onItemMouseLeave(Object event, Object link);
    native public void itemClick(Object event, MenuItem item);
    native public void listClick(Object event);
    protected TieredMenuSub(){}
}

