package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.annotation.AnalysisActuator;

@RestController
public class RestControllerDemo {

	@RequestMapping(value = { "/", "hi", "hello" }, method = RequestMethod.GET)
	@AnalysisActuator
	public ResponseEntity<String> hello() {
		return new ResponseEntity<String>("hello",HttpStatus.OK);
	}

	@RequestMapping("/hello/{name}/{age}")
	public String index(@PathVariable String name, @PathVariable String age) {
		return "Hello " + name + ", " + "you are " + age + " years old!";
	}
	
	@RequestMapping("/hello/william")
	public String helloWilliam() {
		return "Hello William, you are forever young.";
	}

}
