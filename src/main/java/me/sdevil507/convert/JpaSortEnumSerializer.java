package me.sdevil507.convert;

import com.google.gson.*;
import org.springframework.data.domain.Sort;

import java.lang.reflect.Type;

/**
 * jpa排序枚举类型转换
 * <p>
 * Created by sdevil507 on 2017/4/13.
 */
public class JpaSortEnumSerializer implements JsonSerializer<Sort.Direction>, JsonDeserializer<Sort.Direction> {

    // json转为对象时调用,实现JsonDeserializer<Sort.Direction>接口
    @Override
    public Sort.Direction deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        Sort.Direction direction = Sort.Direction.fromStringOrNull(json.getAsString());
        return direction;
    }

    // 对象转为Json时调用,实现JsonSerializer<Sort.Direction>接口
    @Override
    public JsonElement serialize(Sort.Direction src, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(src.ordinal());
    }
}
