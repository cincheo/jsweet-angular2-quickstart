package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.EventEmitter;
import def.primeng.components.dom.domhandler.DomHandler;
public class Terminal extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public String welcomeMessage;
    public String prompt;
    public Object style;
    public String styleClass;
    public EventEmitter<?> responseChange;
    public EventEmitter<?> handler;
    public Object[] commands;
    public String command;
    public Object container;
    public Boolean commandProcessed;
    public Terminal(ElementRef el, DomHandler domHandler){}
    native public void ngAfterViewInit();
    native public void ngAfterViewChecked();
    public String response;
    native public void handleCommand(Object event, Object container);
    native public void focus(Object element);
    protected Terminal(){}
}

