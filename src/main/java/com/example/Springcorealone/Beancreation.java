package com.example.Springcorealone;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class Beancreation {
    public void greet() {
        System.out.println("Hello from GreetingService Bean!");
    }
}
