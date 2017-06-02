package me.sdevil507.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * Jpa分页参数页码校验注解
 * <p>
 * Created by sdevil507 on 2017/4/13.
 */
@Documented
@Constraint(validatedBy = {JpaPageArgsValidator.class})
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface JpaPageArgsValidAnnotation {

    String message() default "分页参数必须参照如下规则:page>=0,rows>=0.当page=0或rows=0时,不分页!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
