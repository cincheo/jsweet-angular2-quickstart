package def.primeng.primeng;
import def.angular.core.EventEmitter;
import def.angular.core.TemplateRef;
public class Tree extends jsweet.lang.Object {
    public TreeNode[] value;
    public String selectionMode;
    public Object selection;
    public EventEmitter<?> selectionChange;
    public EventEmitter<?> onNodeSelect;
    public EventEmitter<?> onNodeUnselect;
    public EventEmitter<?> onNodeExpand;
    public EventEmitter<?> onNodeCollapse;
    public EventEmitter<?> onNodeContextMenuSelect;
    public Object style;
    public String styleClass;
    public Object contextMenu;
    public TemplateRef<?> template;
    native public void onNodeClick(Object event, TreeNode node);
    native public void onNodeRightClick(Object event, TreeNode node);
    native public double findIndexInSelection(TreeNode node);
    native public Boolean isSelected(TreeNode node);
    native public Boolean isSingleSelectionMode();
    native public Boolean isMultipleSelectionMode();
}

