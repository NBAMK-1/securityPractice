package com.example.securitypractice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {

    @GetMapping("/hello")
    public  String sayHello(){
        return "hello ";
    }

    @GetMapping("/bye")
    public String getbye(){
        return "bye";
    }
}
