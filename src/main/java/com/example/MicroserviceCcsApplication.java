package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.example")
@EnableDiscoveryClient
public class MicroserviceCcsApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroserviceCcsApplication.class, args);
	}
}
