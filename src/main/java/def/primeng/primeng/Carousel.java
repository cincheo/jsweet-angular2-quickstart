package def.primeng.primeng;

import def.angular.core.ElementRef;
import def.angular.core.IterableDiffers;
import def.angular.core.Renderer;
import def.angular.core.TemplateRef;
import def.primeng.components.dom.domhandler.DomHandler;
public class Carousel extends jsweet.lang.Object {
    public ElementRef el;
    public DomHandler domHandler;
    public Renderer renderer;
    public Object[] value;
    public double numVisible;
    public double firstVisible;
    public String headerText;
    public Boolean circular;
    public double breakpoint;
    public Boolean responsive;
    public double autoplayInterval;
    public Object effectDuration;
    public String easing;
    public double pageLinks;
    public Object style;
    public String styleClass;
    public TemplateRef<?> itemTemplate;
    public Object container;
    public Object left;
    public Object viewport;
    public Object itemsContainer;
    public Object items;
    public Object columns;
    public double page;
    public Object valuesChanged;
    public Object interval;
    public Object[] anchorPageLinks;
    public Object[] mobileDropdownOptions;
    public Object[] selectDropdownOptions;
    public Boolean shrinked;
    public Object documentResponsiveListener;
    public Object differ;
    public Carousel(ElementRef el, DomHandler domHandler, IterableDiffers differs, Renderer renderer){}
    native public void ngDoCheck();
    native public void ngAfterViewChecked();
    native public void ngOnInit();
    native public void ngAfterViewInit();
    native public void updateLinks();
    native public void updateDropdown();
    native public void updateMobileDropdown();
    native public void render();
    native public void calculateItemWidths();
    native public void onNextNav();
    native public void onPrevNav();
    native public void setPageWithLink(Object event, double p);
    native public void setPage(Object p, Boolean enforce);
    native public void onDropdownChange(String val);
    public Boolean displayPageLinks;
    public Boolean displayPageDropdown;
    public double totalPages;
    native public Boolean routerDisplay();
    native public void updateState();
    native public void startAutoplay();
    native public void stopAutoplay();
    native public void ngOnDestroy();
    native public void setPage(Object p);
    protected Carousel(){}
}

