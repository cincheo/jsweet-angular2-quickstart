package def.angular.http;

import def.rxjs.rxjs.Observable;

public class Http {

	public native Observable<Response> request(String url);

	public native Observable<Response> request(String url, RequestOptionsArgs options);

	public native Observable<Response> request(Request url);

	public native Observable<Response> request(Request url, RequestOptionsArgs options);

	/**
	 * Performs a request with `get` http method.
	 */
	public native Observable<Response> get(String url, RequestOptionsArgs options);

	/**
	 * Performs a request with `get` http method.
	 */
	public native Observable<Response> get(String url);

	/**
	 * Performs a request with `post` http method.
	 */
	public native Observable<Response> post(String url, Object body, RequestOptionsArgs options);

	/**
	 * Performs a request with `post` http method.
	 */
	public native Observable<Response> post(String url, Object body);

	/**
	 * Performs a request with `put` http method.
	 */
	public native Observable<Response> put(String url, Object body, RequestOptionsArgs options);

	/**
	 * Performs a request with `put` http method.
	 */
	public native Observable<Response> put(String url, Object body);

	/**
	 * Performs a request with `delete` http method.
	 */
	public native Observable<Response> delete(String url, RequestOptionsArgs options);

	/**
	 * Performs a request with `delete` http method.
	 */
	public native Observable<Response> delete(String url);

	/**
	 * Performs a request with `patch` http method.
	 */
	public native Observable<Response> patch(String url, Object body, RequestOptionsArgs options);

	/**
	 * Performs a request with `patch` http method.
	 */
	public native Observable<Response> patch(String url, Object body);

	/**
	 * Performs a request with `head` http method.
	 */
	public native Observable<Response> head(String url, RequestOptionsArgs options);

	/**
	 * Performs a request with `head` http method.
	 */
	public native Observable<Response> head(String url);

	/**
	 * Performs a request with `options` http method.
	 */
	public native Observable<Response> options(String url, RequestOptionsArgs options);

	/**
	 * Performs a request with `options` http method.
	 */
	public native Observable<Response> options(String url);

}
