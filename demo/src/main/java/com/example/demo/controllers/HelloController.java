package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller //how we tell Spring what to do
public class HelloController {

    @GetMapping("/hello")
    public String sayHello(
            @RequestParam(defaultValue = "World", required = false) String name,
            Model model) {
        model.addAttribute("user", name);
        return "Hello";
    }
}
