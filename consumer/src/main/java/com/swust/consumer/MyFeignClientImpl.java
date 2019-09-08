package com.swust.consumer;

import org.springframework.stereotype.Component;

@Component
public class MyFeignClientImpl implements MyFeignClient {
    @Override
    public String provide(String name) {
        return "你好,"+name+"，访问出现错误";
    }
}