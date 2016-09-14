package def.angular.core;

import jsweet.lang.Function;

public class Renderer {
	// public native Object selectRootElement(String selectorOrNode,
	// RenderDebugInfo debugInfo);

	// public native Object selectRootElement(Object selectorOrNode,
	// RenderDebugInfo debugInfo);

	public native Object selectRootElement(String selectorOrNode);

	public native Object selectRootElement(Object selectorOrNode);

	// public native Object createElement(Object parentElement, String name,
	// RenderDebugInfo debugInfo);

	public native Object createElement(Object parentElement, String name);

	public native Object createViewRoot(Object hostElement);

	// public native Object createTemplateAnchor(Object parentElement,
	// RenderDebugInfo debugInfo);

	public native Object createTemplateAnchor(Object parentElement);

	// public native Object createText(Object parentElement, String value,
	// RenderDebugInfo debugInfo);

	public native Object createText(Object parentElement, String value);

	public native void projectNodes(Object parentElement, Object[] nodes);

	public native void attachViewAfter(Object node, Object[] viewRootNodes);

	public native void detachView(Object[] viewRootNodes);

	public native void destroyView(Object hostElement, Object[] viewAllNodes);

	public native Function listen(Object renderElement, String name, Function callback);

	public native Function listenGlobal(String target, String name, Function callback);

	public native void setElementProperty(Object renderElement, String propertyName, Object propertyValue);

	public native void setElementAttribute(Object renderElement, String attributeName, String attributeValue);

	/**
	 * Used only in debug mode to serialize property changes to dom nodes as
	 * attributes.
	 */
	public native void setBindingDebugInfo(Object renderElement, String propertyName, String propertyValue);

	public native void setElementClass(Object renderElement, String className, boolean isAdd);

	public native void setElementStyle(Object renderElement, String styleName, String styleValue);

	public native void invokeElementMethod(Object renderElement, String methodName, Object[] args);

	public native void invokeElementMethod(Object renderElement, String methodName);

	public native void setText(Object renderNode, String text);

	// public native AnimationPlayer animate(Object element, AnimationStyles
	// startingStyles, AnimationKeyframe[] keyframes,
	// double duration, double delay, String easing);
}