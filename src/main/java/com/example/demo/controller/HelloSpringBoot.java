package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBoot {

    @RequestMapping(path = {"/helloWorld"})
    public String HelloSpring (){
        System.out.println("helloWorld");
        return "hello world spring boot";
    }
}