package com.ganesh.springdi.controllers;

import com.ganesh.springdi.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

// Mimick what spring framework does
// Dependency injection without spring DI / with maual DI
class PropertyInjectedControllerTest {

    PropertyInjectedController propertyInjectedController;

    // configure before the test runs
    @BeforeEach
    void setUp() {
        propertyInjectedController = new PropertyInjectedController();

        propertyInjectedController.greetingService = new ConstructorInjectedGreetingService();

    }

    @Test
    void getGreeting() {

        System.out.println(propertyInjectedController.getGreeting());
    }
}