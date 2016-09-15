package def.rxjs.rxjs;

import def.es6_promise.Promise;

public class Observable<T> {

	public native Promise<T> toPromise();
	
}
