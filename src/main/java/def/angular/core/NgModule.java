package def.angular.core;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

import jsweet.lang.Decorator;

@Decorator
@Target(ElementType.TYPE)
public @interface NgModule {
	Class<?>[] imports() default {};

	Class<?>[] declarations() default {};

	Class<?>[] bootstrap() default {};

	Class<?>[] providers() default {};

}
