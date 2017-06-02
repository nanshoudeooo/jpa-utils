package me.sdevil507.convert;

import com.google.gson.Gson;
import me.sdevil507.vo.JpaPageVO;
import org.springframework.core.convert.converter.Converter;

/**
 * jpa分页条件json转换为实体
 *
 * @see JpaPageVO
 * 参数格式:{"page":1,"rows":2}
 * <p>
 * Created by sdevil507 on 2017/4/13.
 */
public class JpaPageConditionConverter implements Converter<String, JpaPageVO> {

    @Override
    public JpaPageVO convert(String source) {
        Gson gson = new Gson();
        return gson.fromJson(source, JpaPageVO.class);
    }
}
