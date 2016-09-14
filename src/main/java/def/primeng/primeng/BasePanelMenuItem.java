package def.primeng.primeng;
import def.angular.router.Router;
public class BasePanelMenuItem extends jsweet.lang.Object {
    public Router router;
    public BasePanelMenuItem(Router router){}
    native public void handleClick(Object event, Object item);
    protected BasePanelMenuItem(){}
}

