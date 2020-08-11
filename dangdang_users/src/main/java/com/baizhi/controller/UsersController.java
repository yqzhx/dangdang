package com.baizhi.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
