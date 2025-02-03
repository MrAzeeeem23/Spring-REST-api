package com.beats.testing.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/")
    public String defaultRoute(){
        return "this is default route, use /getResponse in";
    }
    @GetMapping("/getResponse")
    public String getResponse(){
        return "this is a testing text from spring boot";
    }

    @GetMapping("/send")
    public String greet(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello, " + name + "!";
    }
}
