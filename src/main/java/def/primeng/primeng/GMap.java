package def.primeng.primeng;
import def.angular.core.ChangeDetectorRef;
import def.angular.core.ElementRef;
import def.angular.core.EventEmitter;
import def.angular.core.IterableDiffers;
import def.angular.core.NgZone;
public class GMap extends jsweet.lang.Object {
    public ElementRef el;
    public ChangeDetectorRef cd;
    public NgZone zone;
    public Object style;
    public String styleClass;
    public Object options;
    public Object[] overlays;
    public EventEmitter<?> onMapClick;
    public EventEmitter<?> onOverlayClick;
    public EventEmitter<?> onOverlayDragStart;
    public EventEmitter<?> onOverlayDrag;
    public EventEmitter<?> onOverlayDragEnd;
    public Object differ;
    public Object map;
    public GMap(ElementRef el, IterableDiffers differs, ChangeDetectorRef cd, NgZone zone){}
    native public void ngAfterViewInit();
    native public void bindOverlayEvents(Object overlay);
    native public void ngDoCheck();
    native public void bindDragEvents(Object overlay);
    native public Object getMap();
    protected GMap(){}
}

