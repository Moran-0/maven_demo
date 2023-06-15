package com.moran.controller.Customer;

import com.moran.pojo.Customer;
import com.moran.pojo.Result;
import com.moran.service.Customer.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class CustomerController {
    @Autowired
    private CustomerService customerService;
    @GetMapping("/customers")
    public Result selectCustomer(){
        log.info("查询全部顾客信息");
        List<Customer> customers = customerService.selectCustomer();
        return Result.success(customers);
    }
}
