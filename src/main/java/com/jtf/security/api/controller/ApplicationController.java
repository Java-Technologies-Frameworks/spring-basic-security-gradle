package com.jtf.security.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/auth")
public class ApplicationController {

    @GetMapping("/getMessage")
    public String message() {
        return "Welcome to Qulaigytech Basic Security Example !!";

    }
}
