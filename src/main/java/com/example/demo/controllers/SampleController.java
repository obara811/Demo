package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SampleController {
    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "HelloWorld";        
    }

    @GetMapping("/greet")
    public String greet() {
        return "greet";
    }

    @GetMapping(value="/greetmodel")
    public String greetModel(Model model) {
        model.addAttribute("message", "HelloWorld");
        return "greetmodel";
    }
}

