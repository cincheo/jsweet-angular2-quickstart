package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.primeng.components.dom.domhandler.DomHandler;
public class Button extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public String icon;
    public String iconPos;
    public String _label;
    public Boolean hover;
    public Boolean focus;
    public Boolean active;
    public Boolean initialized;
    public Button(ElementRef el, DomHandler domHandler){}
    native public void ngAfterViewInit();
    native public void onMouseenter(Object e);
    native public void onMouseleave(Object e);
    native public void onMouseDown(Object e);
    native public void onMouseUp(Object e);
    native public void onFocus(Object e);
    native public void onBlur(Object e);
    native public Object isDisabled();
    native public String getStyleClass();
    public String label;
    native public void ngOnDestroy();
    protected Button(){}
}

