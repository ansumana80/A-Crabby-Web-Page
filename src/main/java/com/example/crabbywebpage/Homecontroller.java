package com.example.crabbywebpage;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homecontroller {
    @RequestMapping("/index")
    public String HomePage(){
        return "index";
    }
}
