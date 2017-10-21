package services;

import models.Greeting;

import java.util.concurrent.atomic.AtomicLong;

public class NewGreeting {

    private static final String template = "Hello, %s!";
    private static final AtomicLong counter = new AtomicLong();

    public static Greeting newGreeting(String name){
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }


}
