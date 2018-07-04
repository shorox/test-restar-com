package com.retar.test.testrestarcom.constroller;

import java.util.concurrent.atomic.AtomicLong;

import com.retar.test.testrestarcom.model.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

//@RestController
public class GreetingController {

    private static final String TEMPLATE = "Hello, %s!";
    private final AtomicLong COUNTER = new AtomicLong();

//    @RequestMapping("/Greeting")
//    public Greeting greeting(@RequestParam(value="name", defaultValue="World") String name) {
//        return new Greeting(COUNTER.incrementAndGet(), String.format(TEMPLATE, name));
//    }
}
