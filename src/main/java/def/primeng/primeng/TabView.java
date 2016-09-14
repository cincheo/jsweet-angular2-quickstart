package def.primeng.primeng;
import def.angular.core.ElementRef;
import def.angular.core.EventEmitter;
import def.angular.core.QueryList;
public class TabView extends jsweet.lang.Object {
    public ElementRef el;
    public String orientation;
    public Object style;
    public String styleClass;
    public QueryList<TabPanel> tabPanels;
    public EventEmitter<?> onChange;
    public EventEmitter<?> onClose;
    public Boolean initialized;
    public TabPanel[] tabs;
    public TabView(ElementRef el){}
    native public void ngAfterContentInit();
    native public void initTabs();
    native public void open(Object event, TabPanel tab);
    native public void close(Object event, TabPanel tab);
    native public TabPanel findSelectedTab();
    native public double findTabIndex(TabPanel tab);
    native public String getDefaultHeaderClass(TabPanel tab);
    protected TabView(){}
}

