package def.angular.core;

import jsweet.lang.Array;
import jsweet.util.function.TriConsumer;
import jsweet.util.function.TriFunction;

public class QueryList<T> {
	public Object changes;
	public int length;
	public T first;
	public T last;

	/**
	 * See [Array.map](https://developer.mozilla.org/en-US/docs/Web/JavaScript/
	 * Reference/Global_Objects/Array/map)
	 */
	public native <U> U[] map(TriFunction<T, Integer, T[], U> fn);

	/**
	 * See
	 * [Array.filter](https://developer.mozilla.org/en-US/docs/Web/JavaScript/
	 * Reference/Global_Objects/Array/filter)
	 */
	public native T[] filter(TriFunction<T, Integer, T[], Boolean> fn);

	/**
	 * See
	 * [Array.reduce](https://developer.mozilla.org/en-US/docs/Web/JavaScript/
	 * Reference/Global_Objects/Array/reduce)
	 */
	public native <U> U reduce(Function4<U, T, Integer, T[], U> fn, U init);

	/**
	 * See
	 * [Array.forEach](https://developer.mozilla.org/en-US/docs/Web/JavaScript/
	 * Reference/Global_Objects/Array/forEach)
	 */
	public native void forEach(TriConsumer<T, Integer, T[]> fn);

	/**
	 * See [Array.some](https://developer.mozilla.org/en-US/docs/Web/JavaScript/
	 * Reference/Global_Objects/Array/some)
	 */
	public native boolean some(TriFunction<T, Integer, T[], Boolean> fn);

	public native T[] toArray();

	public native String toString();

	public native void reset(Array<Object> res);

	public native void notifyOnChanges();

	@FunctionalInterface
	interface Function4<T1, T2, T3, T4, R> {
		R apply(T1 p1, T2 p2, T3 p3, T4 p4);
	}
}
