package def.primeng.primeng;
import def.angular.core.EventEmitter;
import def.angular.core.QueryList;
import def.angular.core.TemplateRef;
public class Column extends jsweet.lang.Object {
    public String field;
    public String header;
    public String footer;
    public Object sortable;
    public Boolean editable;
    public Boolean filter;
    public String filterMatchMode;
    public double rowspan;
    public double colspan;
    public Object style;
    public String styleClass;
    public Boolean hidden;
    public Boolean expander;
    public String selectionMode;
    public EventEmitter<?> sortFunction;
    public QueryList<?> templates;
    public TemplateRef<?> template;
    public TemplateRef<?> headerTemplate;
    public TemplateRef<?> bodyTemplate;
    public TemplateRef<?> footerTemplate;
    native public void ngAfterContentInit();
}

