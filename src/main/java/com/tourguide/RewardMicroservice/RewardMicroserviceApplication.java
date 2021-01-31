package com.tourguide.RewardMicroservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties
public class RewardMicroserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(RewardMicroserviceApplication.class, args);
	}

}
