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

    @GetMapping("/customer")
    public Result pageCustomer(@RequestParam(defaultValue = "1") Integer page,
                               @RequestParam(defaultValue = "10") Integer pageSize,
                               String customerId,String customerName){
        log.info("分页查询customer，参数：{},{},{},{}",page,pageSize,customerId,customerName);
        try{
            CustomerPage customerPage = customerService.pageSelect(page,pageSize,customerId,customerName);
            return Result.success(customerPage);
        }catch (Exception e){
            return Result.error(e.toString());
        }


    }
    @GetMapping("/customer/{ids}")
    public Result deleteCustomer(@PathVariable List<Integer> ids){

        log.info("删除顾客，参数：{}",ids);
        try{
            customerService.deleteCustomer(ids);
            return Result.success();
        }catch (Exception e){
            return Result.error(e.toString());
        }

    }

    @PostMapping("/customer")
    public Result addCustomer(@RequestBody Customer customer){
        log.info("新增顾客，参数：{}",customer);
        try{
            customerService.addCustomer(customer);
            return Result.success();
        }catch (Exception e){
            return Result.error(e.toString());
        }
    }
    @PostMapping("/register")
    public Result register(@RequestBody Customer customer){
        log.info("用户注册，参数：{}",customer);
        try{
            Boolean registerSuccess =  customerService.registerCustomer(customer);
            if (registerSuccess) return Result.success();
            else return Result.error("此号码已注册！");
        }catch (Exception e){
            return Result.error(e.toString());
        }
    }
    @PostMapping("/customerLogin")
    public Result customerLogin(@RequestBody Customer customer){
        log.info("顾客登录，参数：{}",customer);
        try{
            List<Customer> customerList = customerService.login(customer);
            if (customerList.isEmpty()) return  Result.error("登录失败！");
            else return  Result.success(customerList);
        }catch (Exception e){
            return Result.error(e.toString());
        }
    }

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
        return Result.success(customers);
    }
}
