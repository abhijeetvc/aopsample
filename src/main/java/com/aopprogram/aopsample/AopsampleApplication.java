package com.aopprogram.aopsample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@EnableAspectJAutoProxy
public class AopsampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(AopsampleApplication.class, args);
	}

}
