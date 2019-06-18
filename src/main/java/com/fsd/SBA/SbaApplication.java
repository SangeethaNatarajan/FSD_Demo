package com.fsd.SBA;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.ComponentScan;

import com.fsd.controller.TaskRESTController;



@SpringBootApplication
@EnableAutoConfiguration
//@ComponentScan(basePackageClasses=TaskRESTController.class)
public class SbaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SbaApplication.class, args);
	}

}
