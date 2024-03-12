package com.example.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FirstApplication {

	public static void main(String[] args) {
		var contxt =SpringApplication.run(FirstApplication.class, args);

		MyService myService=contxt.getBean(MyService.class);
		System.out.printf(myService.myService());
	}

//	@Bean
//	public MyFirstClass myFirstClass(){
//		return new MyFirstClass();
//	}


}
