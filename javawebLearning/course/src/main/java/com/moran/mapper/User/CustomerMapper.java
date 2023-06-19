package com.moran.mapper.User;

import com.moran.pojo.Customer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface CustomerMapper {
    @Select("select * from lease_customer")
    public List<Customer> selectCustomer();

    List<Customer> selectCustomerBy(String customerId, String customerName);

    /**
     * 查询总记录数
     * @return
     */
//    @Select("select count(*) from lease_customer")
//    public Integer count();

    /**
     * 分页查询，获取列表数据
     * @return
     */
//    @Select("select * from lease_customer limit #{start},#{pageSize}")
//    public List<Customer> pageSelect(Integer start, Integer pageSize);
      public List<Customer> pageSelect(String customerId, String customerName);

    void deleteCustomer(List<Integer> ids);

    @Insert("insert into lease_customer(customer_id,  name, create_time) values(#{customer_id}, #{name}, #{create_time})")
    void insertCustomer(Customer customer);

    @Select("select count(*) from lease_customer where customer_id = #{customerId}")
    Integer selectCustomerById(String customerId);

    @Insert("insert into lease_customer(customer_id, name, create_time,password)" +
            "values (#{customerId},#{name},#{createTime},#{password})")
    void register(Customer customer);


    List<Customer> getCustomer(Customer customer);
}
