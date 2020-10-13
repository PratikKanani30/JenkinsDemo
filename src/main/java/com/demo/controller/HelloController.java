package com.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/greeting", produces = "application/json")
// controller to get greeting
public class HelloController {

    @GetMapping()
    public String getGreetings() {
	return "Hello from jenkins";
}
}
