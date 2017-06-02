package me.sdevil507.annotation;

import me.sdevil507.vo.JpaPageVO;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * jpa分页参数校验器
 * <p>
 * Created by sdevil507 on 2017/4/13.
 */
public class JpaPageArgsValidator implements ConstraintValidator<JpaPageArgsValidAnnotation, JpaPageVO> {

    @Override
    public void initialize(JpaPageArgsValidAnnotation constraintAnnotation) {
    }

    @Override
    public boolean isValid(JpaPageVO value, ConstraintValidatorContext context) {
        if (null == value) {
            return true;
        }
        if (value.getPage() < 0 || value.getRows() < 0) {
            return false;
        }
        return true;
    }
}
