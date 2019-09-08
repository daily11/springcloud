package com.swust.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerController {

//    //注入http请求工具 restTemplate
//    @Autowired
//    private RestTemplate restTemplate;
//
//    @RequestMapping("/consumer")
//    public String consumer(@RequestParam("name") String name) {
//        //执行http请求Producer服务的provide映射地址，返回的数据为字符串类型
//        //PRODUCER：提供者(Producer服务)的注册服务ID
//        //provide ：消费方法
//        String result = restTemplate.getForObject("http://PRODUCER/provide?name=" + name, String.class);
//        return result;
//    }

    @Autowired
    private MyFeignClient myFeignClient;

    @RequestMapping("/feign")
    public String feignTest(@RequestParam("name") String name){
        return myFeignClient.provide(name);
    }
}

