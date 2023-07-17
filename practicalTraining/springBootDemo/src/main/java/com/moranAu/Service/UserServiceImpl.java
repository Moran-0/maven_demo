package com.moranAu.Service;

import com.moranAu.Mapper.UserMapper;
import com.moranAu.Pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> selectUsersService() {
        return userMapper.selectUsers();
    }

    @Override
    public Integer addUser(User user) {
        return userMapper.addUser(user);
    }

    @Override
    public Integer updatePasswordService(Integer id, String password) {
        return userMapper.updatePassword(id, password);
    }

    @Override
    public Integer deleteUserService(Integer id) {
        return userMapper.deleteUser(id);
    }

    @Override
    public User loginService(User user) {
        return userMapper.login(user);
    }
}
