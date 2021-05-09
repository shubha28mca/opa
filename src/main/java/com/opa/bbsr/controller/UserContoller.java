package com.opa.bbsr.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class UserContoller {
    @GetMapping("/test")
    public String TestApi()
    {
        return "Hello API";
    }
}
