package com.moran.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class HandlerController {
    @GetMapping("/hello-1")
    public String hello(){
        System.out.println("1-Hello!");
        return "hello----------";

    }
    @GetMapping("/login")
    public String login(HttpSession httpSession){
        System.out.println("Login OK!");
        httpSession.setAttribute("Global User","Moran");
        return "OK";
    }
    @GetMapping("/logout")
    public String logOut(HttpSession httpSession){
        System.out.println("Logout");
        httpSession.invalidate();//销毁session
//        Object globalUser = httpSession.getAttribute("Global User");
//        System.out.println(globalUser);
        return "LOG OUT!";
    }
    @GetMapping("/news")
    public String readNews(){
        System.out.println("readNews");
        return "readNews";
    }

}
