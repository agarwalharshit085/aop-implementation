package com.example.aopimpl;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceLoggingAspect {

    @Pointcut("execution(* com.example.aopimpl.AopPrintController.*(..))")
    private void serviceMethods() {}

    @Before("serviceMethods()")
    public void beforeServiceMethodExecution() {
        System.out.println("Before executing service method...");
    }
    @After("serviceMethods()")
    public void afterServiceMethodExecution() {
        System.out.println("After executing service method...");
    }
}

