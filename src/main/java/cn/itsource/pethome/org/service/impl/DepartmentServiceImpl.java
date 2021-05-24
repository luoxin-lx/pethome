package cn.itsource.pethome.org.service.impl;

import cn.itsource.pethome.basic.service.impl.BaseServiceImpl;
import cn.itsource.pethome.org.domain.Department;
import cn.itsource.pethome.org.mapper.DepartmentMapper;
import cn.itsource.pethome.org.service.IDepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DepartmentServiceImpl extends BaseServiceImpl<Department> implements IDepartmentService {
    @Autowired
    private DepartmentMapper departmentMapper;
    /**
     * 添加和修改部门功能
     *
     * @param department
     */
    @Override
    @Transactional
    public void saveOrUpdate(Department department) {
        if(department.getId()!=null)
        {
            departmentMapper.update(department);
        }else{
            departmentMapper.add(department);
        }

    }

}
