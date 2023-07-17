package com.moran.service;

import com.moran.mapper.UserMapper;
import com.moran.Pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImp implements UserService {

    /*sping 框架注入*/
    @Autowired
    private UserMapper userMapper;

    @Override
    public void selectService() {
        userMapper.selectUsers();
    }

    @Override
    public Integer addService(User user) {
        Integer total = userMapper.addUser(user);
        return total;

    }
}
