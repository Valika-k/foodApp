package com.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class FoodAppProjectApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext1 = SpringApplication.run(FoodAppProjectApplication.class,
				args);
	}
}