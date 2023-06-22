package com.jtf.security.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/noAuth/rest")
public class NoAuthController {

    @GetMapping("/greeting")
    public String greeting(){
        return "Spring Security Example !!";
    }
}
