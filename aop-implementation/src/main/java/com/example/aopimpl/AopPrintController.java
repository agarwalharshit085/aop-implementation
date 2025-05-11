package com.example.aopimpl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AopPrintController {
    @GetMapping("/aop")
    public String printMessage(){
        Hello_Service hs = new Hello_Service();
        System.out.println("executing printMessage: "+hs.printService());

        return "Successfully Implemented AOP";
    }
}
