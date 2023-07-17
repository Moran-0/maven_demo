package com.moran.mapper.Order;

import com.moran.Pojo.Order;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface OrderMapper {
    /**
     * 订单信息分页查询
     * @param orderId
     * @param customerId
     * @return
     */
    List<Order> pageSelect(Integer orderId, String customerId);
}
