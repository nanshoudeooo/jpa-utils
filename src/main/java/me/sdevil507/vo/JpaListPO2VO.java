package me.sdevil507.vo;

import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 将jpa查询返回list的PO类转为VO类
 * <p>
 * Created by sdevil507 on 2017/4/10.
 */
public class JpaListPO2VO {

    /**
     * 执行转换,将jpa查询得到的POJO类list转为VO类list
     *
     * @param list  POJO类list
     * @param clazz VO类Class
     * @return VO类list
     */
    public static <T,P> List<T> convert(List<P> list, Class<T> clazz) {
        List<T> results = new ArrayList<>();
        try {
            for (P pojo : list) {
                T vo = clazz.newInstance();
                BeanUtils.copyProperties(pojo, vo);
                results.add(vo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return results;
    }
}
