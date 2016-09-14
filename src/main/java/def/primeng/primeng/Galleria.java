package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.EventEmitter;
import def.angular.core.IterableDiffers;
import def.primeng.components.dom.domhandler.DomHandler;
public class Galleria extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public Object[] images;
    public Object style;
    public String styleClass;
    public double panelWidth;
    public double panelHeight;
    public double frameWidth;
    public double frameHeight;
    public double activeIndex;
    public Boolean showFilmstrip;
    public Boolean autoPlay;
    public double transitionInterval;
    public Boolean showCaption;
    public EventEmitter<java.lang.Object> onImageClicked;
    public Object differ;
    public Boolean slideshowActive;
    public Object container;
    public Object panelWrapper;
    public Object panels;
    public Object caption;
    public Object stripWrapper;
    public Object strip;
    public Object frames;
    public Object interval;
    public double stripLeft;
    public Boolean imagesChanged;
    public Boolean initialized;
    public Galleria(ElementRef el, DomHandler domHandler, IterableDiffers differs){}
    native public void ngAfterViewChecked();
    native public void ngDoCheck();
    native public void ngAfterViewInit();
    native public void render();
    native public void startSlideshow();
    native public void stopSlideshow();
    native public void clickNavRight();
    native public void clickNavLeft();
    native public void frameClick(Object frame);
    native public void prev();
    native public void next();
    native public void select(Object index, Object reposition);
    native public void clickImage(Object event, Object image, Object i);
    native public void ngOnDestroy();
    protected Galleria(){}
}

