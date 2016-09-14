package def.primeng.components.dom.domhandler;
public class DomHandler extends jsweet.lang.Object {
    public static double zindex;
    native public void addClass(Object element, String className);
    native public void addMultipleClasses(Object element, String className);
    native public void removeClass(Object element, String className);
    native public Boolean hasClass(Object element, String className);
    native public Object siblings(Object element);
    native public Object[] find(Object element, String selector);
    native public Object findSingle(Object element, String selector);
    native public double index(Object element);
    native public void relativePosition(Object element, Object target);
    native public void absolutePosition(Object element, Object target);
    native public double getHiddenElementOuterHeight(Object element);
    native public double getHiddenElementOuterWidth(Object element);
    native public Object getHiddenElementDimensions(Object element);
    native public void scrollInView(Object container, Object item);
    native public void fadeIn(Object element, double duration);
    native public void fadeOut(Object element, Object ms);
    native public double getWindowScrollTop();
    native public double getWindowScrollLeft();
    native public Boolean matches(Object element, String selector);
    native public Object getOuterWidth(Object el, Object margin);
    native public double getHorizontalMargin(Object el);
    native public Object innerWidth(Object el);
    native public Object width(Object el);
    native public Object getOuterHeight(Object el, Object margin);
    native public double getHeight(Object el);
    native public Object getViewport();
    native public Boolean equals(Object obj1, Object obj2);
    native public Object getOuterWidth(Object el);
    native public Object getOuterHeight(Object el);
}

