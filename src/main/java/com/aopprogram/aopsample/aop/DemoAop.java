package com.aopprogram.aopsample.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class DemoAop {

    @After(" execution (* com.aopprogram.aopsample.impl.DemoImpl.doSomething(..))")
    void checkAopImpl(){
        System.out.println("Before Advice executed");
    }
}
