package com.tts.SpringBootIntro.controllers;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	/*@RequestMapping("/")
	public String home() {
		return "Hello World!";
	}*/
	
	@RequestMapping("/test")
	public String testPage() {
		return "Test screen";
	}
	
	public static void main(String[] args) throws Exception {
	        SpringApplication.run(MainController.class, args);
	    }
}
