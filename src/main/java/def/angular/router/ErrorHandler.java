package def.angular.router;

@FunctionalInterface
public interface ErrorHandler {
	Object apply(Object error);
}
