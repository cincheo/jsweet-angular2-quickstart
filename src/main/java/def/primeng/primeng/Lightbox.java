package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.Renderer;
import def.primeng.components.dom.domhandler.DomHandler;
public class Lightbox extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public Renderer renderer;
    public Object[] images;
    public String type;
    public Object style;
    public String styleClass;
    public String easing;
    public Object effectDuration;
    public Boolean visible;
    public Boolean loading;
    public Object currentImage;
    public String captionText;
    public Object zindex;
    public Object panel;
    public double index;
    public Object mask;
    public Boolean preventDocumentClickListener;
    public Object documentClickListener;
    public Lightbox(ElementRef el, DomHandler domHandler, Renderer renderer){}
    native public void onImageClick(Object event, Object image, Object i, Object content);
    native public void ngAfterViewInit();
    native public void onLinkClick(Object event, Object content);
    native public void displayImage(Object image);
    native public void show();
    native public void hide(Object event);
    native public void center();
    native public void onImageLoad(Object event, Object content);
    native public void prev(Object placeholder);
    native public void next(Object placeholder);
    public Boolean leftVisible;
    public Boolean rightVisible;
    native public void ngOnDestroy();
    protected Lightbox(){}
}

