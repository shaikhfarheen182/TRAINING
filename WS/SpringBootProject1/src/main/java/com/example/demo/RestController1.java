package com.example.demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestController1 {

	@GetMapping("/test")
	public ResponseEntity<Map> test() {
		System.out.println("test");
		Map<String, Integer> maptest = new HashMap<>();
		maptest.put("apb", 123);
		maptest.put("xyz", 456);
		return ResponseEntity.ok().body(maptest);

	}

	@PostMapping("/test2")
	public ResponseEntity<List> test2() {
		
		System.out.println("test2");
		List<String> listtest = new ArrayList<>();
		listtest.add("completed");
		return ResponseEntity.ok().body(listtest);
	}

}
