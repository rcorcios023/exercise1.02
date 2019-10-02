package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {

    @RequestMapping("/")
    public String homePage(Model model){
        model.addAttribute("myVar", "Hello World.");
        model.addAttribute("firstVar", "Hello!! This is my first Inteli-J String Variable");
        return "hometemplate";

    }
}
