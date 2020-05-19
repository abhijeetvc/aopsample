package com.aopprogram.aopsample.impl;

import com.aopprogram.aopsample.myinterface.DemoInterface;
import org.springframework.stereotype.Service;

@Service
public class DemoImpl implements DemoInterface {
    @Override
    public String doSomething() {
        System.out.println("Hiiiiiiiiiiiiii");
        return "Hello AOP";
    }
}
