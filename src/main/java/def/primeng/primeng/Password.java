package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.primeng.components.dom.domhandler.DomHandler;
public class Password extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public String promptLabel;
    public String weakLabel;
    public String mediumLabel;
    public String strongLabel;
    public Boolean hover;
    public Boolean focus;
    public Object panel;
    public Object meter;
    public Object info;
    public Password(ElementRef el, DomHandler domHandler){}
    native public void ngAfterViewInit();
    native public void onMouseover(Object e);
    native public void onMouseout(Object e);
    native public void onFocus(Object e);
    native public void onBlur(Object e);
    native public void onKeyup(Object e);
    native public double testStrength(String str);
    native public double normalize(Object x, Object y);
    native public Object isDisabled();
    native public void ngOnDestroy();
    protected Password(){}
}

