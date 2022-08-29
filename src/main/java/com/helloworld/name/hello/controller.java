package com.helloworld.name.hello;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class controller {
	
	@GetMapping("/")
	public String hello() {
		System.out.println("hello World");
		return "NewFile";
	}

}
