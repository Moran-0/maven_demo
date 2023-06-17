package com.moran.controller.User;

import com.moran.pojo.Customer;
import com.moran.pojo.CustomerPage;
import com.moran.pojo.Result;
import com.moran.service.User.CustomerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j//日志输出
@CrossOrigin
public class CustomerController {

    @Autowired
    private CustomerService customerService;
    @GetMapping("/customersN")
    public Result selectCustomer(){
        log.info("查询全部顾客信息");
        List<Customer> customers = customerService.selectCustomer();
        return Result.success(customers);
    }

    @GetMapping(value ={"/customerN/{customerId}/{customerName}","/customerN/{customerId}","/customerN/{customerName}"})
    public Result getCustomerBy(@PathVariable(required = false) String customerId,@PathVariable(required = false) String customerName){
        log.info("通过条件查询顾客信息");
        List<Customer> customers = customerService.selectCustomerBy(customerId, customerName);
        log.info("tete");
        return Result.success(customers);
    }
    @GetMapping("/customer")
    public Result pageCustomer(@RequestParam(defaultValue = "1") Integer page,
                               @RequestParam(defaultValue = "5") Integer pageSize,
                               String customerId,String customerName){
        log.info("分页查询customer，参数：{},{},{},{}",page,pageSize,customerId,customerName);
        CustomerPage customerPage = customerService.pageSelect(page,pageSize,customerId,customerName);
        return Result.success(customerPage);

    }
    @GetMapping("/customer/{ids}")
    public Result deleteCustomer(@PathVariable List<Integer> ids){

        log.info("删除员工，参数：{}",ids);
        customerService.deleteCustomer(ids);
        return Result.success();
    }

    @PostMapping("/customer")
    public Result addCustomer(@RequestBody Customer customer){
        log.info("新增员工，参数：{}",customer);
        customerService.addCustomer(customer);
        return Result.success();
    }
}
