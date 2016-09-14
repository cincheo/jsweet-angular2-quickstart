package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.TemplateRef;
import def.primeng.components.dom.domhandler.DomHandler;
public class PickList extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public Object[] source;
    public Object[] target;
    public String sourceHeader;
    public String targetHeader;
    public Boolean responsive;
    public Object style;
    public String styleClass;
    public Object sourceStyle;
    public Object targetStyle;
    public TemplateRef<?> itemTemplate;
    public Object hoveredItem;
    public Object[] selectedItems;
    public Object reorderedListElement;
    public Boolean movedUp;
    public Boolean movedDown;
    public PickList(ElementRef el, DomHandler domHandler){}
    native public void ngAfterViewChecked();
    native public void selectItem(Object event, Object item);
    native public void moveUp(Object listElement, Object list);
    native public void moveTop(Object listElement, Object list);
    native public void moveDown(Object listElement, Object list);
    native public void moveBottom(Object listElement, Object list);
    native public void moveRight(Object targetListElement);
    native public void moveAllRight();
    native public void moveLeft(Object sourceListElement);
    native public void moveAllLeft();
    native public Boolean isSelected(Object item);
    native public double findIndexInSelection(Object item);
    native public double findIndexInList(Object item, Object list);
    native public void ngOnDestroy();
    protected PickList(){}
}

