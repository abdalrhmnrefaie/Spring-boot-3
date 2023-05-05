package com.global.hr;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeWs {

	@GetMapping("/")
	public String getName() {
		
		return "Hi Abdalrhmn , ";
	}
}
