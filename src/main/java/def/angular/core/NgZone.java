package def.angular.core;

import java.util.function.Supplier;

public class NgZone {
	public static native boolean isInAngularZone();

	public static native void assertInAngularZone();

	public static native void assertNotInAngularZone();

	/**
	 * Notifies when code enters Angular Zone. This gets fired first on VM Turn.
	 */
	public EventEmitter<?> onUnstable;
	/**
	 * Notifies when there is no more microtasks enqueue in the current VM Turn.
	 * This is a hint for Angular to do change detection, which may enqueue more
	 * microtasks. For this reason this event can fire multiple times per VM
	 * Turn.
	 */
	public EventEmitter<?> onMicrotaskEmpty;
	/**
	 * Notifies when the last `onMicrotaskEmpty` has run and there are no more
	 * microtasks, which implies we are about to relinquish VM turn. This event
	 * gets called just once.
	 */
	public EventEmitter<?> onStable;
	/**
	 * Notify that an error has been delivered.
	 */
	public EventEmitter<?> onError;
	/**
	 * Whether there are no outstanding microtasks or microtasks.
	 */
	public boolean isStable;
	/**
	 * Whether there are any outstanding microtasks.
	 */
	public boolean hasPendingMicrotasks;
	/**
	 * Whether there are any outstanding microtasks.
	 */
	public boolean hasPendingMacrotasks;

	/**
	 * Executes the `fn` function synchronously within the Angular zone and
	 * returns value returned by the function.
	 *
	 * Running functions via `run` allows you to reenter Angular zone from a
	 * task that was executed outside of the Angular zone (typically started via
	 * {@link #runOutsideAngular}).
	 *
	 * Any future tasks or microtasks scheduled from within this function will
	 * continue executing from within the Angular zone.
	 *
	 * If a synchronous error happens it will be rethrown and not reported via
	 * `onError`.
	 */
	public native Object run(Supplier<Object> fn);

	/**
	 * Same as #run, except that synchronous errors are caught and forwarded via
	 * `onError` and not rethrown.
	 */
	public native Object runGuarded(Supplier<Object> fn);

	/**
	 * Executes the `fn` function synchronously in Angular's parent zone and
	 * returns value returned by the function.
	 *
	 * Running functions via `runOutsideAngular` allows you to escape Angular's
	 * zone and do work that doesn't trigger Angular change-detection or is
	 * subject to Angular's error handling.
	 *
	 * Any future tasks or microtasks scheduled from within this function will
	 * continue executing from outside of the Angular zone.
	 *
	 * Use {@link #run} to reenter the Angular zone and do work that updates the
	 * application model.
	 */
	public native Object runOutsideAngular(Supplier<Object> fn);

}
