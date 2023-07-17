package com.moran.controller.Shop;

import com.moran.Pojo.Result;
import com.moran.Pojo.ShopLocker;
import com.moran.service.Shop.ShopLockerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class ShopLockerController {
    @Autowired
    private ShopLockerService shopLockerService;

    @GetMapping("/shopLockers")
    public Result getShopLockers(String shopName,Integer modelId){
        log.info("查询门店寄存柜信息，参数：{},{}",shopName,modelId);
        try{
            List<ShopLocker> shopLockerList = shopLockerService.getShopLockerList(shopName,modelId);
            return Result.success(shopLockerList);
        }catch (Exception e){
            return Result.error(e.toString());
        }

    }
    @GetMapping("/addShopLocker")
    public  Result addShopLocker(Integer modelId,Integer shopId,Integer num){
        log.info("添加寄存柜数量，参数：{},{},{}",modelId,shopId,num);
        try{
            if (num == null) return Result.error("未填写添加数量！");
            Integer count = shopLockerService.getCount(modelId,shopId);
            if (count != 1) return Result.error("门店ID或型号ID填写错误！");
            shopLockerService.addShopLocker(modelId,shopId,num);
            return Result.success();
        }catch (Exception e){
            return Result.error(e.toString());
        }
    }

}
