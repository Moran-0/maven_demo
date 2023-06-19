package com.moran.service.Order;

import com.moran.pojo.Order;
import com.moran.pojo.OrderPage;

import java.util.List;

public interface OrderService {
    OrderPage pageSelect(Integer page, Integer pageSize, Integer orderId, String customerId);
}
