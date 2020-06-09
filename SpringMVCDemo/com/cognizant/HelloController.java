package com.cognizant;

@Controller
public class HelloController {
	@RequestMapping("/hello")
	public void printHello()
	{
		System.out.println("Hello everybody");
	}

}
