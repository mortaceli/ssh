package com.mort.demo.controller;

import java.text.SimpleDateFormat;

import javax.print.attribute.standard.DateTimeAtCompleted;
import javax.xml.crypto.Data;


import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
@RequestMapping("/welcome")

public class demo {
	 @RequestMapping(method = RequestMethod.GET)
	 public String printWelcome(ModelMap model) {
		 
	        model.addAttribute("message", "message from controller ");
	        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy年MM月dd日");
	        model.addAttribute("date", dateFormat.format(new java.util.Date()));
	        return "demo";
	    }
	 
	
	

}



