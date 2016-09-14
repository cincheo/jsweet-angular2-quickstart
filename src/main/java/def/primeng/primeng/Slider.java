package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.EventEmitter;
import def.angular.core.SimpleChange;
import jsweet.lang.Function;
public class Slider extends jsweet.lang.Object {
    public ElementRef el;
    public Boolean animate;
    public Boolean disabled;
    public double min;
    public double max;
    public String orientation;
    public double step;
    public Boolean range;
    public Object style;
    public String styleClass;
    public EventEmitter<?> onChange;
    public EventEmitter<?> onSlideEnd;
    public Object value;
    public Function onModelChange;
    public Function onModelTouched;
    public Boolean initialized;
    public Slider(ElementRef el){}
    native public void ngAfterViewInit();
    native public void writeValue(Object value);
    native public void registerOnChange(Function fn);
    native public void registerOnTouched(Function fn);
    native public void ngOnChanges(Changes changes);
    native public void ngOnDestroy();
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Changes extends jsweet.lang.Object {
        native public SimpleChange $get(String key);
    }
    protected Slider(){}
}

