package def.primeng.primeng;
import def.angular.router.Router;
public class TabMenu extends jsweet.lang.Object {
    public Router router;
    public MenuItem[] model;
    public MenuItem activeItem;
    public Boolean popup;
    public Object style;
    public String styleClass;
    public TabMenu(Router router){}
    public MenuItem hoveredItem;
    native public void ngOnInit();
    native public void itemClick(Object event, MenuItem item);
    native public void ngOnDestroy();
    native public void unsubscribe(Object item);
    protected TabMenu(){}
}

