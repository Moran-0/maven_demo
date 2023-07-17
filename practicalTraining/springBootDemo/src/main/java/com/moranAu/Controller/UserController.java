package com.moranAu.Controller;

import com.moranAu.Pojo.Result;
import com.moranAu.Pojo.User;
import com.moranAu.Service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@Slf4j
// /api
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/selectUser")
    public Result selectUsers() {
        log.info("选择所有用户");
        List<User> users = userService.selectUsersService();
        return Result.success(users);
    }

    @PostMapping("/addUser")
    public Result addUser(User user) {
        log.info("添加新用户,参数：{}", user);
        Integer t = userService.addUser(user);
        if (t != null)
            return Result.success("添加用户成功:" + t);
        else
            return Result.error("添加用户失败");
    }

    @GetMapping("/updatePassword")
    public Result updatePassword(Integer id, String password) {
        log.info("修改密码,参数：{},{}", id, password);
        Integer t = userService.updatePasswordService(id, password);
        if (t == 1)
            return Result.success("修改密码成功，id:" + id + ",password:" + password);
        else
            return Result.error("修改密码失败，id:" + id + "password:" + password);
    }

    @GetMapping("/deleteUser")
    public Result deleteUser(Integer id) {
        log.info("删除用户,参数：{}", id);
        Integer t = userService.deleteUserService(id);
        if (t == 1)
            return Result.success("成功删除用户，id：" + id);
        else
            return Result.error("删除用户失败，id：" + id);
    }

}
