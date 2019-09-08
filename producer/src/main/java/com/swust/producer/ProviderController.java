package com.swust.producer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController //@Controller 和 @ResponseBody 的混合注解
public class ProviderController {

    @RequestMapping("/provide")
    public String provide(@RequestParam(value = "name") String name) {
        return name + ":你好呀这里是Producer服务";
    }
}
