package com.example.demo;

import com.example.demo.repository.PollRepository;
import com.example.demo.repository.UserRepository;
import com.example.demo.user.Poll;
import com.example.demo.user.User;
import org.springframework.boot.ConfigurableBootstrapContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication

public class DemoApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext ConfigurableApplicationContext =
				SpringApplication.run(DemoApplication.class, args);
		UserRepository userRepository =
				ConfigurableApplicationContext.getBean(UserRepository.class);
		User myUser = new User("test","test2","test3");
		userRepository.save(myUser);

		PollRepository pollRepository = ConfigurableApplicationContext.getBean(PollRepository.class);
		List<String> myComment = new ArrayList<>();
		myComment.add("ACESTE ESTE UN COMENTARIU");
		Poll myPoll = new Poll(1,myComment,20);
		pollRepository.save(myPoll);

	}


}
