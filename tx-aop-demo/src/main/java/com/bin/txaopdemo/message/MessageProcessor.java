package com.bin.txaopdemo.message;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MessageProcessor {

    @Before("execution(void com.bin.txaopdemo.message.*.printMessage())")
    public void beforeprocess() {
        System.out.println("before process");
    }

    @After("execution(void com.bin.txaopdemo.message.*.printMessage())")
    public void afterprocess() {
        System.out.println("after process");
    }
}
