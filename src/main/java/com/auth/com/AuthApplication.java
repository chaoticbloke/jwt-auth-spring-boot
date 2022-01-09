package com.auth.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//take cares of auto configurations and component scanning in our APP
public class AuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
		//bootstrap our app or loads of all beans setup up DB etc
	}

}
