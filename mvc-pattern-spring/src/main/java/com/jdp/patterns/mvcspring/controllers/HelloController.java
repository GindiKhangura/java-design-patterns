package com.jdp.patterns.mvcspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {

	@RequestMapping("/hello")
	public String hello(ModelMap modelMap) {
		modelMap.addAttribute("msg", "Dude");
		return "helloMvc";
	}

}
