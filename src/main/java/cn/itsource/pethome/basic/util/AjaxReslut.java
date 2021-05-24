package cn.itsource.pethome.basic.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 查询结果封装类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AjaxReslut {
    private Boolean success=true;
    private String msg;
}
