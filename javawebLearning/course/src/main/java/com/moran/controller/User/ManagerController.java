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
        try{
            List<Manager> managers = managerService.selectManagersBy(userId, shopId);
            return Result.success(managers);
        }catch (Exception e){
            return Result.error(e.toString());
        }


    }
    @PostMapping("/managers")
    public Result addManager(@RequestBody Manager manager){
        log.info("添加管理员，参数：{}",manager);
        try{
            if (manager.getUserId() == null || manager.getUserId()=="")
                return Result.error("请正确填写账号信息！");
            Integer count = managerService.getCount(manager.getUserId());
            if (count >= 1) return Result.error("账号已存在！");
            managerService.addManager(manager);
            return Result.success();
        }catch (Exception e){
            return Result.error(e.toString());
        }

    }
    @GetMapping("/managers/{userId}/{status}")
    public Result changeManagerStatus(@PathVariable String userId, @PathVariable boolean status){
        log.info("修改管理员状态，参数：{},{}",userId,status);
        try{
            managerService.changeStatus(userId,!status);
            return Result.success();
        }catch (Exception e){
            return Result.error(e.toString());
        }


    }
    @PostMapping("/adminLogin")
    public Result managerLogin(@RequestBody Manager manager){
        log.info("管理员登录，参数：{}",manager);
        try{
            List<Manager> managerList = managerService.login(manager);
            if (managerList.isEmpty()) return Result.error("登录失败！");
            else return Result.success(managerList);
        }catch (Exception e){
            return Result.error(e.toString());
        }
    }
}
