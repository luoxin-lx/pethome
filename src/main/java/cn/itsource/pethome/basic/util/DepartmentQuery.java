package cn.itsource.pethome.basic.util;

import cn.itsource.pethome.basic.query.BaseQuery;
import lombok.Data;

/**
 * 部门查询条件封装类
 */
@Data
public class DepartmentQuery extends BaseQuery {
    private String name;
    private Integer state;

}
