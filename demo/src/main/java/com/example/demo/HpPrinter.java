package com.example.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class HpPrinter implements Printer{
	
	@Value("${count}")
	private int count;
	
	@Override
	public void print(String message) {
		count--;
		System.out.println("HP Printer: " + message);
		System.out.println("Remaining times: " + count);
	}
}
