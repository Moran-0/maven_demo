package com.moran.mapper.Customer;

import com.moran.pojo.Customer;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CustomerMapper {
    @Select("select * from lease_customer")
    public List<Customer> selectCustomer();
}
