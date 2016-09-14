package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.EventEmitter;
import def.angular.core.Renderer;
import def.angular.router.Router;
import def.primeng.components.dom.domhandler.DomHandler;
public class SplitButton extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public Renderer renderer;
    public Router router;
    public MenuItem[] model;
    public String icon;
    public String iconPos;
    public String label;
    public EventEmitter<?> onClick;
    public Object style;
    public String styleClass;
    public Object menuStyle;
    public String menuStyleClass;
    public Boolean hoverDefaultBtn;
    public Boolean focusDefaultBtn;
    public Boolean activeDefaultBtn;
    public Boolean hoverDropdown;
    public Boolean focusDropdown;
    public Boolean activeDropdown;
    public Object hoveredItem;
    public Boolean menuVisible;
    public Object documentClickListener;
    public SplitButton(ElementRef el, DomHandler domHandler, Renderer renderer, Router router){}
    native public void ngOnInit();
    native public void onDefaultButtonClick(Object event);
    native public void itemClick(Object event, MenuItem item);
    native public void onDropdownClick(Object event, Object menu, Object container);
    native public void ngOnDestroy();
    protected SplitButton(){}
}

