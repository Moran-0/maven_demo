package com.moran.service.User;

import com.moran.pojo.Customer;
import com.moran.pojo.CustomerPage;

import java.util.List;

public interface CustomerService {
    /**
     * 查询顾客的全部信息
     * @return
     */
    public List<Customer> selectCustomer();

    /**
     * 通过条件查询顾客信息
     * @param customerId
     * @param customerName
     * @return
     */
    public List<Customer> selectCustomerBy(String customerId,String customerName);

    CustomerPage pageSelect(Integer page, Integer pageSize,String customerId,String customerName);

    void deleteCustomer(List<Integer> ids);

    void addCustomer(Customer customer);

    Boolean registerCustomer(Customer customer);

    List<Customer> login(Customer customer);
}
