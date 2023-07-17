package com.moran.mapper.User;

import com.moran.Pojo.Manager;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ManagerMapper {
    public List<Manager> selectManagersBy(String userId, String shopId);

    @Insert("insert into sys_user(user_id, user_name, status,create_id, create_time,shop_id) " +
            "values(#{userId}, #{userName}, #{status}, #{createId}, #{createTime},#{shopId})")
    void insertManager(Manager manager);

    void updateStatus(String userId,boolean status);

    @Select("select count(*) from sys_user where user_id = #{managerId}")
    public Integer getCount(String managerId);

    List<Manager> getUser(Manager manager);
}
