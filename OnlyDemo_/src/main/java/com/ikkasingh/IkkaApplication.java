package com.ikkasingh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IkkaApplication {

	public static void main(String[] args) {
		SpringApplication.run(IkkaApplication.class, args);
		System.out.println("Hello spring");
		for (int i = 0; i <= 5; i++) {
			System.out.println("Hello programmer");
		}
	}

}
