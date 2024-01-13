package com.shubham.quizapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testAPI {
    @GetMapping("/test")
    public static String testing(){
        return "API test approved ✔✔";
    }
}
