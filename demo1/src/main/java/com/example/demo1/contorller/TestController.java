package com.example.demo1.contorller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	@GetMapping("/")
	Student  return1() {
		Student st = new Student();
		st.setFname("Atul");
		st.setNameid(2);
		System.out.println("Atul syso");
		System.out.println("Atul syso new syso");
		return st;
	}
}
