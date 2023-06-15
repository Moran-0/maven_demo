package com.moran.service.Customer;

import com.moran.pojo.Customer;

import java.util.List;

public interface CustomerService {
    /**
     * 查询顾客的全部信息
     * @return
     */
    public List<Customer> selectCustomer();
}
