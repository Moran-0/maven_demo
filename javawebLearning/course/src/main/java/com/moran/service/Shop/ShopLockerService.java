package com.moran.service.Shop;

import com.moran.pojo.ShopLocker;

import java.util.List;

public interface ShopLockerService {
    List<ShopLocker> getShopLockerList(String shopName, Integer modelId);

    void addShopLocker(Integer modelId, Integer shopId, Integer num);

    Integer getCount(Integer modelId, Integer shopId);
}
