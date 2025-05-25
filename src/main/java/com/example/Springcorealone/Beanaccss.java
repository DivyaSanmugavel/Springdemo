package com.example.Springcorealone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Beanaccss {
    @Autowired
    Beancreation greeting;
    public void demo()
    {
        greeting.greet();
    }


}
