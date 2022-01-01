package com.daniallio.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RecyclingApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecyclingApiGatewayApplication.class, args);
	}

}
