package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.EventEmitter;
import def.primeng.components.dom.domhandler.DomHandler;
import jsweet.lang.Function;
public class Spinner extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public EventEmitter<?> onChange;
    public double step;
    public double min;
    public double max;
    public double maxlength;
    public double size;
    public Boolean disabled;
    public double value;
    public Function onModelChange;
    public Function onModelTouched;
    public Boolean hoverUp;
    public Boolean activeUp;
    public Boolean hoverDown;
    public Boolean activeDown;
    public double precision;
    public Object timer;
    public Object inputtext;
    public Spinner(ElementRef el, DomHandler domHandler){}
    native public void ngAfterViewInit();
    native public void repeat(Object interval, Object dir, Object input);
    native public void spin(double dir, Object inputElement);
    native public String toFixed(double value, double precision);
    native public void onUpButtonMousedown(Object event, Object input);
    native public void onUpButtonMouseup(Object event);
    native public void onUpButtonMouseenter(Object event);
    native public void onUpButtonMouseleave(Object event);
    native public void onDownButtonMousedown(Object event, Object input);
    native public void onDownButtonMouseup(Object event);
    native public void onDownButtonMouseenter(Object event);
    native public void onDownButtonMouseleave(Object event);
    native public void onInputKeydown(Object event, Object inputElement);
    native public void onInput(Object event);
    native public void onBlur(Object inputElement);
    native public double parseValue(String val);
    native public void handleChange(Object event);
    native public void clearTimer();
    native public void writeValue(Object value);
    native public void registerOnChange(Function fn);
    native public void registerOnTouched(Function fn);
    protected Spinner(){}
}

