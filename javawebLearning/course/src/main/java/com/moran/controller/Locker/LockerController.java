package com.moran.controller.Locker;

import com.moran.pojo.LockerPage;
import com.moran.pojo.Result;
import com.moran.service.Locker.LockerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
}
