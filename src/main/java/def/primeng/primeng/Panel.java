package def.primeng.primeng;
import def.angular.core.EventEmitter;
public class Panel extends jsweet.lang.Object {
    public Boolean toggleable;
    public String header;
    public Boolean collapsed;
    public Object style;
    public String styleClass;
    public EventEmitter<?> collapsedChange;
    public EventEmitter<?> onBeforeToggle;
    public EventEmitter<?> onAfterToggle;
    public Boolean hoverToggler;
    public Boolean animating;
    native public void toggle(Object event);
    native public void expand(Object event);
    native public void collapse(Object event);
}

