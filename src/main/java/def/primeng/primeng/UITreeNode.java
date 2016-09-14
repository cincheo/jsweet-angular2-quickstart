package def.primeng.primeng;
public class UITreeNode extends jsweet.lang.Object {
    public Tree tree;
    public static String ICON_CLASS;
    public TreeNode node;
    public Boolean hover;
    public Boolean expanded;
    public UITreeNode(Tree tree){}
    native public String getIcon();
    native public Boolean isLeaf();
    native public void toggle(Object event);
    native public void onNodeClick(Object event);
    native public void onNodeRightClick(Object event);
    native public Boolean isSelected();
    protected UITreeNode(){}
}

