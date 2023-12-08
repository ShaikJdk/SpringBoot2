package com.example.sampleweb2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class Sampleweb2Application extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(Sampleweb2Application.class, args);
	}

	 @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
	        return builder.sources(Sampleweb2Application.class);
	    }
}
