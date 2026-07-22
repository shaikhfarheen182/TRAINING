package com.group.SpringBootWeb.WebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
public class HomeController {
	
	@ModelAttribute("course")
	public String courseName() {
		return "java";
	}
	
	@RequestMapping("/")
	public String home() {
		System.out.println("home method called");
		return "index";
	}
	
	
	@RequestMapping("/addAlien")
	public String addAlien(@ModelAttribute Alien alien){
	    System.out.println(alien.getAid());
	    System.out.println(alien.getAname());
	    return "result";
	}

}
