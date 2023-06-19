package com.moran.mapper.Shop;

import com.moran.pojo.Shop;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ShopMapper {
    List<Shop> selectShop(String name, String province);

    @Select("select count(*) from sys_user where user_id = #{userId}")
    Integer getCount(String userId);

    @Insert("insert into shop_shop(id, name, province, city, district, address, tel, owner, status, owner_id, create_time) " +
            "values(#{id},#{name},#{province},#{city},#{district},#{address},#{tel},#{owner},#{status},#{ownerId},#{createTime})")
    void addShop(Shop shop);

    @Select("select user_name from sys_user where user_id = #{ownerId}")
    String getName(String ownerID);
}
