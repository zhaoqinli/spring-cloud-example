package com.zql.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

/*@EnableEurekaServer
@SpringBootApplication
public class Application {
	
	public static void main(String[] args) {
		new SpringApplicationBuilder(Application.class).web(true).run(args);
	}
}*/
@Configuration
@SpringBootApplication
@RestController
@EnableConfigServer
public class Application {
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}