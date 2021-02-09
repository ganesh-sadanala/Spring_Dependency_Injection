package com.ganesh.springdi.controllers;

import org.springframework.stereotype.Controller;

// annotate it as a spring managed controller
@Controller
public class MyController {

    public String sayHello(){
        System.out.println("Hello India!!");

        return "Namaste Folks";
    }
}
