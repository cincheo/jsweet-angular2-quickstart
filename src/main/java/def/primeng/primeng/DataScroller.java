package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.EventEmitter;
import def.angular.core.IterableDiffers;
import def.angular.core.Renderer;
import def.angular.core.TemplateRef;
import def.primeng.components.dom.domhandler.DomHandler;
public class DataScroller extends jsweet.lang.Object {
    public ElementRef el;
    public Renderer renderer;
    public DomHandler domHandler;
    public Object[] value;
    public double rows;
    public Boolean lazy;
    public EventEmitter<?> onLazyLoad;
    public Object style;
    public String styleClass;
    public double buffer;
    public Boolean inline;
    public Object scrollHeight;
    public Object header;
    public Object footer;
    public TemplateRef<?> itemTemplate;
    public Object loader;
    public Object[] dataToRender;
    public double first;
    public Object differ;
    public Object scrollFunction;
    public Object contentElement;
    public DataScroller(ElementRef el, IterableDiffers differs, Renderer renderer, DomHandler domHandler){}
    native public void ngAfterViewInit();
    native public void ngDoCheck();
    native public void load();
    native public Boolean isEmpty();
    native public Object createLazyLoadMetadata();
    native public void bindScrollListener();
    native public void ngOnDestroy();
    protected DataScroller(){}
}

