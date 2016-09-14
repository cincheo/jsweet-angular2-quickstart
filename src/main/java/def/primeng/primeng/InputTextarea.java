package def.primeng.primeng;

import def.angular.core.ElementRef;

public class InputTextarea extends jsweet.lang.Object {
    public ElementRef el;
    public Boolean autoResize;
    public double rows;
    public double cols;
    public Boolean hover;
    public Boolean focus;
    public double rowsDefault;
    public double colsDefault;
    public InputTextarea(ElementRef el){}
    native public void ngOnInit();
    native public void onMouseover(Object e);
    native public void onMouseout(Object e);
    native public void onFocus(Object e);
    native public void onBlur(Object e);
    native public Object isDisabled();
    native public void onKeyup(Object e);
    native public void resize();
    protected InputTextarea(){}
}

