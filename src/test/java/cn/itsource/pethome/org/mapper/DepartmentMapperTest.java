package cn.itsource.pethome.org.mapper;

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
public class DepartmentMapperTest extends TestCase {
    @Autowired
    private DepartmentMapper departmentMapper;

    public void testAdd() {
    }
    @Test
    public void testLoadById() {
        List<Department> departments = departmentMapper.loadAll();
        departments.forEach(System.out::println);
    }
}