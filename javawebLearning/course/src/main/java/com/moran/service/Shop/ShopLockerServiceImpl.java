package com.moran.service.Shop;

import com.moran.mapper.Shop.ShopLockerMapper;
import com.moran.pojo.ShopLocker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopLockerServiceImpl implements ShopLockerService {
    @Autowired
    private ShopLockerMapper shopLockerMapper;
    @Override
    public List<ShopLocker> getShopLockerList(String shopName, Integer modelId) {
        List<ShopLocker> shopLockers = shopLockerMapper.selectShopLockers(shopName,modelId);
        return shopLockers;
    }

    @Override
    public void addShopLocker(Integer modelId, Integer shopId, Integer num) {
        shopLockerMapper.updateShopLockers(modelId,shopId,num);
    }

    @Override
    public Integer getCount(Integer modelId, Integer shopId) {
        Integer count = shopLockerMapper.getCount(shopId,modelId);
        return count;
    }
}
