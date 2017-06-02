package me.sdevil507.vo;

import org.springframework.data.domain.Sort;

import java.io.Serializable;

/**
 * 排序VO
 * <p>
 * Created by sdevil507 on 2017/4/13.
 */
public class JpaSortVO implements Serializable {

    /**
     * 排序字段名
     */
    private String field;

    /**
     * 排序方向
     */
    private Sort.Direction direction;

    public String getField() {
        return field;
    }

    public void setField(String field) {
        this.field = field;
    }

    public Sort.Direction getDirection() {
        return direction;
    }

    public void setDirection(Sort.Direction direction) {
        this.direction = direction;
    }

    @Override
    public String toString() {
        return "JpaSortVO{" +
                "field='" + field + '\'' +
                ", direction=" + direction +
                '}';
    }
}
