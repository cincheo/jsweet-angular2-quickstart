package def.angular.core;

public interface IterableDiffer {
	Object diff(Object object);

	Object onDestroy();
}
