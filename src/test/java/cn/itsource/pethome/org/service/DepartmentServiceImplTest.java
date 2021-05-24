package cn.itsource.pethome.org.service;

import cn.itsource.pethome.App;
import cn.itsource.pethome.org.domain.Department;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
@RunWith(SpringRunner.class)
@SpringBootTest(classes = App.class)
public class DepartmentServiceImplTest extends TestCase {
    @Autowired
    private IDepartmentService departmentService;
    @Test
    public void testDelete() {
    }
    @Test
    public void testLoadAll() {
        List<Department> departments = departmentService.loadAll();
        departments.forEach(System.out::println);
    }
}