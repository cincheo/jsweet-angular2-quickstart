package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.EventEmitter;
import def.angular.core.NgZone;
import def.angular.core.SimpleChange;
import jsweet.lang.Function;
public class Calendar extends jsweet.lang.Object {
    public ElementRef el;
    public NgZone zone;
    public Boolean readonlyInput;
    public Object style;
    public String styleClass;
    public Object inputStyle;
    public String inputStyleClass;
    public String placeholder;
    public Boolean inline;
    public String showAnim;
    public String dateFormat;
    public Boolean showButtonPanel;
    public Boolean monthNavigator;
    public Boolean yearNavigator;
    public double numberOfMonths;
    public Boolean showWeek;
    public Boolean showOtherMonths;
    public Boolean selectOtherMonths;
    public Object defaultDate;
    public Object minDate;
    public Object maxDate;
    public Object disabled;
    public Boolean showIcon;
    public String timeFormat;
    public Boolean timeOnly;
    public double stepHour;
    public double stepMinute;
    public double stepSecond;
    public double hourMin;
    public double hourMax;
    public double minuteMin;
    public double minuteMax;
    public double secondMin;
    public double secondMax;
    public double hourGrid;
    public double minuteGrid;
    public double secondGrid;
    public String timeControlType;
    public Boolean horizontalTimeControls;
    public String minTime;
    public String maxTime;
    public String[] timezoneList;
    public Object locale;
    public String icon;
    public String yearRange;
    public EventEmitter<?> onBlur;
    public EventEmitter<?> onSelect;
    public String value;
    public Function onModelChange;
    public Function onModelTouched;
    public Boolean hovered;
    public Boolean focused;
    public Boolean initialized;
    public Object calendarElement;
    public Calendar(ElementRef el, NgZone zone){}
    native public void ngAfterViewInit();
    native public void onInput(Object event);
    native public void handleBlur(Object event);
    native public void writeValue(Object value);
    native public void registerOnChange(Function fn);
    native public void registerOnTouched(Function fn);
    native public void ngOnChanges(Changes changes);
    native public void ngOnDestroy();
    native public void onButtonClick(Object event, Object input);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Changes extends jsweet.lang.Object {
        native public SimpleChange $get(String key);
    }
    protected Calendar(){}
}

