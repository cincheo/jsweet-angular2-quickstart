package def.primeng.primeng;
import def.angular.core.EventEmitter;
public class Fieldset extends jsweet.lang.Object {
    public String legend;
    public Boolean toggleable;
    public Boolean collapsed;
    public EventEmitter<?> onBeforeToggle;
    public EventEmitter<?> onAfterToggle;
    public Object style;
    public String styleClass;
    public Boolean hover;
    public Boolean animating;
    native public void onLegendMouseenter(Object event);
    native public void onLegendMouseleave(Object event);
    native public void toggle(Object event);
    native public void expand(Object event);
    native public void collapse(Object event);
}

