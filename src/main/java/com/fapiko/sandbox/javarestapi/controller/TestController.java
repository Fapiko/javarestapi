package com.fapiko.sandbox.javarestapi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/test")
public class TestController {

	@RequestMapping(value="/", method = RequestMethod.GET)
	public String helloArnold() {
		return "Hello, Arnold Facepalmer!";
	}

}
