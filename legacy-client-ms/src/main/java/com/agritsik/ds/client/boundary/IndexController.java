package com.agritsik.ds.client.boundary;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @Value("${spring.application.name}")
    private String app;

    @Autowired
    LegacyRestClient legacyRestClient;

    @RequestMapping("/")
    public String index(){
        return "Hello from " + app;
    }

    @RequestMapping("/legacy")
    public String legacy(){
        return legacyRestClient.ping();
    }
}
