package com.moranAu.Mapper;

import com.moranAu.Pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface UserMapper {
    List<User> selectUsers();

    Integer addUser(User user);
    Integer updatePassword(@Param("id") Integer id, @Param("password") String password);

    Integer deleteUser(Integer id);

    User login(User user);
}
