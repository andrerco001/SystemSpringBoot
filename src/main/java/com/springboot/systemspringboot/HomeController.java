package com.springboot.systemspringboot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("message", "This message was injected by model");
        return "index";
    }
}
