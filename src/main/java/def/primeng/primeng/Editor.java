package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.EventEmitter;
import def.primeng.components.dom.domhandler.DomHandler;
import jsweet.lang.Function;
public class Editor extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public EventEmitter<?> onTextChange;
    public EventEmitter<?> onSelectionChange;
    public Object toolbar;
    public Object style;
    public String styleClass;
    public String placeholder;
    public Boolean readOnly;
    public String[] formats;
    public String value;
    public Function onModelChange;
    public Function onModelTouched;
    public Object quill;
    public Editor(ElementRef el, DomHandler domHandler){}
    native public void ngAfterViewInit();
    native public void writeValue(Object value);
    native public void registerOnChange(Function fn);
    native public void registerOnTouched(Function fn);
    protected Editor(){}
}

