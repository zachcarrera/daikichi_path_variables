package com.zachcarrera.daikichipathvariables.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/daikichi")
public class DaikichiController {
	
	@RequestMapping("")
	public String welcome() {
		return "Welcome!";
	}
	
	@RequestMapping("/today")
	public String today() {
		return "Today you will find luck in all your endeavors";
	}

	@RequestMapping("/tomorrow")
	public String tomorrow() {
		return "Tomorrow, an oportunity will arise, so be sure to be open to new ideas!";
	}
	
	
	// paths with path variables
	@RequestMapping("/travel/{city}")
	public String travel(@PathVariable("city") String city) {
		return String.format("Congradulations! You will soon travel to %s!", city);
	}
	
	@RequestMapping("/lotto/{lottoNumber}")
	public String lotto(@PathVariable("lottoNumber") Integer lottoNumber) {
		if(lottoNumber % 2 == 0) {
			return "You will take a grand journey in the near future, but be weary of tempting offers";
		}
		
		return "You have enjoyed the fruits of your labor but now is a great time to spend time with family and friends";
	}

}
