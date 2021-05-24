package cn.itsource.pethome.org.service.impl;

import cn.itsource.pethome.basic.service.impl.BaseServiceImpl;

import cn.itsource.pethome.org.domain.Employee;
import cn.itsource.pethome.org.mapper.EmployeeMapper;
import cn.itsource.pethome.org.service.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeeServiceImpl extends BaseServiceImpl<Employee> implements IEmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    /**
     * 添加和修改员工
     *
     * @param employee
     */
    @Override
    @Transactional
    public void saveOrUpdate(Employee employee) {
        if(employee.getId()!=null)
        {
            employeeMapper.update(employee);
        }else{
            employeeMapper.add(employee);
        }

    }
}
