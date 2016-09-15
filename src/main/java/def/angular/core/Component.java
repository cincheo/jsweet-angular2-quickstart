package def.angular.core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import jsweet.lang.Decorator;

@Decorator
@Target(ElementType.TYPE)
public @interface Component {
	String selector();

	String template() default "";

	String templateUrl() default "";

	String moduleId() default "";

	String[] styleUrls() default {};
	
	Class<?>[] directives() default {};

}
