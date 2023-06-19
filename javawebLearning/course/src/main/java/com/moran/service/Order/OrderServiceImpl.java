package com.moran.service.Order;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.moran.mapper.Order.OrderMapper;
import com.moran.pojo.Order;
import com.moran.pojo.OrderPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService{
    @Autowired
    private OrderMapper orderMapper;

    @Override
    public OrderPage pageSelect(Integer page, Integer pageSize, Integer orderId, String customerId) {
        PageHelper.startPage(page,pageSize);
        List<Order> orders = orderMapper.pageSelect(orderId,customerId);
        Page<Order> p = (Page<Order>) orders;
        OrderPage orderPage = new OrderPage(p.getTotal(),p.getResult());
        return orderPage;


    }
}
