package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.EventEmitter;
import def.angular.core.TemplateRef;
import def.primeng.components.dom.domhandler.DomHandler;
import jsweet.lang.Function;
public class Listbox extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public SelectItem[] options;
    public Boolean multiple;
    public Object style;
    public String styleClass;
    public String disabled;
    public EventEmitter<?> onChange;
    public TemplateRef<?> itemTemplate;
    public Object value;
    public Function onModelChange;
    public Function onModelTouched;
    public Boolean valueChanged;
    public Object hoveredItem;
    public Listbox(ElementRef el, DomHandler domHandler){}
    native public void writeValue(Object value);
    native public void registerOnChange(Function fn);
    native public void registerOnTouched(Function fn);
    native public void onOptionClick(Object event, Object option);
    native public void onOptionClickSingle(Object event, Object option);
    native public void onOptionClickMultiple(Object event, Object option);
    native public Boolean isSelected(SelectItem option);
    native public double findIndex(SelectItem option);
    protected Listbox(){}
}

