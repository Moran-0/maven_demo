package com.moran.controller.Locker;

import com.moran.Pojo.LockerPage;
import com.moran.Pojo.LockerType;
import com.moran.Pojo.Result;
import com.moran.service.Locker.LockerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
public class LockerController {
    @Autowired
    private LockerService lockerService;
    @GetMapping("/lockers")
    public Result pageLocker(@RequestParam(defaultValue = "1") Integer page,@RequestParam(defaultValue = "10") Integer pageSize,
                             String type, Double capacity){
        log.info("分页查询箱柜信息，参数：{},{},{},{}",page,pageSize,type,capacity);
        try{
            LockerPage lockerPage = lockerService.pageSelect(page,pageSize,type,capacity);
            return Result.success(lockerPage);
        }catch (Exception e){
            return Result.error(e.toString());
        }

    }

    /**
     * 获取指定门店的箱柜类型
     * @param shopId
     * @return
     */
    @GetMapping("/getLockerType")
    public Result getLockerType(Integer shopId){
        log.info("获取指定门店的箱柜类型,参数：{}",shopId);
        try{
            List<LockerType> typeList = lockerService.getLockerType(shopId);
            if (typeList.isEmpty()) return Result.error("该门店无可用箱柜");
            else return Result.success(typeList);
        }catch (Exception e){
            return Result.error(e.toString());
        }

    }
}
