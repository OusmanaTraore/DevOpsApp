package com.gtm.devops.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	@RequestMapping(value="/login", method = RequestMethod.GET)
	public String loginMessage(){
		return "login";
	}

	@RequestMapping(value="/login", method = RequestMethod.POST)
	public String showDayofBirth(ModelMap model, @RequestParam int year, @RequestParam int month, @RequestParam int day){
		model.put("year", year);
		model.put("month", month);
		model.put("day", day);
		if (day > 31) {
			return "error";
		}
		return "dayofbirth";
	}
}
