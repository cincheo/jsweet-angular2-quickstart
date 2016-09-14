package def.primeng.primeng;

import def.angular.core.ElementRef;

public class InputText extends jsweet.lang.Object {
    public ElementRef el;
    public Boolean hover;
    public Boolean focus;
    public InputText(ElementRef el){}
    native public void onMouseover(Object e);
    native public void onMouseout(Object e);
    native public void onFocus(Object e);
    native public void onBlur(Object e);
    native public Object isDisabled();
    protected InputText(){}
}

