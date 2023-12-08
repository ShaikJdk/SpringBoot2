package com.example.sampleweb2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
@RequestMapping("/hellowipro")
public class Controller2 {

	@GetMapping
	public String getTreeById() {
		return "Hello Wipro";
	}
}
