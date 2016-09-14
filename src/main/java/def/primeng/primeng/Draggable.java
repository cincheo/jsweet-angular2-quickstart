package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.EventEmitter;
import def.primeng.components.dom.domhandler.DomHandler;
public class Draggable extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public String scope;
    public String dragEffect;
    public String dragHandle;
    public EventEmitter<?> onDragStart;
    public EventEmitter<?> onDragEnd;
    public EventEmitter<?> onDrag;
    public Object handle;
    public Draggable(ElementRef el, DomHandler domHandler){}
    native public void dragStart(Object event);
    native public void drag(Object event);
    native public void dragEnd(Object event);
    native public void mouseover(Object event);
    native public void mouseleave(Object event);
    native public Boolean allowDrag();
    protected Draggable(){}
}

