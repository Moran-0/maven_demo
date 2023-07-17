package com.moran.service.Order;

import com.moran.Pojo.OrderPage;

public interface OrderService {
    OrderPage pageSelect(Integer page, Integer pageSize, Integer orderId, String customerId);
}
