package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class clientdemo {
	
	@GetMapping(path="/demo")
	public String demo() {
		return "sai gandhi";
	}
	

}
