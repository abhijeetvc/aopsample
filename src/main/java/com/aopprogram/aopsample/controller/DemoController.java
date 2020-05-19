package com.aopprogram.aopsample.controller;

import com.aopprogram.aopsample.impl.DemoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @Autowired
    private DemoImpl demoImpl;

    @GetMapping(value="/check")
    public String cherckAop(){
        return demoImpl.doSomething();
    }
}
