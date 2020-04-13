package com.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroEurekaClient2Application {

	public static void main(String[] args) {
		SpringApplication.run(MicroEurekaClient2Application.class, args);
	}

}
