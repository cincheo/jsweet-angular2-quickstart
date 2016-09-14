package def.primeng.primeng;
import def.angular.core.EventEmitter;
import jsweet.lang.Function;
public class SelectButton extends jsweet.lang.Object {
    public SelectItem[] options;
    public double tabindex;
    public Boolean multiple;
    public Object style;
    public String styleClass;
    public Boolean disabled;
    public EventEmitter<?> onChange;
    public Object value;
    public Function onModelChange;
    public Function onModelTouched;
    public Object hoveredItem;
    native public void writeValue(Object value);
    native public void registerOnChange(Function fn);
    native public void registerOnTouched(Function fn);
    native public void onItemClick(Object event, SelectItem option);
    native public Boolean isSelected(SelectItem option);
    native public double findItemIndex(SelectItem option);
}

