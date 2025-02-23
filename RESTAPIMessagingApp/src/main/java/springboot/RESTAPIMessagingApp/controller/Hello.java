package springboot.RESTAPIMessagingApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class Hello {

//UC-1
    @GetMapping
    public String display()
    {
        return "Hello from Bridge Labz!!";
    }
}
