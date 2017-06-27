package com.zql.springcloud.eureka;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//@RefreshScope,在执行http://localhost/refresh,(post请求)时会刷新bean中变量值
@RefreshScope
@SpringBootApplication
@RestController
public class Application {
	@Value("${bar:world!}")
	String bar;
	
	@RequestMapping("/")
	String hello(){
		return "Hello "+bar+"!";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
}
