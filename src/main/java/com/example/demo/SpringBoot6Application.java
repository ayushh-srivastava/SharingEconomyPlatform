package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.example.controller"})
@ComponentScan({"com.example.service"})
@EnableJpaRepositories(basePackages="com.example.dao")
@EntityScan({"com.example.Entity"})

public class SpringBoot6Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringBoot6Application.class, args);
	}

}
