package com.example.june.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller // ①
public class HelloController {
    @GetMapping("/") // ②
    public String hello() {
        return "welcome"; // ③
    }
}