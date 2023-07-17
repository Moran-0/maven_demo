package com.moranAu.Service;

import com.moranAu.Pojo.User;

import java.util.List;

public interface UserService {
    List<User> selectUsersService();

    Integer addUser(User user);

    Integer updatePasswordService(Integer id, String password);
    Integer deleteUserService(Integer id);
    User loginService(User user);
}
