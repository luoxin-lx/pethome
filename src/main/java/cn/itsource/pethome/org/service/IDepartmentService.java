package cn.itsource.pethome.org.service;

import cn.itsource.pethome.basic.service.IBaseService;
import cn.itsource.pethome.org.domain.Department;


public interface IDepartmentService extends IBaseService<Department> {
    /**
     * 添加和修改人员
     * @param department
     */
    void saveOrUpdate(Department department);


}
