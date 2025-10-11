package com.springdemo.mvc;
@Controller
public class HomeController {
@RequestMapping(value="homepagelogin.h")
public String HomePage() {
	return "menu-page";
}
}
