package com.swust.consumer;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

//PRODUCER:指向要访问的服务
//configuration = FooConfiguration.class  Feign Client配置类，指定负载均衡策略

//fallback = MyFeignClientImpl.class: MyFeignClient接口的实现类，需要复写 provide方法，并实现错误处理逻辑
//当访问出现故障，程序会自动调用实现类的 provide方法的错误处理逻辑。
@FeignClient(value = "PRODUCER",configuration = FooConfiguration.class,fallback = MyFeignClientImpl.class)
public interface MyFeignClient {

    //当此方法被调用会自动请求到 PRODUCER服务的 /provide 资源
    @RequestMapping(value = "/provide")
    public String provide(@RequestParam("name") String name);

}
