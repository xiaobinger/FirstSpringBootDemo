package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	
	
	@RequestMapping("/hello")
	public String HelloWorld(Model model,String name) {
		model.addAttribute("name", name);
		return "hello";
	}
}
