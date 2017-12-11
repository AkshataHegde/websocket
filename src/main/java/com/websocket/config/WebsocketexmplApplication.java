package com.websocket.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EntityScan("com.websocket.entity")
@EnableJpaRepositories("com.websocket.*")
@EnableAutoConfiguration
@SpringBootApplication
@ComponentScan("com.websocket.*")
public class WebsocketexmplApplication{

	public static void main(String[] args) {
		
		SpringApplication.run(WebsocketexmplApplication.class, args);
	}
}
