package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.EventEmitter;
public class Accordion extends jsweet.lang.Object {
    public ElementRef el;
    public Boolean multiple;
    public EventEmitter<?> onClose;
    public EventEmitter<?> onOpen;
    public Object style;
    public String styleClass;
    public AccordionTab[] tabs;
    public Accordion(ElementRef el){}
    native public void addTab(AccordionTab tab);
    protected Accordion(){}
}

