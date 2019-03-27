package com.cocoding.feign.service;

import com.cocoding.feign.service.impl.FeignServiceImpl;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(value = "service-provider", fallback = FeignServiceImpl.class)
public interface FeignService {


    // 绑定service-provide服务提供者提供的'/hello' retful风格的接口
    @RequestMapping(value = "/hello")
    String testFeign();
}
