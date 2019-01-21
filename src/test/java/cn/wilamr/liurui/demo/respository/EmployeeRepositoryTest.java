package cn.wilamr.liurui.demo.respository;

import cn.wilamr.liurui.demo.repository.EmployeeRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

/**
 * @author Yin Guo Wei 2019/1/15
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeRepositoryTest {

    @Autowired
    EmployeeRepository employeeRepository;

    @Test
    public void testFindAll() {
        assertEquals(3, employeeRepository.findAll().size());
    }

    @Test
    public void testFindById() {

        assertEquals("刘锐", employeeRepository.findById(1L).get().getLastname());
    }
    @Test
    public void testFindByLoginid() {

        assertEquals("denglu", employeeRepository.findOneByLoginid("liurui6").getLastname());
    }

}