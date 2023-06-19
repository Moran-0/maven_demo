package com.moran.service.User;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.moran.mapper.User.CustomerMapper;
import com.moran.pojo.Customer;
import com.moran.pojo.CustomerPage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerMapper customerMapper;
    /**
     * 查询顾客的全部信息 discarded
     * @return
     */
    @Override
    public List<Customer> selectCustomer() {
        return customerMapper.selectCustomer();
    }

    /**
     * 通过条件查询顾客信息 discard
     * @param customerId
     * @param customerName
     * @return
     */
    @Override
    public List<Customer> selectCustomerBy(String customerId, String customerName) {
        return customerMapper.selectCustomerBy(customerId, customerName);
    }

//    @Override
//    public CustomerPage pageSelect(Integer page, Integer pageSize) {
//
//        Integer total = customerMapper.count();
//        Integer start = (page - 1) * pageSize;//起始索引
//        List<Customer> customers = customerMapper.pageSelect(start, pageSize);
//        CustomerPage customerPage = new CustomerPage(total, customers);
//        return customerPage;
//    }

    @Override
    public CustomerPage pageSelect(Integer page, Integer pageSize,String customerId, String customerName) {
        //1/设置分页参数
        PageHelper.startPage(page, pageSize);
        //2.执行查询
        List<Customer> customers = customerMapper.pageSelect(customerId,customerName);
        Page<Customer> p = (Page<Customer>) customers;
        CustomerPage customerPage = new CustomerPage(p.getTotal(), p.getResult());
        return customerPage;
    }

    @Override
    public void deleteCustomer(List<Integer> ids) {
        customerMapper.deleteCustomer(ids);
    }

    @Override
    public void addCustomer(Customer customer) {
        customer.setCreateTime(LocalDateTime.now());
        customerMapper.insertCustomer(customer);
    }

    @Override
    public Boolean registerCustomer(Customer customer) {
        Integer count = customerMapper.selectCustomerById(customer.getCustomerId());
        if (count != 0) return false;
        else {
            customer.setCreateTime(LocalDateTime.now());
            customerMapper.register(customer);
        }
        return true;
    }

    @Override
    public List<Customer> login(Customer customer) {
        List<Customer> customers = customerMapper.getCustomer(customer);
        return customers;
    }
}
