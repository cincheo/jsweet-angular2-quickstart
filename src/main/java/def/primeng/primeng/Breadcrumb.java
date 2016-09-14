package def.primeng.primeng;
import def.angular.router.Router;
public class Breadcrumb extends jsweet.lang.Object {
    public Router router;
    public MenuItem[] model;
    public Object style;
    public String styleClass;
    public Breadcrumb(Router router){}
    native public void itemClick(Object event, MenuItem item);
    native public void ngOnDestroy();
    protected Breadcrumb(){}
}

