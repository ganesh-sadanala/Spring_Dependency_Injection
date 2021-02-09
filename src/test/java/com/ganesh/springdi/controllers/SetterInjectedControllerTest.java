package com.ganesh.springdi.controllers;

import com.ganesh.springdi.services.GreetingServiceImpl;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {

    SetterInjectedController setterInjectedController;

    @BeforeEach
    void setUp() {

        setterInjectedController = new SetterInjectedController();

        setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    void getGreeting() {

        System.out.println(setterInjectedController.getGreeting());
    }
}