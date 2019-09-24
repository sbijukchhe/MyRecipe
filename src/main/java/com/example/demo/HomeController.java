package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/index")
    public String indexpage(){
        return "index";
    }

    @RequestMapping("/home")
    public String homePage(){
        return "home";
    }
}