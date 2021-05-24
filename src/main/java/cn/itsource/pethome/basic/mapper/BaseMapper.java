package cn.itsource.pethome.basic.mapper;

import cn.itsource.pethome.basic.query.BaseQuery;

import java.util.List;

public interface BaseMapper<T> {
    /**
     * 添加人员
     *
     * @param t
     */
    void add(T t);

    /**
     * 修改员工
     *
     * @param t
     */
    void update(T t);

    /**
     * 根据用户id删除部门
     */
    void delete(Long id);
    /**
     * 根据所选的id批量删除部门
     */
    void batchRemove(T[] t);
    /**
     * 通过员工id查询部门信息
     *
     * @param id
     * @return
     */
    T loadById(Long id);

    /**
     * 查询所有的部门
     *
     * @return
     */
    List<T> loadAll();

    /**
     * 查询数据库中数据的总条数
     * @return
     */
    Integer findCount(BaseQuery query);

    /**
     * 根据条件，查询符合条件的结果，并封装
     * @param query
     * @return
     */
    List<T> findByQuery(BaseQuery query);
}
