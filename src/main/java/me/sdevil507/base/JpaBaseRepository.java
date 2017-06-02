package me.sdevil507.base;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.NoRepositoryBean;

import java.io.Serializable;

/**
 * jpa基础repository,合并分页,排序,条件查询
 * <p>
 * Created by sdevil507 on 2017/4/13.
 */
@NoRepositoryBean
public interface JpaBaseRepository<T, ID extends Serializable>
        extends JpaRepository<T, ID>, JpaSpecificationExecutor<T> {

}
