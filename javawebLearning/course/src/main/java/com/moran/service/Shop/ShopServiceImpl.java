package com.moran.service.Shop;

import com.moran.mapper.Shop.ShopMapper;
import com.moran.pojo.Shop;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@Slf4j
public class ShopServiceImpl implements ShopService{

    @Autowired
    private ShopMapper shopMapper;
    @Override
    public List<Shop> getShopList(String name, String province) {
        List<Shop> shopList = shopMapper.selectShop(name, province);
        return shopList;
    }

    @Override
    public Integer getCount(String userId) {
        return shopMapper.getCount(userId);
    }

    @Override
    public void addShop(Shop shop) {
        shop.setCreateTime(LocalDateTime.now());
        shop.setStatus("在营");
        String name = shopMapper.getName(shop.getOwnerId());
        log.info(name);
        shop.setOwner(name);
        shopMapper.addShop(shop);
    }

    @Override
    public List<Shop> getShopsByDistrict(String district) {
        return shopMapper.selectShopByDistrict(district);
    }
}
