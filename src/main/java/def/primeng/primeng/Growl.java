package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.IterableDiffers;
import def.primeng.components.dom.domhandler.DomHandler;
public class Growl extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public Boolean sticky;
    public double life;
    public Message[] value;
    public Object differ;
    public double zIndex;
    public Object container;
    public Boolean stopDoCheckPropagation;
    public Object timeout;
    public Growl(ElementRef el, DomHandler domHandler, IterableDiffers differs){}
    native public void ngAfterViewInit();
    native public void ngDoCheck();
    native public void remove(Message msg, Object msgel);
    native public void removeAll();
    native public double findMessageIndex(Message msg);
    native public void ngOnDestroy();
    protected Growl(){}
}

