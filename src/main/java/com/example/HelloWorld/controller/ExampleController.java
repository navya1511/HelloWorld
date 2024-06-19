package com.example.HelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExampleController {
    

    @GetMapping("/hello")
    @ResponseBody
    public String helloWorld(){
        return "hello";
    }
}
