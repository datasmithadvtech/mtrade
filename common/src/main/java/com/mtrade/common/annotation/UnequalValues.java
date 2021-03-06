
package com.mtrade.common.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import javax.validation.Constraint;
import javax.validation.Payload;

import com.mtrade.common.validator.UnequalValuesValidator;

import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Target(TYPE)
@Retention(RUNTIME)
@Constraint(validatedBy = UnequalValuesValidator.class)
@Documented
public @interface UnequalValues {

    String regex();
    String message() default "fields must not be equal";
    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
