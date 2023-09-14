package com.example.getstring;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController

public class MyController {
    @GetMapping("/")
    public String myController() {
        return "Wellcome to Spring Boot";
    }

}