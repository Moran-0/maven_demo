package com.moran.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * order信息分页查询封装类
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderPage {
    private Long total;
    private List rows;
}
