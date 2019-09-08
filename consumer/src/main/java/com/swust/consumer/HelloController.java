package com.swust.consumer;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Value("${notify}")    //从配置中取值
    private String notify;

    @RequestMapping("/hello")
    public String hello(){
        return notify;
    }
}