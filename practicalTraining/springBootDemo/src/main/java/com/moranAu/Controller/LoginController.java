package com.moranAu.Controller;

import com.moranAu.Pojo.Result;
import com.moranAu.Pojo.User;
import com.moranAu.Service.UserService;
import jakarta.servlet.http.HttpSession;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class LoginController {// /api
    @Autowired
    private UserService userService;

    @PostMapping("/login")
    public Result login(User user, HttpSession httpSession) {
        log.info("用户登录，参数：{}", user);
        User user1 = userService.loginService(user);
        if (user1 != null){
            httpSession.setAttribute("UserInfo",user1);
            return Result.success("登录成功！");
        }
        else
            return Result.error("登录失败！");
    }
    @GetMapping("/logout")
    public Result logout(HttpSession httpSession){
        httpSession.invalidate();
        return Result.success("退出登录");
    }
}
