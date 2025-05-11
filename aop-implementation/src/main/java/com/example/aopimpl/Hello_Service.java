package com.example.aopimpl;

import org.springframework.stereotype.Service;

@Service
public class Hello_Service {
    public String printService(){
        System.out.println("executing printService");
       return "Welcome to my service";
    }
}
