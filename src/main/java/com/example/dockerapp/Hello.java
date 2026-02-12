package com.example.dockerapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Value("${APP_ENV:UNKNOWN}")
    private String appEnv;

    @GetMapping("/hello")
    public String get() {

        return "Hello from new app";
    }

    @GetMapping("/hel")
    public String hello() {
        return "Hello from dockerapp - Environment: " + appEnv;
    }
}
