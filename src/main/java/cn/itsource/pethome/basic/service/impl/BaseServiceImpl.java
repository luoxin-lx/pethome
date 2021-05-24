package cn.itsource.pethome.basic.service.impl;

import cn.itsource.pethome.basic.mapper.BaseMapper;
import cn.itsource.pethome.basic.query.BaseQuery;
import cn.itsource.pethome.basic.service.IBaseService;
import cn.itsource.pethome.basic.util.PageBean;
import cn.itsource.pethome.org.domain.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional(readOnly = true,propagation = Propagation.SUPPORTS)
public class BaseServiceImpl<T> implements IBaseService<T> {
    @Autowired
    private BaseMapper<T> baseMapper;
    /**
     * 修改员工
     *
     * @param t
     */
    @Override
    @Transactional
    public void update(T t) {
    baseMapper.update(t);
    }

    /**
     * 根据用户id删除员工
     *
     * @param id
     */
    @Override
    @Transactional
    public void delete(Long id) {
    baseMapper.delete(id);
    }

    /**
     * 根据选择的id批量删除员工
     *
     * @param t
     */
    @Override
    @Transactional
    public void batchRemove(T[] t) {
    baseMapper.batchRemove(t);
    }

    /**
     * 通过员工id查询部门人员信息
     *
     * @param id
     * @return
     */
    @Override
    public T loadById(Long id) {
        return baseMapper.loadById(id);
    }

    /**
     * 查询所有的员工
     *
     * @return
     */
    @Override
    public List<T> loadAll() {
        return baseMapper.loadAll();
    }

    /**
     * 根绝条件查询，数据
     *
     * @param query 查询条件的封装
     * @return PageBean：数据结果的分装类
     */
    @Override
    public PageBean<T> loadByQuery(BaseQuery query) {
        Integer total = baseMapper.findCount(query);
        if("0".equals(total))
        {
            return new PageBean<>();
        }
        List<T> result = baseMapper.findByQuery(query);
        return new PageBean<>(total,result);
    }
}
