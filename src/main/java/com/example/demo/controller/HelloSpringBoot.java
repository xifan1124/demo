package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloSpringBoot {

    @RequestMapping(path = {"/helloWorld"})
    public String HelloSpring (){
        System.out.println("helloWorld spring boot");
        return "hello world spring boot";
    }

    @RequestMapping(path = {"/helloWorld2345"})
    public String helloWorld2 (){
        System.out.println("helloWorld spring boot2345");
        return "hello world spring boot2345";
    }
}