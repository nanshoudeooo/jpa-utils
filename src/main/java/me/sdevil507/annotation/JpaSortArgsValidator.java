package me.sdevil507.annotation;

import me.sdevil507.vo.JpaSortVO;
import org.springframework.util.StringUtils;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

/**
 * JPA排序参数校验器
 * <p>
 * Created by sdevil507 on 2017/4/13.
 */
public class JpaSortArgsValidator implements ConstraintValidator<JpaSortArgsValidAnnotation, List<JpaSortVO>> {

    @Override
    public void initialize(JpaSortArgsValidAnnotation constraintAnnotation) {

    }

    @Override
    public boolean isValid(List<JpaSortVO> value, ConstraintValidatorContext context) {
        if (null == value) {
            return true;
        }
        for (JpaSortVO jpaSortVO : value) {
            if (StringUtils.isEmpty(jpaSortVO.getField().trim()) || null == jpaSortVO.getDirection()) {
                //如果发现field参数为空或者排序方向错误,则验证失败
                return false;
            }
        }
        return true;
    }
}
