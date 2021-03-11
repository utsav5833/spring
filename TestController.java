package com.sts.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@GetMapping(path = "/hello-world")

	public String helloWorld() {
		return "  hello world ";
	}

	@GetMapping(path = "/hello-world-Bean")

	public HelloWorldBean helloworldbean() {
		return new HelloWorldBean("Hi this is my hello world 1111");
	}
	
	@GetMapping(path = "/hello-world/path-variable/{name}")

	public HelloWorldBean helloworldPath(@PathVariable String name) {
		return new HelloWorldBean(String.format("Hi this is my hello world path variable %s",name));
	}
	

}
