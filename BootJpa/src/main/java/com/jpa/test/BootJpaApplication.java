package com.jpa.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootJpaApplication {

	public static void main(String[] args) {
		
		ApplicationContext context =  SpringApplication.run(BootJpaApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		User user = new User();
		user.setName("deva");
		user.setCity("jajpur");
		user.setStatus("java prog.");
		
		User user1 = userRepository.save(user);
		System.out.println(user1);
	}
}
