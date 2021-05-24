package cn.itsource.pethome.org.controller;

import cn.itsource.pethome.org.domain.Department;
import cn.itsource.pethome.org.service.IDepartmentService;

import cn.itsource.pethome.basic.util.AjaxReslut;
import cn.itsource.pethome.basic.util.DepartmentQuery;
import cn.itsource.pethome.basic.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
//@CrossOrigin//只支持spring4.x以上版本，低版本不支持,不建议使用
public class DepartmentController {
    @Autowired
    private IDepartmentService iDepartmentService;

    /**
     * 添加和修改部门功能
     * @param department
     * @return
     */
    @PutMapping()
    public AjaxReslut saveOrUpdate(@RequestBody Department department)
    {
        try {
            iDepartmentService.saveOrUpdate(department);
            return new AjaxReslut();
        } catch (Exception e) {
           return new AjaxReslut(false, e.getMessage());
        }
    }
    /**
     * 修改员工
     * @param department
     * @return
     */
    @PostMapping()
    public AjaxReslut update(@RequestBody Department department)//前后端分离，中间传送的数据为Json格式，接收前端json格式的数据需要在对象中标注@RequestBody才可以接收晶送数据
    {
        try {
            iDepartmentService.update(department);
            return new AjaxReslut();
        } catch (Exception e) {
            return new AjaxReslut(false, e.getMessage());
        }
    }
    /**
     * 删除员工
     * @param
     * @return
     */
    @DeleteMapping("{id}")
    public AjaxReslut delete(@PathVariable("id") Long id)
    {
        try {
            iDepartmentService.delete(id);
            return new AjaxReslut();
        } catch (Exception e) {
            return new AjaxReslut(false, e.getMessage());
        }
    }
    /**
     * 批量删除员工
     * @param
     * @return
     */
    @PatchMapping("/batchRemove")
    public AjaxReslut batchRemove(@RequestBody Department[] departments)
    {

        try {
            iDepartmentService.batchRemove(departments);
            return new AjaxReslut();
        } catch (Exception e) {
            return new AjaxReslut(false, e.getMessage());
        }

    }
    /**
     * 根据id查询一个员工
     * @param
     * @return
     */
    @GetMapping("{id}")
    public Department loadById(@PathVariable("id") Long id)
    {
       return  iDepartmentService.loadById(id);
    }

    /**
     * 查询所有员工,根据条件，查找所有符合条件的数据
     * @return PageBean
     *          total:记录的总条数
     *          result：查询出来的结果集
     */
    @PatchMapping()
    public PageBean<Department> oadByQuery(@RequestBody DepartmentQuery departmentQuery)
    {
        return iDepartmentService.loadByQuery(departmentQuery);
    }
    /**
     * 查询所有部门，在添加和修改页面回显可选择的数据
     * @return PageBean
     *          total:记录的总条数
     *          result：查询出来的结果集
     */
    @PatchMapping("/loadAll")
    public List<Department> loadAll()
    {
        return iDepartmentService.loadAll();
    }
}
