package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klu.service.CalciService;

@RestController
@RequestMapping("/calculator")
public class CalciController {
	@Autowired
	private CalciService service;
	//Addition-RequestParam
	@RequestMapping("/add")
	public int add(@RequestParam int a, @RequestParam int b) {
		return service.add(a, b);
	}
	//subtraction-pathVariable
	@RequestMapping("/subtract/{a}/{b}")
	public int subtract(@PathVariable int a, @PathVariable int b) {
		return service.subtract(a, b);
	}
	//multipication-pathVariable
		@RequestMapping("/multiply/{a}/{b}")
		public int multiply(@PathVariable int a, @PathVariable int b) {
			return service.multiply(a, b);
		}
		//Division-RequestParam
		@RequestMapping("/divide")
		public double divide(@RequestParam int a, @RequestParam int b) {
			return  service.divide(a, b);
		}
		//Module-RequestParam
		@RequestMapping("/module")
		public int module(@RequestParam int a, @RequestParam int b) {
			return service.module(a, b);
		}

}
