package def.primeng.primeng;

import javax.swing.Renderer;

import def.angular.core.ElementRef;
import def.angular.core.EventEmitter;
import def.angular.core.IterableDiffers;
import def.angular.core.TemplateRef;
import def.primeng.components.dom.domhandler.DomHandler;
import jsweet.lang.Function;
public class AutoComplete extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public Renderer renderer;
    public double minLength;
    public double delay;
    public Object style;
    public String styleClass;
    public Object inputStyle;
    public String inputStyleClass;
    public String placeholder;
    public double readonly;
    public Boolean disabled;
    public double maxlength;
    public double size;
    public Object[] suggestions;
    public EventEmitter<?> completeMethod;
    public EventEmitter<?> onSelect;
    public EventEmitter<?> onUnselect;
    public EventEmitter<?> onDropdownClick;
    public String field;
    public String scrollHeight;
    public Boolean dropdown;
    public Boolean multiple;
    public TemplateRef<?> itemTemplate;
    public Object value;
    public Function onModelChange;
    public Function onModelTouched;
    public Object timeout;
    public Object differ;
    public Object panel;
    public Object input;
    public Object multipleContainer;
    public Boolean panelVisible;
    public Object documentClickListener;
    public Boolean suggestionsUpdated;
    public Object highlightOption;
    public Boolean highlightOptionChanged;
    public AutoComplete(ElementRef el, DomHandler domHandler, IterableDiffers differs, Renderer renderer){}
    native public void ngDoCheck();
    native public void ngAfterViewInit();
    native public void ngAfterViewChecked();
    native public void writeValue(Object value);
    native public void registerOnChange(Function fn);
    native public void registerOnTouched(Function fn);
    native public void onInput(Object event);
    native public void search(Object event, String query);
    native public void selectItem(Object option);
    native public void show();
    native public void align();
    native public void hide();
    native public void handleDropdownClick(Object event);
    native public void removeItem(Object item);
    native public Object resolveFieldData(Object data);
    native public void onKeydown(Object event);
    native public Boolean isSelected(Object val);
    native public double findOptionIndex(Object option);
    native public void ngOnDestroy();
    protected AutoComplete(){}
}

