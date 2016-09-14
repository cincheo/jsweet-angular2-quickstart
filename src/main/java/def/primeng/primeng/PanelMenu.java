package def.primeng.primeng;
import def.angular.router.Router;
public class PanelMenu extends BasePanelMenuItem {
    public MenuItem[] model;
    public Object style;
    public String styleClass;
    public PanelMenu(Router router){}
    native public void unsubscribe(Object item);
    native public void ngOnDestroy();
    protected PanelMenu(){}
}

