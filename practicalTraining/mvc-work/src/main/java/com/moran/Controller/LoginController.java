package com.moran.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
    @GetMapping("/login")
    public String login(String userName, String password) {
        if (userName==null||password==null) return "login_error";
        if (userName.equals("java")&&password.equals("java")){
            return "login_ok";
        }
        else return "login_error";
    }
}
