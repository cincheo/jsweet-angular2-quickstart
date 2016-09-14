package def.angular.core;

public class ViewContainerRef {
	/**
	 * Anchor element that specifies the location of this container in the
	 * containing View. <!-- TODO: rename to anchorElement -->
	 */
	public ElementRef element;
	//Injector injector;
	//Injector parentInjector;

	/**
	 * Destroys all Views in this container.
	 */
	public native void clear();

	/**
	 * Returns the {@link ViewRef} for the View located in this container at the
	 * specified index.
	 */
	public native ViewRef get(int index);

	/**
	 * Returns the number of Views currently attached to this container.
	 */
	public int length;
	/**
	 * Instantiates an Embedded View based on the {@link TemplateRef
	 * `templateRef`} and inserts it into this container at the specified
	 * `index`.
	 *
	 * If `index` is not specified, the new View will be inserted as the last
	 * View in the container.
	 *
	 * Returns the {@link ViewRef} for the newly created View.
	 */
	// public native <C> EmbeddedViewRef<C> createEmbeddedView<C>(TemplateRef<C>
	// templateRef, C context, int index);
	/**
	 * Instantiates a single {@link Component} and inserts its Host View into
	 * this container at the specified `index`.
	 *
	 * The component is instantiated using its {@link ComponentFactory} which
	 * can be obtained via
	 * {@link ComponentFactoryResolver#resolveComponentFactory}.
	 *
	 * If `index` is not specified, the new View will be inserted as the last
	 * View in the container.
	 *
	 * You can optionally specify the {@link Injector} that will be used as
	 * parent for the Component.
	 *
	 * Returns the {@link ComponentRef} of the Host View created for the newly
	 * instantiated Component.
	 */

	// abstract createComponent<C>(componentFactory: ComponentFactory<C>,
	// index?: number, injector?: Injector, projectableNodes?: any[][]):
	// ComponentRef<C>;
	/**
	 * Inserts a View identified by a {@link ViewRef} into the container at the
	 * specified `index`.
	 *
	 * If `index` is not specified, the new View will be inserted as the last
	 * View in the container.
	 *
	 * Returns the inserted {@link ViewRef}.
	 */
	public native ViewRef insert(ViewRef viewRef, int index);

	/**
	 * Inserts a View identified by a {@link ViewRef} into the container at the
	 * specified `index`.
	 *
	 * If `index` is not specified, the new View will be inserted as the last
	 * View in the container.
	 *
	 * Returns the inserted {@link ViewRef}.
	 */
	public native ViewRef insert(ViewRef viewRef);

	/**
	 * Moves a View identified by a {@link ViewRef} into the container at the
	 * specified `index`.
	 *
	 * Returns the inserted {@link ViewRef}.
	 */
	public native ViewRef move(ViewRef viewRef, int currentIndex);

	/**
	 * Returns the index of the View, specified via {@link ViewRef}, within the
	 * current container or `-1` if this container doesn't contain the View.
	 */
	public native int indexOf(ViewRef viewRef);

	/**
	 * Destroys a View attached to this container at the specified `index`.
	 *
	 * If `index` is not specified, the last View in the container will be
	 * removed.
	 */
	public native void remove(int index);

	/**
	 * Destroys a View attached to this container at the specified `index`.
	 *
	 * If `index` is not specified, the last View in the container will be
	 * removed.
	 */
	public native void remove();

	/**
	 * Use along with {@link #insert} to move a View within the current
	 * container.
	 *
	 * If the `index` param is omitted, the last {@link ViewRef} is detached.
	 */
	public native ViewRef detach(int index);

	/**
	 * Use along with {@link #insert} to move a View within the current
	 * container.
	 *
	 * If the `index` param is omitted, the last {@link ViewRef} is detached.
	 */
	public native ViewRef detach();

}
