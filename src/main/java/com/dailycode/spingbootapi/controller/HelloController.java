package com.dailycode.spingbootapi.controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {
    @RequestMapping(value = "/", method = RequestMethod.GET )
    public  String helloWord(){
        return  "<h1>Well come to my first app</h1>";
    }
    @GetMapping("/name")
    public  String myName (){
        return "<h2>Zubery Pima</h2>";
    }
}
