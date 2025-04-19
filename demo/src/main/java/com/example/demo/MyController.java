package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping("/test1")
	public String test1(@RequestParam Integer id) {
		System.out.println("id = " + id);
		return "請求成功";
	}
	
	@RequestMapping("/test2")
	public String test2(@RequestBody Student student) {
		System.out.println("student's id = " + student.getId());
		System.out.println("student's name: " + student.getName());
		return "請求成功";
	}
	
	@RequestMapping("/test3")
	public String test3(@RequestHeader String info) {
		System.out.println("info = " + info);
		return "請求成功";
	}
	
	@RequestMapping("/test4/{id}")
	public String test4(@PathVariable Integer id) {
		System.out.println("id = " + id);
		return "請求成功";
	}
}
