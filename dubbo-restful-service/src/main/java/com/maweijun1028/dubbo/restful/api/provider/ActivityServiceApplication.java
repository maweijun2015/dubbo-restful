package com.maweijun1028.dubbo.restful.api.provider;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource("classpath:dubbo-provider.xml")
public class ActivityServiceApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(ActivityServiceApplication.class);
	public static void main(String[] args) {

		SpringApplication.run(ActivityServiceApplication.class);
	}





}
