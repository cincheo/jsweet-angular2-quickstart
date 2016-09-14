package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.EventEmitter;
import def.angular.core.TemplateRef;
import def.primeng.components.dom.domhandler.DomHandler;
public class OrderList extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public Object[] value;
    public String header;
    public Object style;
    public String styleClass;
    public Object listStyle;
    public Boolean responsive;
    public EventEmitter<?> onReorder;
    public TemplateRef<?> itemTemplate;
    public Object hoveredItem;
    public Object[] selectedItems;
    public Boolean movedUp;
    public Boolean movedDown;
    public Object listContainer;
    public OrderList(ElementRef el, DomHandler domHandler){}
    native public void ngAfterViewInit();
    native public void ngAfterViewChecked();
    native public void onItemClick(Object event, Object item);
    native public Boolean isSelected(Object item);
    native public double findIndexInList(Object item, Object list);
    native public void moveUp(Object event, Object listElement);
    native public void moveTop(Object event, Object listElement);
    native public void moveDown(Object event, Object listElement);
    native public void moveBottom(Object event, Object listElement);
    protected OrderList(){}
}

