package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.EventEmitter;
import def.primeng.components.dom.domhandler.DomHandler;
public class Droppable extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public String scope;
    public String dropEffect;
    public EventEmitter<?> onDragEnter;
    public EventEmitter<?> onDragLeave;
    public EventEmitter<?> onDrop;
    public EventEmitter<?> onDragOver;
    public Droppable(ElementRef el, DomHandler domHandler){}
    native public void drop(Object event);
    native public void dragEnter(Object event);
    native public void dragLeave(Object event);
    native public void dragOver(Object event);
    native public Boolean allowDrop(Object event);
    protected Droppable(){}
}

