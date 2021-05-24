package cn.itsource.pethome.basic.service;


import cn.itsource.pethome.basic.query.BaseQuery;
import cn.itsource.pethome.basic.util.PageBean;


import java.util.List;

public interface IBaseService<T> {
    /**
     * 修改员工
     * @param t
     */
    void update(T t);
    /**
     * 根据用户id删除员工
     */
    void delete(Long id);
    /**
     * 根据选择的id批量删除员工
     */
    void batchRemove(T[] t);
    /**
     * 通过员工id查询部门人员信息
     * @param id
     * @return
     */
    T loadById(Long id);

    /**
     * 查询所有的员工
     * @return
     */
    List<T> loadAll();

    /**
     * 根绝条件查询，数据
     * @param query 查询条件的封装
     * @return PageBean：数据结果的分装类
     */
    PageBean<T> loadByQuery(BaseQuery query);

}
