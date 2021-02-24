package com.ganesh.springdi.controllers;

import com.ganesh.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ConstructorInjectedControllerTest {

    ConstructorInjectedController constructorInjectedController;

    @BeforeEach
    void setUp() {

        constructorInjectedController = new ConstructorInjectedController(new ConstructorInjectedGreetingService());


    }

    @Test
    void getGreeting() {

        System.out.println(constructorInjectedController.getGreeting());
    }
}