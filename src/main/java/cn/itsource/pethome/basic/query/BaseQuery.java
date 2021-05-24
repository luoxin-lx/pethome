package cn.itsource.pethome.basic.query;

import lombok.Data;

/**
 * 基础查询条件封装类
 */
@Data
public class BaseQuery {
    private Integer pageSize;
    private Integer currentPage;

    public Integer getBegin()
    {
        return (this.currentPage-1) * pageSize;
    }

}
