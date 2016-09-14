package def.angular.core;

public class IterableDiffers {
	public IterableDifferFactory[] factories;

	public IterableDiffers(IterableDifferFactory[] factories) {
	};

	public static native IterableDiffers create(IterableDifferFactory[] factories, IterableDiffers parent);

	public static native IterableDiffers create(IterableDifferFactory[] factories);

	/**
	 * Takes an array of {@link IterableDifferFactory} and returns a provider
	 * used to extend the inherited {@link IterableDiffers} instance with the
	 * provided factories and return a new {@link IterableDiffers} instance.
	 *
	 * The following example shows how to extend an existing list of factories,
	 * which will only be applied to the injector for this component and its
	 * children. This step is all that's required to make a new
	 * {@link IterableDiffer} available.
	 *
	 * ### Example
	 *
	 * ```
	 * 
	 * @Component({ viewProviders: [ IterableDiffers.extend([new
	 *              ImmutableListDiffer()]) ] }) ```
	 */
	public static native Object extend(IterableDifferFactory[] factories);

	public native IterableDifferFactory find(Object iterable);

}
