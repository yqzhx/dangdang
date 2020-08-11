package com.baizhi.controller;

import com.baizhi.entity.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class UsersController {
    @Value("${server.port}")
    private int port;

    @GetMapping("/user/user")
    public Map<String, Object> user() {
        Map<String, Object> map = new HashMap<>();
        map.put("status", true);
        map.put("msg", port);
        System.out.println(map);
        return map;
    }

    @GetMapping("user/showOne")
    public Map<String,Object> showOne(){
        User user = new User();
        user.setId("1").setUsername("zhx").setBir(new Date());
        Map<String, Object> map = new HashMap<>();
        map.put("status", true);
        map.put("date", user);
        map.put("msg", port);
        System.out.println(map);
        return map;
    }
}
