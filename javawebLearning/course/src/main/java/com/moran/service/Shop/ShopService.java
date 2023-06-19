package com.moran.service.Shop;

import com.moran.pojo.Shop;

import java.util.List;

public interface ShopService {
    List<Shop> getShopList(String name, String province);

    Integer getCount(String userId);

    void addShop(Shop shop);
}
