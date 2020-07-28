package com.wl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/test")
public class TestController {
    @GetMapping("hello")
    public Object hello(){
        return Map.of("code",200, "desc", "成功");
    }
}
