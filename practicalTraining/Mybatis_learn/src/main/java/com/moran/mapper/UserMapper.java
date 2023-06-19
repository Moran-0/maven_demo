package com.moran.mapper;

import com.moran.pojo.User;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {

    List<User> selectUsers();

    User selectUser(Integer id);

    void addUser(User user);

    void updateUser(User user);

    @Delete("delete from t_user where id = #{id}")
    void deleteUser(Integer id);

    /*参数为list*/
    Integer deleteUsers(@Param("ids") List<Integer> ids);

    /*参数为数组*/
    List<User> selectUsersFor(int[] ids);

    List<User> selectUsersMap(Map map);



}
