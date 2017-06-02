package me.sdevil507.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * Jpa排序参数校验注解
 * <p>
 * Created by sdevil507 on 2017/4/13.
 */
@Documented
@Constraint(validatedBy = {JpaSortArgsValidator.class})
@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
public @interface JpaSortArgsValidAnnotation {

    String message() default "jpa排序参数验证失败,请确认每一条排序条件中field不为空且direction为ASC/DESC!";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};

}
