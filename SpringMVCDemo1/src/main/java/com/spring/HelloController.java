package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
@RequestMapping("/hello")
	public String redirect()
	{
		return "viewpage";
	}
@RequestMapping("helloAgain")
	public String display()
	{
		return "final";
	}
}
