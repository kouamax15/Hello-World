package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller

public class HomeController {

    @RequestMapping ("/contact")
    public String homepage (){
    return "index";

}

}

