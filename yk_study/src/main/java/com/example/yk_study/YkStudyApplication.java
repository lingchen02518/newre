package com.example.yk_study;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.yk_study.mapper")
public class YkStudyApplication {
	public static void main(String[] args) {
		SpringApplication.run(YkStudyApplication.class, args);
	}
}