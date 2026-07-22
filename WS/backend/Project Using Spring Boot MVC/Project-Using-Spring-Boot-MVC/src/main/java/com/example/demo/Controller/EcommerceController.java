package com.example.demo.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EcommerceController {

	
	@GetMapping("/greet")
	public String greet() {
		return "WELCOME TO ECOMMERCE APPLICATION";
	}
	
	
	
}
