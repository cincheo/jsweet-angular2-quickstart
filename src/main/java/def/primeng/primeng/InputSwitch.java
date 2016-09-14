package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.EventEmitter;
import def.primeng.components.dom.domhandler.DomHandler;
import jsweet.lang.Function;
public class InputSwitch extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public String onLabel;
    public String offLabel;
    public Boolean disabled;
    public Object style;
    public String styleClass;
    public EventEmitter<?> onChange;
    public Boolean checked;
    public Boolean focused;
    public Function onModelChange;
    public Function onModelTouched;
    public Object container;
    public Object handle;
    public Object onContainer;
    public Object offContainer;
    public Object onLabelChild;
    public Object offLabelChild;
    public Object offset;
    public Boolean initialized;
    public InputSwitch(ElementRef el, DomHandler domHandler){}
    native public void ngAfterViewInit();
    native public void toggle(Object event, Object checkbox);
    native public void checkUI();
    native public void uncheckUI();
    native public void onFocus(Object event);
    native public void onBlur(Object event);
    native public void writeValue(Object checked);
    native public void registerOnChange(Function fn);
    native public void registerOnTouched(Function fn);
    protected InputSwitch(){}
}

