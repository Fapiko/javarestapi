package com.fapiko.sandbox.javarestapi.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/")
public class TestController {

	private static Logger log = Logger.getLogger(TestController.class);

	@RequestMapping(value="", method = RequestMethod.GET)
	@ResponseBody
	public String helloArnold() {
		return "Hello, ArnoldFacepalmer!";
	}

	@RequestMapping(value="jsp", method=RequestMethod.GET)
	public String helloJSP(ModelMap model) {

		model.addAttribute("content", "O'hai JSP!");
		return "test";

	}

}
