package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class Test {

    @GetMapping("/")
    public String hello() {
        return "Hello, I am here";
    }

}
