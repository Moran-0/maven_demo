package com.moran.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * customer信息分页查询封装类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerPage {
    private Long total;
    private List rows;//分页数据列表
}
