package com.example.demo.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerDemo {

	@RequestMapping(value = { "/", "hi", "hello" }, method = RequestMethod.GET)
	public String hello() {
		return "hello";
	}

	@RequestMapping("/hello/{name}/{age}")
	public String index(@PathVariable String name, @PathVariable String age) {
		return "Hello " + name + ", " + "you are " + age + " years old!";
	}

}
