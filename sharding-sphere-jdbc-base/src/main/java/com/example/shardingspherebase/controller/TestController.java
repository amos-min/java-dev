package com.example.shardingspherebase.controller;

import com.example.shardingspherebase.dao.OrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    private OrderMapper orderMapper;

    @GetMapping("/test")
    public void test(){
        orderMapper.insert(1L);
    }
}
