package com.cocoding.feign.service.impl;

import com.cocoding.feign.service.FeignService;
import org.springframework.stereotype.Service;

@Service
public class FeignServiceImpl implements FeignService {

    @Override
    public String testFeign() {
        // 触发断路器
        return "trigger Feign";
    }
}
