package cn.itsource.pethome.org.controller;

import cn.itsource.pethome.org.domain.Employee;
import cn.itsource.pethome.org.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @Autowired
    private IEmployeeService iEmployeeService;

    @PatchMapping()
    public List<Employee> loadAll()
    {
        return iEmployeeService.loadAll();
    }
}
