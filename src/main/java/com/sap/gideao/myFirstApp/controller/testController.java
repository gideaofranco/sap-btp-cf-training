package com.sap.gideao.myFirstApp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {

	@GetMapping("/version")
	public String getVersion() {
		return "Hello World. My Version is 1.0.1";
	}

}
