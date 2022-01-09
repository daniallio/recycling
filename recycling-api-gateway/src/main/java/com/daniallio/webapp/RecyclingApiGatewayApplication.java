package com.daniallio.webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix //per gestire i down dei microservizi
public class RecyclingApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecyclingApiGatewayApplication.class, args);
	}

}
