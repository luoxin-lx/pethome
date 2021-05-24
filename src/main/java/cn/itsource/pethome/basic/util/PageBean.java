package cn.itsource.pethome.basic.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页结果封装类
 * @param <T>可以传入不同的实体类
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageBean<T> {
    private Integer total = null;
    private List<T> result = new ArrayList<>();
}
