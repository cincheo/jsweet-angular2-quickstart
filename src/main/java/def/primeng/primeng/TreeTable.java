package def.primeng.primeng;
import def.angular.core.EventEmitter;
import def.angular.core.QueryList;
public class TreeTable extends jsweet.lang.Object {
    public TreeNode[] value;
    public String selectionMode;
    public Object selection;
    public EventEmitter<?> selectionChange;
    public EventEmitter<?> onNodeSelect;
    public EventEmitter<?> onNodeUnselect;
    public EventEmitter<?> onNodeExpand;
    public EventEmitter<?> onNodeCollapse;
    public Object style;
    public String styleClass;
    public Object header;
    public Object footer;
    public QueryList<Column> columns;
    native public void onRowClick(Object event, Object node);
    native public double findIndexInSelection(TreeNode node);
    native public Boolean isSelected(TreeNode node);
    native public Boolean isSingleSelectionMode();
    native public Boolean isMultipleSelectionMode();
    native public Boolean hasFooter();
}

