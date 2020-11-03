package com.lh.bootandshriodemo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
    @RequestMapping("/index")
    public String sayHello(){
        return "index";
    }
}
