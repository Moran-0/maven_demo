package com.moran.mapper.Shop;

import com.moran.Pojo.ShopLocker;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ShopLockerMapper {
    List<ShopLocker> selectShopLockers(String shopName, Integer modelId);

    void updateShopLockers(Integer modelId, Integer shopId, Integer num);

    @Select("select count(*) from shop_locker where shop_id = #{shopId} and model_id = #{modelId}")
    Integer getCount(Integer shopId, Integer modelId);
}
