package com.moran.controller.Shop;

import com.moran.pojo.Result;
import com.moran.pojo.Shop;
import com.moran.service.Shop.ShopService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class ShopController {

    @Autowired
    private ShopService shopService;
    @GetMapping("/shop")
    public Result getShopInfo(String name,String province){
        log.info("查询门店信息，参数：{},{}",name,province);
        try{
            List<Shop> shopList = shopService.getShopList(name,province);
            return Result.success(shopList);
        }catch (Exception e){
            return Result.error(e.toString());
        }

    }
    @PostMapping("/addShop")
    public Result addShop(@RequestBody Shop shop) {
        log.info("添加门店，参数：{}",shop);
        try{
            Integer count = shopService.getCount(shop.getOwnerId());
            if (count == 0) return Result.error("负责人不存在！");
            shopService.addShop(shop);
            return Result.success();
        }catch (Exception error){
            return Result.error(error.toString());
        }

    }

    /**
     * 通过区查询门店信息
     * @param district
     * @return
     */
    @GetMapping("/getShop")
    public Result getShopBy(String district){
        log.info("通过地区查询门店信息，参数：{}",district);
        try{
            List<Shop> shopList = shopService.getShopsByDistrict(district);
            if (shopList.isEmpty()) return Result.error("找不到门店");
            else return Result.success(shopList);
        }catch (Exception e){
            return Result.error(e.toString());
        }

    }
}
