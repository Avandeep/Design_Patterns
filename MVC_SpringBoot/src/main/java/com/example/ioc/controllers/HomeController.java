package com.example.ioc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	@RequestMapping("/hello")
	public String hello(ModelMap modelMap)
	{
		modelMap.addAttribute("msg", "Avan");
		return "helloMvc";
		
	}
}
