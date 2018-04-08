package spring.boot.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuickStartApplication {

	public static void main(String[] args) {
		System.setProperty("spring.thymeleaf.cache", "false");
		SpringApplication.run(QuickStartApplication.class, args);
	}
}
