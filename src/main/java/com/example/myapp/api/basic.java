package com.example.myapp.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class basic {
    @GetMapping("/get")
    public String massage() {
        return "Hello programmers keep motivated";
    }

    @GetMapping("/message")
    public void messagge() {
        System.out.println("yes it is");
    }
}