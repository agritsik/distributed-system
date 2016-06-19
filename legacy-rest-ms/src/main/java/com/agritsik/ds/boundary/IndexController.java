package com.agritsik.ds.boundary;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${spring.application.name}")
    private String app;

    @RequestMapping("/")
    public String index(){
        return "Hello from " + app;
    }
}
