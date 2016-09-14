package def.primeng.primeng;
public class UITreeRow extends jsweet.lang.Object {
    public TreeTable treeTable;
    public TreeNode node;
    public double level;
    public Boolean expanded;
    public Boolean hover;
    public UITreeRow(TreeTable treeTable){}
    native public void toggle(Object event);
    native public Boolean isLeaf();
    native public Boolean isSelected();
    native public void onRowClick(Object event);
    native public Object resolveFieldData(Object data, String field);
    protected UITreeRow(){}
}

