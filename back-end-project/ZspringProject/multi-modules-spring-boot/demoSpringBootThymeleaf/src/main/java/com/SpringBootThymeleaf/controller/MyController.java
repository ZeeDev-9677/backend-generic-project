package com.SpringBootThymeleaf.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class MyController {

	@RequestMapping(value="/home",method=RequestMethod.GET)
	public String home(Model model) { 
		System.out.println("My Channel!!!");
		//putting data in model
		model.addAttribute("name","AlphaBeta");
		model.addAttribute("currentDate",new Date().toLocaleString());
		return "home"; //home.html page return
		
	}
}
