package com.moran;

import com.moran.mapper.User.CustomerMapper;
import com.moran.mapper.User.ManagerMapper;
import com.moran.pojo.Customer;
import com.moran.pojo.Manager;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

@SpringBootTest
class CourseApplicationTests {
    @Autowired
    private CustomerMapper customerMapper;
    @Autowired
    private ManagerMapper managerMapper;
    @Test
    void test(){
//        List<Customer> customers = customerMapper.selectCustomerBy(null, "曾");
//        System.out.println(customers);
//        List<Manager> managers = managerMapper.selectManagersBy("admin",null);
//        System.out.println(managers); //查询管理员
        Manager manager = new Manager();
        manager.setUserId("fzyyye");
        manager.setUserName("倥");
        manager.setCreateId("admin");
        manager.setStatus(true);
        manager.setCreateTime(LocalDateTime.now());
        manager.setShopId(2);
        managerMapper.insertManager(manager);
    }

}
