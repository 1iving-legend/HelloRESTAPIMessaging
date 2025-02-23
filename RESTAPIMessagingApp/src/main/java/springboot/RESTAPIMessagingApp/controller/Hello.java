package springboot.RESTAPIMessagingApp.controller;

import org.springframework.web.bind.annotation.*;
import springboot.RESTAPIMessagingApp.UserDTO;

@RestController
@RequestMapping("/hello")
public class Hello {

//UC-1
    @GetMapping
    public String display()
    {
        return "Hello from Bridge Labz!!";
    }

    //UC2
    @GetMapping("/query")
    public String sayHello2(@RequestParam String name){
        return "Hello "+ name + " from BridgeLabz";
    }

    //UC-03
    @GetMapping("/param/{name}")
    public String sayHello3(@PathVariable String name){
        return "Hello "+ name + " from BridgeLabz";
    }

    //UC4
    //UC-04
    @PostMapping("/post")
    public String sayHello(@RequestBody UserDTO user) {
        return "Hello " + user.getFirstName() + " " + user.getLastName() + " from BridgeLabz!";
    }
}
