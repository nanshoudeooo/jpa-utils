package me.sdevil507.convert;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;
import me.sdevil507.vo.JpaSortVO;
import org.springframework.core.convert.converter.Converter;
import org.springframework.data.domain.Sort;

import java.util.List;


/**
 * jpa排序条件json转换为实体
 *
 * @see JpaSortVO
 * 参数格式:[{"field": "lastLoginTime","direction": "asc"},{"field":"id","direction":"asc"}]
 * <p>
 * Created by sdevil507 on 2017/4/13.
 */
public class JpaSortConditionConverter implements Converter<String, List<JpaSortVO>> {

    public List<JpaSortVO> convert(String source) {
        GsonBuilder gsonBuilder = new GsonBuilder();
        //添加枚举转换
        gsonBuilder.registerTypeAdapter(Sort.Direction.class,
                new JpaSortEnumSerializer());
        Gson gson = gsonBuilder.create();
        //转换为排序list
        List<JpaSortVO> list = gson.fromJson(source, new TypeToken<List<JpaSortVO>>() {
        }.getType());
        return list;
    }

}
