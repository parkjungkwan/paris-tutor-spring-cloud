package com.example.demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Value("${demo.message}")
    private String message;

    @GetMapping("/")
    public String getMessage() {
        return message;
    }
}