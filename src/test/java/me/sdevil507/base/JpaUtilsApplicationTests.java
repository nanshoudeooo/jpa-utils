package me.sdevil507.base;

import com.github.springtestdbunit.DbUnitTestExecutionListener;
import com.github.springtestdbunit.annotation.DatabaseSetup;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;
import org.springframework.test.context.support.DirtiesContextTestExecutionListener;
import org.springframework.test.context.transaction.TransactionalTestExecutionListener;

import java.util.List;

/**
 * 单元测试
 * <p>
 * Created by sdevil507 on 2017/6/1.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@TestExecutionListeners({DependencyInjectionTestExecutionListener.class,
        DirtiesContextTestExecutionListener.class,
        TransactionalTestExecutionListener.class,
        DbUnitTestExecutionListener.class})
public class JpaUtilsApplicationTests {

    @Autowired
    private TestRepository testRepository;

    @Test
    @DatabaseSetup("classpath:test.xml")
    public void findOne() {
        TestEntity testEntity = testRepository.findOne("1");
        Assert.assertEquals(testEntity.getName(), "sdevil507");
    }

    @Test
    public void save() {
        TestEntity testEntity = new TestEntity();
        testEntity.setName("gjf");
        testRepository.save(testEntity);
        List<TestEntity> testEntities = testRepository.findAll();
        Assert.assertEquals(1, testEntities.size());
    }
}
