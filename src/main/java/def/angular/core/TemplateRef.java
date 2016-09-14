package def.angular.core;

public class TemplateRef<C> {
	/**
	 * The location in the View where the Embedded View logically belongs to.
	 *
	 * The data-binding and injection contexts of Embedded Views created from
	 * this `TemplateRef` inherit from the contexts of this location.
	 *
	 * Typically new Embedded Views are attached to the View Container of this
	 * location, but in advanced use-cases, the View can be attached to a
	 * different container while keeping the data-binding and injection context
	 * from the original location.
	 *
	 */
	public ElementRef elementRef;

	//public native EmbeddedViewRef<C> createEmbeddedView(C context);

}
