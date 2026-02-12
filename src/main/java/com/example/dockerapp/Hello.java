package com.example.dockerapp;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Hello {

    @Value("${APP_ENV:UNKNOWN}")
    private String appEnv;

    @GetMapping("/he")
    public String get() {

        return "Hello from added qa,prod and dev";
    }

    @Value("${GREETING_MESSAGE:Hello}")
    private String greetingMessage;

    @GetMapping("/hello")
    public String hello() {
        return greetingMessage;
    }
}
