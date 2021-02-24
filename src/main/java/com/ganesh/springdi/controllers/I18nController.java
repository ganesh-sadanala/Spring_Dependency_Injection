package com.ganesh.springdi.controllers;

import com.ganesh.services.GreetingService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

// profiles makes spring apps behave differently in different environments
// Return two different languages depending on the profile
// Loads the active profile service into the context and ignore other
@Controller
public class I18nController {

    private final GreetingService greetingService;

    public I18nController(@Qualifier("I18nService") GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
