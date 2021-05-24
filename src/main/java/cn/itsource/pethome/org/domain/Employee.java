package cn.itsource.pethome.org.domain;


import cn.itsource.pethome.basic.domain.BaseDomain;
import lombok.Data;

@Data
public class Employee extends BaseDomain {

    private String username;
    private String email;
    private String phone;
    private String password;
    private Integer age;
    private Integer state;
}
