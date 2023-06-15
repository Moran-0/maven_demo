package com.moran.service.Customer;

import com.moran.mapper.Customer.CustomerMapper;
import com.moran.pojo.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerMapper customerMapper;
    /**
     * 查询顾客的全部信息
     *
     * @return
     */
    @Override
    public List<Customer> selectCustomer() {
        return customerMapper.selectCustomer();
    }
}
