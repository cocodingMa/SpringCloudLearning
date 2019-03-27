package com.cocoding.feign.controller;

import com.cocoding.feign.service.FeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class FeignController {
    @Autowired
    private FeignService feignService;

    private static final Logger LOG = Logger.getLogger(FeignController.class.getName());

    @RequestMapping(value = "/feign-consumer", method = RequestMethod.GET)
    public String testFeign(){
        LOG.log(Level.INFO, "feign consumer");
        return feignService.testFeign();
    }
}
