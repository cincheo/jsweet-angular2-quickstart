package def.angular.core;

public class SimpleChange {

	public Object previousValue;
	public Object currentValue;

	public SimpleChange(Object previousValue, Object currentValue) {
	}

	public native boolean isFirstChange();

}
