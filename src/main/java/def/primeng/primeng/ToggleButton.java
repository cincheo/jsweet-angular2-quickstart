package def.primeng.primeng;
import def.angular.core.EventEmitter;
import jsweet.lang.Function;
public class ToggleButton extends jsweet.lang.Object {
    public String onLabel;
    public String offLabel;
    public String onIcon;
    public String offIcon;
    public Boolean disabled;
    public Object style;
    public String styleClass;
    public EventEmitter<?> onChange;
    public Boolean checked;
    public Function onModelChange;
    public Function onModelTouched;
    public Boolean hover;
    native public String getIconClass();
    native public void toggle(Object event);
    native public void writeValue(Object value);
    native public void registerOnChange(Function fn);
    native public void registerOnTouched(Function fn);
}

