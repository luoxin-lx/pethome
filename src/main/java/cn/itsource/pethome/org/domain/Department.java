package cn.itsource.pethome.org.domain;

import cn.itsource.pethome.basic.domain.BaseDomain;
import lombok.Data;

/**
 * 部门实体类
 */
@Data
public class Department extends BaseDomain {

    //部门编号
    private String sn;
    //部门名称
    private String name;
    //部门状态，1正常，0禁用,
    private String state;
    //部门管理员
    private Employee manager;
    //上级部门
    private Department parent;

}
