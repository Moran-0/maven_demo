package com.moran.controller.User;

import com.moran.pojo.Manager;
import com.moran.pojo.Result;
import com.moran.service.User.ManagerService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Slf4j

public class ManagerController {
    @Autowired
    private ManagerService managerService;

    @GetMapping("/managers")
    public Result selectManagersBy(String userId, String shopId){
        log.info("查询管理员信息,参数:{},{}", userId, shopId);
        List<Manager> managers = managerService.selectManagersBy(userId, shopId);
        return Result.success(managers);

    }
    @PostMapping("/managers")
    public Result addManager(@RequestBody Manager manager){
        log.info("添加管理员，参数：{}",manager);
        managerService.addManager(manager);
        return Result.success();
    }
}
