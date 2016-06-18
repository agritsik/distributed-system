package com.agritsik.ds.boundary;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/users")
public class UserController {


    @RequestMapping("/")
    public String hello(){
        return "hello!";
    }
}
