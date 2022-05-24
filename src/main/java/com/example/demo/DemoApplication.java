package com.example.demo;

import com.example.demo.repository.UserRepository;
import com.example.demo.user.User;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ConfigurableApplicationContext =
				SpringApplication.run(DemoApplication.class, args);
		UserRepository userRepository =
				ConfigurableApplicationContext.getBean(UserRepository.class);
		User myUser = new User("test","test2","test3");
		userRepository.save(myUser);
	}


}
