package com.robixe.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		var ctx = SpringApplication.run(DemoApplication.class, args);
		First first = ctx.getBean(First.class);
		System.out.println(first.hello());
	}

	public First 	myfirstClass ()
	{
		return new First() ;
	}
}
