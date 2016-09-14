package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.EventEmitter;
import jsweet.lang.Function;
public class InputMask extends jsweet.lang.Object {
    public ElementRef el;
    public String mask;
    public String style;
    public String styleClass;
    public String placeholder;
    public String slotChar;
    public String alias;
    public Object options;
    public Boolean unmask;
    public Boolean clearMaskOnLostFocus;
    public Boolean clearIncomplete;
    public double size;
    public double maxlength;
    public String tabindex;
    public Boolean disabled;
    public Boolean readonly;
    public EventEmitter<?> onComplete;
    public EventEmitter<?> onInComplete;
    public Object value;
    public Function onModelChange;
    public Function onModelTouched;
    public InputMask(ElementRef el){}
    native public void ngAfterViewInit();
    native public String getUnmasekd();
    native public void writeValue(Object value);
    native public void registerOnChange(Function fn);
    native public void registerOnTouched(Function fn);
    native public void onBlur();
    native public void ngOnDestroy();
    protected InputMask(){}
}

