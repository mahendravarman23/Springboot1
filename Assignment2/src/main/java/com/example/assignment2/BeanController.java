package com.example.assignment2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BeanController {

    @Autowired
    private ApplicationContext context;

    @GetMapping("/beans")
    public String[] getBeans() {
        return context.getBeanDefinitionNames();
    }
}