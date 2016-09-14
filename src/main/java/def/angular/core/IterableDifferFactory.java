package def.angular.core;

public interface IterableDifferFactory {
	boolean supports(Object objects);

	IterableDiffer create(Object cdRef, Object trackByFn);

	IterableDiffer create(Object cdRef);

	IterableDiffer create();
}
