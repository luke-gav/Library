package com.luke.library.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	
    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("Test", "Test");
        System.out.println("TEST WORLD2");
    	return "index";
    }
}
