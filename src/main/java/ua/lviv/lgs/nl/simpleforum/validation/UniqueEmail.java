package ua.lviv.lgs.nl.simpleforum.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Constraint(validatedBy = UniqueEmailValidator.class)
@Retention(RUNTIME)
@Target({ FIELD, METHOD })
public @interface UniqueEmail {

    public String message() default "The email address is already in use!";

    public Class<?>[] groups() default {};

    public Class<? extends Payload>[] payload() default{};

}