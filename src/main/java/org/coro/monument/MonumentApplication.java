package org.coro.monument;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.coro.monument.repository",
		                       "org.coro.monument.service"})
public class MonumentApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonumentApplication.class, args);
	}

}
