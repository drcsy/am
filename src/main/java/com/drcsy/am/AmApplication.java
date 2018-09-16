package com.drcsy.am;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@MapperScan("com.drcsy.am.dao")
@EnableSwagger2
public class AmApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmApplication.class, args);
	}
}
