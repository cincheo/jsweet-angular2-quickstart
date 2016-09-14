package def.angular.common;

import java.util.function.Consumer;

public class Location {
	// constructor(platformStrategy: LocationStrategy);
	/**
	 * Returns the normalized URL path.
	 */
	public native String path(boolean includeHash);

	/**
	 * Returns the normalized URL path.
	 */
	public native String path();

	/**
	 * Normalizes the given path and compares to the current normalized path.
	 */
	public native boolean isCurrentPathEqualTo(String path, String query);

	/**
	 * Normalizes the given path and compares to the current normalized path.
	 */
	public native boolean isCurrentPathEqualTo(String path);

	/**
	 * Given a string representing a URL, returns the normalized URL path
	 * without leading or trailing slashes
	 */
	public native String normalize(String url);

	/**
	 * Given a string representing a URL, returns the platform-specific external
	 * URL path. If the given URL doesn't begin with a leading slash (`'/'`),
	 * this method adds one before normalizing. This method will also add a hash
	 * if `HashLocationStrategy` is used, or the `APP_BASE_HREF` if the
	 * `PathLocationStrategy` is in use.
	 */
	public native String prepareExternalUrl(String url);

	/**
	 * Changes the browsers URL to the normalized version of the given URL, and
	 * pushes a new item onto the platform's history.
	 */
	public native void go(String path, String query);

	/**
	 * Changes the browsers URL to the normalized version of the given URL, and
	 * pushes a new item onto the platform's history.
	 */
	public native void go(String path);

	/**
	 * Changes the browsers URL to the normalized version of the given URL, and
	 * replaces the top item on the platform's history stack.
	 */
	public native void replaceState(String path, String query);

	/**
	 * Changes the browsers URL to the normalized version of the given URL, and
	 * replaces the top item on the platform's history stack.
	 */
	public native void replaceState(String path);

	/**
	 * Navigates forward in the platform's history.
	 */
	public native void forward();

	/**
	 * Navigates back in the platform's history.
	 */
	public native void back();

	/**
	 * Subscribe to the platform's `popState` events.
	 */
	public native Object subscribe(Consumer<Object> onNext, Consumer<Object> onThrow, Runnable onReturn);

	/**
	 * Subscribe to the platform's `popState` events.
	 */
	public native Object subscribe(Consumer<Object> onNext, Consumer<Object> onThrow);

	/**
	 * Subscribe to the platform's `popState` events.
	 */
	public native Object subscribe(Consumer<Object> onNext);

	/**
	 * Given a string of url parameters, prepend with '?' if needed, otherwise
	 * return parameters as is.
	 */
	public native static String normalizeQueryParams(String params);

	/**
	 * Given 2 parts of a url, join them with a slash if needed.
	 */
	public native static String joinWithSlash(String start, String end);

	/**
	 * If url has a trailing slash, remove it, otherwise return url as is.
	 */
	public native static String stripTrailingSlash(String url);

}
