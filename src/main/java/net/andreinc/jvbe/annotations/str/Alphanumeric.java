package net.andreinc.jvbe.annotations.str;

import net.andreinc.jvbe.annotations.str.validators.AlphanumericValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Checks if the String contains only unicode letters or digits.
 */
@Documented
@Constraint(validatedBy = AlphanumericValidator.class)
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RUNTIME)
public @interface Alphanumeric {
    String message() default "{str.alphanumeric}";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}