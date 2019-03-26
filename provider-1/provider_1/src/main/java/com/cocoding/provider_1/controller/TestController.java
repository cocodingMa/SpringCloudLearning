package com.cocoding.provider_1.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
public class TestController {

    private static final Logger LOG = Logger.getLogger(TestController.class.getName());

    @RequestMapping("/hello")
    public String hello() {
        LOG.log(Level.INFO, "provider_1 is running");
        return "hello, the hello from provide_1";
    }

}
