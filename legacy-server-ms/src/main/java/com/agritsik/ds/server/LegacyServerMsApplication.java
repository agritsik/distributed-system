package com.agritsik.ds.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class LegacyServerMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(LegacyServerMsApplication.class, args);
	}
}
