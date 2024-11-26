package com.example.demo.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jakarta.websocket.server.PathParam;

@RestController
public class ClientDemo {
	
	@GetMapping(path = "/")
	public String demo() {
		return "Uppalapati Sai Gandhi"; 
	}

	@GetMapping(path="/demo1")
	public String demo1() {
		return "JFSD Section 18";
	}
	
	@GetMapping(path="/demo2")
	public int demo2() {
		return 32934;
	}
	
	@GetMapping(path="/demo3")
	public String demo3(@RequestParam("id")int sid) {
		return "Student ID Number is: "+sid;
	}
	
	@GetMapping(path="/demo4")
	public String demo4(@RequestParam("a")int num1,@RequestParam("b") int num2) {
		return "Sum of two numbers is: "+Integer.toString(num1+ num2);
	}
	
	@GetMapping(path="/demo5")
	public String demo5(@RequestParam("x")String firstname,@RequestParam("y") String lastname) {
		return firstname+" "+lastname;
	}
	
	@GetMapping(path="/demo6/{id}")
	public String demo6(@PathVariable("id") int sid) {
		return "Strudent id number is: "+sid;
	}
	
	@GetMapping(path="/demo7/{fname}/{lname}")
	public String demo7(@PathVariable("fname") String firstname,@PathVariable("lname") String lastname) {
		return "Student First name and Last name is: "+firstname +" "+ lastname;
	}
	
}
