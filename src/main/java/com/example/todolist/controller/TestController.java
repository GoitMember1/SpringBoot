package com.example.todolist.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping("/test")
    public String test() {
        return "Test successful!";
    }
    @GetMapping("/test-template")
    public String testTemplate() {
        return "test";
    }
}