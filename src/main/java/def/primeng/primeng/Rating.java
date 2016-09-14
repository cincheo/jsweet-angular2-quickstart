package def.primeng.primeng;
import def.angular.core.EventEmitter;
import jsweet.lang.Function;
public class Rating extends jsweet.lang.Object {
    public Boolean disabled;
    public Boolean readonly;
    public double stars;
    public Boolean cancel;
    public EventEmitter<?> onRate;
    public EventEmitter<?> onCancel;
    public double value;
    public Function onModelChange;
    public Function onModelTouched;
    public double[] starsArray;
    public Boolean hoverCancel;
    native public void ngOnInit();
    native public void rate(Object event, double i);
    native public void clear(Object event);
    native public void writeValue(Object value);
    native public void registerOnChange(Function fn);
    native public void registerOnTouched(Function fn);
}

