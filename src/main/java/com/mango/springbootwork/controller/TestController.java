package com.mango.springbootwork.controller;

import org.springframework.scheduling.annotation.Async;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wangjingyuan
 * @date 2024/1/4
 */
@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping("/filter")
    public String testFilter(){
        System.out.println("我是 TestController 的 testFilter 方法");
        return "hello";
    }
}
