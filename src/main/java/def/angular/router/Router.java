package def.angular.router;

public class Router {
	public Route[] config;
	public ErrorHandler errorHandler;
	/**
	 * Indicates if at least one navigation happened.
	 *
	 * @stable
	 */
	public boolean navigated;

	/**
	 * Creates the router service.
	 */
	// constructor(rootComponentType: Type<any>, urlSerializer: UrlSerializer,
	// outletMap: RouterOutletMap, location: Location, injector: Injector,
	// loader: NgModuleFactoryLoader, compiler: Compiler, config: Routes);

	/**
	 * Sets up the location change listener and performs the inital navigation
	 */
	public native void initialNavigation();

	/**
	 * Sets up the location change listener
	 */
	public native void setUpLocationChangeListener();

	/**
	 * Returns the current route state.
	 */
	public Object routerState;
	/**
	 * Returns the current url.
	 */
	public String url;
	/**
	 * Returns an observable of route events
	 */
	public Object events;

	/**
	 * Resets the configuration used for navigation and generating links.
	 *
	 * ### Usage
	 *
	 * ``` router.resetConfig([ { path: 'team/:id', component: TeamCmp,
	 * children: [ { path: 'simple', component: SimpleCmp }, { path:
	 * 'user/:name', component: UserCmp } ] } ]); ```
	 */
	public native void resetConfig(Route[] config);

	public native void ngOnDestroy();

	/**
	 * Disposes of the router.
	 */
	public native void dispose();
	/**
	 * Applies an array of commands to the current url tree and creates a new
	 * url tree.
	 *
	 * When given an activate route, applies the given commands starting from
	 * the route. When not given a route, applies the given command starting
	 * from the root.
	 *
	 * ### Usage
	 *
	 * ``` // create /team/33/user/11 router.createUrlTree(['/team', 33, 'user',
	 * 11]);
	 *
	 * // create /team/33;expand=true/user/11 router.createUrlTree(['/team', 33,
	 * {expand: true}, 'user', 11]);
	 *
	 * // you can collapse static segments like this (this works only with the
	 * first passed-in value): router.createUrlTree(['/team/33/user', userId]);
	 *
	 * // If the first segment can contain slashes, and you do not want the
	 * router to split it, you // can do the following:
	 *
	 * router.createUrlTree([{segmentPath: '/one/two'}]);
	 *
	 * // create /team/33/(user/11//right:chat) router.createUrlTree(['/team',
	 * 33, {outlets: {primary: 'user/11', right: 'chat'}}]);
	 *
	 * // remove the right secondary node router.createUrlTree(['/team', 33,
	 * {outlets: {primary: 'user/11', right: null}}]);
	 *
	 * // assuming the current url is `/team/33/user/11` and the route points to
	 * `user/11`
	 *
	 * // navigate to /team/33/user/11/details router.createUrlTree(['details'],
	 * {relativeTo: route});
	 *
	 * // navigate to /team/33/user/22 router.createUrlTree(['../22'],
	 * {relativeTo: route});
	 *
	 * // navigate to /team/44/user/22
	 * router.createUrlTree(['../../team/44/user/22'], {relativeTo: route}); ```
	 */
	// public native UrlTree createUrlTree(Object[] commands, {relativeTo,
	// queryParams, fragment, preserveQueryParams, preserveFragment}?:
	// NavigationExtras);
	/**
	 * Navigate based on the provided url. This navigation is always absolute.
	 *
	 * Returns a promise that: - is resolved with 'true' when navigation
	 * succeeds - is resolved with 'false' when navigation fails - is rejected
	 * when an error happens
	 *
	 * ### Usage
	 *
	 * ``` router.navigateByUrl("/team/33/user/11");
	 *
	 * // Navigate without updating the URL
	 * router.navigateByUrl("/team/33/user/11", { skipLocationChange: true });
	 * ```
	 *
	 * In opposite to `navigate`, `navigateByUrl` takes a whole URL and does not
	 * apply any delta to the current one.
	 */
	// navigateByUrl(url: string | UrlTree, extras?: NavigationExtras):
	// Promise<boolean>;
	/**
	 * Navigate based on the provided array of commands and a starting point. If
	 * no starting route is provided, the navigation is absolute.
	 *
	 * Returns a promise that: - is resolved with 'true' when navigation
	 * succeeds - is resolved with 'false' when navigation fails - is rejected
	 * when an error happens
	 *
	 * ### Usage
	 *
	 * ``` router.navigate(['team', 33, 'team', '11], {relativeTo: route});
	 *
	 * // Navigate without updating the URL router.navigate(['team', 33, 'team',
	 * '11], {relativeTo: route, skipLocationChange: true }); ```
	 *
	 * In opposite to `navigateByUrl`, `navigate` always takes a delta that is
	 * applied to the current URL.
	 */
	// Promise<boolean> navigate(commands: any[], extras?: NavigationExtras);
	/**
	 * Serializes a {@link UrlTree} into a string.
	 */
	// serializeUrl(url: UrlTree): string;
	/**
	 * Parse a string into a {@link UrlTree}.
	 */
	// parseUrl(url: string): UrlTree;
	/**
	 * Returns if the url is activated or not.
	 */
	// isActive(url: string | UrlTree, exact: boolean): boolean;

}
