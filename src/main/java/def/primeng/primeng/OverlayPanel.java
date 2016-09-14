package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.EventEmitter;
import def.angular.core.Renderer;
import def.primeng.components.dom.domhandler.DomHandler;
public class OverlayPanel extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public Renderer renderer;
    public Boolean dismissable;
    public Boolean showCloseIcon;
    public Object style;
    public String styleClass;
    public Object appendTo;
    public EventEmitter<?> onBeforeShow;
    public EventEmitter<?> onAfterShow;
    public EventEmitter<?> onBeforeHide;
    public EventEmitter<?> onAfterHide;
    public Object container;
    public Boolean visible;
    public Boolean hoverCloseIcon;
    public Object documentClickListener;
    public Boolean selfClick;
    public Boolean targetEvent;
    public Object target;
    public OverlayPanel(ElementRef el, DomHandler domHandler, Renderer renderer){}
    native public void ngOnInit();
    native public void ngAfterViewInit();
    native public void toggle(Object event, Object target);
    native public void show(Object event, Object target);
    native public void hide();
    native public void onPanelClick();
    native public void onCloseClick(Object event);
    native public void ngOnDestroy();
    native public void toggle(Object event);
    native public void show(Object event);
    protected OverlayPanel(){}
}

