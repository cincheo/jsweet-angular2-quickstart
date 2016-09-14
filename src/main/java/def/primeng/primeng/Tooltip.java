package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.primeng.components.dom.domhandler.DomHandler;
public class Tooltip extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public String text;
    public String tooltipPosition;
    public String tooltipEvent;
    public Object container;
    public Tooltip(ElementRef el, DomHandler domHandler){}
    native public void onMouseEnter(Object e);
    native public void onMouseLeave(Object e);
    native public void onFocus(Object e);
    native public void onBlur(Object e);
    native public void show();
    native public void hide();
    native public void create();
    native public void ngOnDestroy();
    protected Tooltip(){}
}

