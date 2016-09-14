package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.EventEmitter;
import def.angular.core.IterableDiffers;
public class UIChart extends jsweet.lang.Object {
    public ElementRef el;
    public String type;
    public Object data;
    public Object options;
    public String width;
    public String height;
    public EventEmitter<?> onDataSelect;
    public Boolean initialized;
    public Object chart;
    public Object differ;
    public UIChart(ElementRef el, IterableDiffers differs){}
    native public void ngAfterViewInit();
    native public void ngDoCheck();
    native public void onCanvasClick(Object event);
    native public void initChart();
    native public Object getCanvas();
    native public Object getBase64Image();
    native public void ngOnDestroy();
    protected UIChart(){}
}

