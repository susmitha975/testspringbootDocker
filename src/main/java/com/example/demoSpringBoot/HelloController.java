package com.example.demoSpringBoot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/getStatus")
    public String gethealthStatus(){
        return "Checking health";

    }
}
