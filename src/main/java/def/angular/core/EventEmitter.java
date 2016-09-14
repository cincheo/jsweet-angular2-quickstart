package def.angular.core;

public class EventEmitter<T> {

	public EventEmitter(boolean isAsync) {
	}

	public EventEmitter() {
	}

	public native void emit(T value);

	public native void emit();

	public native Object subscribe(Object generatorOrNext, Object error, Object complete);

	public native Object subscribe(Object generatorOrNext, Object error);

	public native Object subscribe(Object generatorOrNext);

	public native Object subscribe();

}
