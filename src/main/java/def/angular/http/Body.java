package def.angular.http;

import jsweet.dom.Blob;
import jsweet.lang.ArrayBuffer;

/**
 * HTTP request body used by both {@link Request} and {@link Response}
 * https://fetch.spec.whatwg.org/#body
 */
public class Body {
	/**
	 * Attempts to return body as parsed `JSON` object, or raises an exception.
	 */
	public native Object json();

	/**
	 * Returns the body as a string, presuming `toString()` can be called on the
	 * response body.
	 */
	public native String text();

	/**
	 * Return the body as an ArrayBuffer
	 */
	public native ArrayBuffer arrayBuffer();

	/**
	 * Returns the request's body as a Blob, assuming that body exists.
	 */
	public native Blob blob();
}
