package com.moran;

import com.moran.Pojo.User;
import com.moran.service.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        UserService userService = applicationContext.getBean(UserService.class);
//        List<User> userList = userMapper.selectUsers();
//        System.out.println(userList);
        User user = new User(null, "NoJerry!!", "121212", "杰瑞");
        userService.addService(user);//spring集成的mybatis默认自动提交事务
    }
}
