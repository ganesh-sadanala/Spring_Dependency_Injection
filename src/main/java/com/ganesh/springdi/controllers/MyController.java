package com.ganesh.springdi.controllers;

import com.ganesh.springdi.services.GreetingService;
import org.springframework.stereotype.Controller;

// annotate it as a spring managed controller
@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){

        return greetingService.sayGreeting();
    }
}
