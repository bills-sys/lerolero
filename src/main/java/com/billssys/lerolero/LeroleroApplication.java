package com.billssys.lerolero;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LeroleroApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeroleroApplication.class, args);

		System.out.println("Result => " + foo());
		System.out.println("Exit!");
	}

	public static int foo() {
		double result = 0;
		for (int i=1; i<21; i++) {
			result += Math.pow(2, i);
		}
		return (int) result;
	}

}
