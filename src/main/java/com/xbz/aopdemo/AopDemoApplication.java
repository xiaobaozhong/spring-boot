package com.xbz.aopdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Repository;

@SpringBootApplication

@MapperScan(
		basePackages = "com.xbz.aopdemo.dao",
		annotationClass = Repository.class)
public class AopDemoApplication {

	@Bean(name="myAspect")
	public MyAspect initMyAspect(){
		return new MyAspect();
	}

	public static void main(String[] args) {
		SpringApplication.run(AopDemoApplication.class, args);
	}
}
