package me.sdevil507.base;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * 测试实体
 * <p>
 * Created by sdevil507 on 2017/5/27.
 */
@Entity(name = "test")
public class TestEntity extends JpaUUIDBaseEntity {

    /**
     * 名称
     */
    @Column
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
