package com.example.demo3.controller;

import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

   @GetMapping("hello")
    public  String hello(){
        return "hello word";
    }

    @PostMapping("param/hello")
    public String helloParam(@RequestBody UserExample user){
       return user.getFirstName()+user.getLastName();
    }

    @GetMapping("paramget/hello")
    public String getbodyHello(@RequestParam("firstName") String firstName,@RequestParam("lastName") String lastName){
       return "hello"+firstName+lastName;
    }
    @PutMapping("put/(firstName)")
    public String sayHello(@PathVariable String firstName,@RequestParam(value = "lastName") String lastName){
       return "Hello"+firstName+""+lastName+"!";
    }

}
