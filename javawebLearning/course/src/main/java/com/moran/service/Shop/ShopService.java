package com.moran.service.Shop;

import com.moran.Pojo.Shop;

import java.util.List;

public interface ShopService {
    List<Shop> getShopList(String name, String province);

    Integer getCount(String userId);

    void addShop(Shop shop);

    List<Shop> getShopsByDistrict(String district);
}
