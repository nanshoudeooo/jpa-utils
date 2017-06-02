/**
 * @title: JpaUUIDBaseEntity.java
 * @date: 2017年3月7日下午2:18:11
 */
package me.sdevil507.base;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

/**
 * jpa设置ID为UUID抽象父类
 * <p>
 * Created by sdevil507 on 2017/4/13.
 */
@MappedSuperclass
public abstract class JpaUUIDBaseEntity implements Serializable {

    @Id
    //策略通用生成器,名称为sys-uuid,策略为uuid
    @GenericGenerator(name = "sys-uuid", strategy = "uuid")
    //指定使用的策略生成器
    @GeneratedValue(generator = "sys-uuid")
    @Column(name = "id")
    protected String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

}
