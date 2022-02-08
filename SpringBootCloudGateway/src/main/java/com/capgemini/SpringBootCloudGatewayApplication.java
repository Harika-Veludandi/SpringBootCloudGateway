package com.capgemini;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringBootCloudGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootCloudGatewayApplication.class, args);
	}

}
