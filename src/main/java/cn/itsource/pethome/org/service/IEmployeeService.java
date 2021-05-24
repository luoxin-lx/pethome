package cn.itsource.pethome.org.service;

import cn.itsource.pethome.basic.service.IBaseService;
import cn.itsource.pethome.org.domain.Employee;


public interface IEmployeeService extends IBaseService<Employee> {
    /**
     * 添加和修改员工
     * @param employee
     */
    void saveOrUpdate(Employee employee);
}
