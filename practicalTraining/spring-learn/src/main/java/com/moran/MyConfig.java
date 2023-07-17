package com.moran;

import com.moran.dao.UserDao;
import com.moran.dao.UserDapImp;
import com.moran.service.UserService;
import com.moran.service.UserServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class MyConfig {
    @Bean
    public UserDao getUserDao() {
        return new UserDapImp();
    }
    @Bean
    public UserService getUserService() {
        UserServiceImp userService = new UserServiceImp();
        userService.setUserDao(getUserDao());
        return userService;
    }

}
