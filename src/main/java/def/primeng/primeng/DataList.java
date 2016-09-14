package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.EventEmitter;
import def.angular.core.IterableDiffers;
import def.angular.core.TemplateRef;
public class DataList extends jsweet.lang.Object {
    public ElementRef el;
    public Object[] value;
    public Boolean paginator;
    public double rows;
    public double totalRecords;
    public double pageLinks;
    public double[] rowsPerPageOptions;
    public Boolean lazy;
    public EventEmitter<?> onLazyLoad;
    public Object style;
    public String styleClass;
    public String paginatorPosition;
    public Object header;
    public Object footer;
    public TemplateRef<?> itemTemplate;
    public Object[] dataToRender;
    public double first;
    public double page;
    public Object differ;
    public DataList(ElementRef el, IterableDiffers differs){}
    native public void ngAfterViewInit();
    native public void ngDoCheck();
    native public void updatePaginator();
    native public void paginate(Object event);
    native public void updateDataToRender(Object datasource);
    native public Boolean isEmpty();
    native public Object createLazyLoadMetadata();
    protected DataList(){}
}

