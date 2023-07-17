package com.moran.controller.Order;

import com.moran.Pojo.OrderPage;
import com.moran.Pojo.Result;
import com.moran.service.Order.OrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class OrderController {
    @Autowired
    private OrderService orderService;
    @GetMapping("/orders")
    public Result getOrder(@RequestParam(defaultValue = "1") Integer page, @RequestParam(defaultValue = "10") Integer pageSize,
                           Integer orderId,String customerId){
        log.info("分页查询order，参数：{},{},{},{}",page,pageSize,orderId,customerId);
        try{
            OrderPage orderPage = orderService.pageSelect(page,pageSize,orderId,customerId);
            return Result.success(orderPage);
        }catch (Exception e){
            return Result.error(e.toString());
        }
    }

}
