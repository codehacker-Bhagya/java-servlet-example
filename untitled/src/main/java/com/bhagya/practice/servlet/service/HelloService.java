package com.bhagya.practice.servlet.service;

public class HelloService {

    public String greet(String name){
        if(name.isEmpty()){
            return "hello world!!";
        }
        return "hello" + name ;
    }
}
