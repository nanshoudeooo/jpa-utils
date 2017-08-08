package me.sdevil507.vo;

import me.sdevil507.annotation.JpaSortArgsValidAnnotation;
import org.springframework.data.domain.Sort;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * jpa排序参数VO
 * <p>
 * Created by sdevil507 on 2017/4/10.
 */
public class JpaSortParamVO implements Serializable {
    /**
     * 排序参数列表
     */
    @JpaSortArgsValidAnnotation
    private List<JpaSortVO> sortCondition;

    private List<JpaSortVO> getSortCondition() {
        return sortCondition;
    }

    public JpaSortParamVO setSortCondition(List<JpaSortVO> sortCondition) {
        this.sortCondition = sortCondition;
        return this;
    }

    public Sort getSort() {
        Sort sort;
        List<Sort.Order> list = new ArrayList<>();
        if (null == getSortCondition() || 0 == getSortCondition().size()) {
            //如果没有排序条件
            return null;
        } else {
            for (JpaSortVO jpaSortVO : getSortCondition()) {
                list.add(new Sort.Order(jpaSortVO.getDirection(), jpaSortVO.getField()));
            }
            sort = new Sort(list);
        }
        return sort;
    }

    @Override
    public String toString() {
        return "JpaSortParamVO{" +
                "sortCondition=" + sortCondition +
                '}';
    }
}
