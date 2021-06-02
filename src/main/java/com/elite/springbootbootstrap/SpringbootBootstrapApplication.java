package com.elite.springbootbootstrap;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan(basePackages = "com.elite.springbootbootstrap.mapper")
public class SpringbootBootstrapApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootBootstrapApplication.class, args);
	}

}
