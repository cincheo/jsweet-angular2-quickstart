package def.primeng.primeng;
import def.angular.router.Router;
public class SlideMenuSub extends jsweet.lang.Object {
    public SlideMenu slideMenu;
    public Router router;
    public MenuItem item;
    public Boolean root;
    public String backLabel;
    public String menuWidth;
    public Object effectDuration;
    public String easing;
    public SlideMenuSub(SlideMenu slideMenu, Router router){}
    public Object activeItem;
    public Object hoveredLink;
    native public void itemClick(Object event, MenuItem item, Object listitem);
    native public void ngOnDestroy();
    protected SlideMenuSub(){}
}

