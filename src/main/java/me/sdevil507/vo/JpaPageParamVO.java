package me.sdevil507.vo;

import me.sdevil507.annotation.JpaPageArgsValidAnnotation;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import java.io.Serializable;

/**
 * jpa分页参数入参VO类
 * <p>
 * Created by sdevil507 on 2017/4/10.
 */
public class JpaPageParamVO implements Serializable {

    /**
     * 分页对象
     */
    @JpaPageArgsValidAnnotation
    private JpaPageVO pageCondition;

    /**
     * 获取jpa分页对象
     *
     * @return Pageable
     */
    public Pageable getPageable() {
        if (null == pageCondition || 0 == pageCondition.getPage() || 0 == pageCondition.getRows()) {
            return null;
        } else {
            return new PageRequest(pageCondition.getPage() - 1, pageCondition.getRows());
        }
    }

    /**
     * 获取jpa分页对象(含排序)
     *
     * @param sort 排序对象
     * @return Pageable
     */
    public Pageable getPageable(Sort sort) {
        if (null == pageCondition || 0 == pageCondition.getPage() || 0 == pageCondition.getRows()) {
            return null;
        } else {
            return new PageRequest(pageCondition.getPage() - 1, pageCondition.getRows(), sort);
        }
    }

    public JpaPageVO getPageCondition() {
        return pageCondition;
    }

    public void setPageCondition(JpaPageVO pageCondition) {
        this.pageCondition = pageCondition;
    }

    @Override
    public String toString() {
        return "JpaPageParamVO{" +
                "pageCondition=" + pageCondition +
                '}';
    }
}
