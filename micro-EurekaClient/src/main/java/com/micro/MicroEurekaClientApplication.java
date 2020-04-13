package com.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MicroEurekaClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroEurekaClientApplication.class, args);
	}

}
