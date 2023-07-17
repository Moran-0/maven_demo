package com.moran.Controller;

import com.moran.Pojo.User;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@RestController
public class TestController {
    @GetMapping("/hello")
    public String hello() {
        return "hello world!";
    }

    @GetMapping("/simple")
    public String simple(String name, Integer age) {
        return name + "-" + age;
    }

    @GetMapping("/array")
    public String array(int[] ids) {
        return Arrays.toString(ids);
    }

    @RequestMapping("/user")
    public User user(User user) {
        System.out.println(user);
        user.setId(99);
        return user;
    }
}
