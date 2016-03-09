package com.maxxton.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class DemoServerServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoServerServiceApplication.class, args);
	}
}
