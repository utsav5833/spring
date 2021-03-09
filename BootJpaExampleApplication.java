package com.jpa.test;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootJpaExampleApplication {

	public static void main(String[] args) {
		
		ApplicationContext context=	SpringApplication.run(BootJpaExampleApplication.class, args);
	userRepo UserRepo=	context.getBean(userRepo.class);
	
//User1 u1= new User1();
//u1.setCity("utsav");
//u1.setStatus("I am a Programer");
//u1.setCity("delhi");
//
//	User1 save = UserRepo.save(u1);
	//System.out.println(save);
	User1 u1= new User1();
	u1.setName("utsav");
	u1.setCity("dehli");
	u1.setStatus("java programer");
	
	User1 u2= new User1();
	u2.setName("ankit");
	u2.setCity("bombay");
	u2.setStatus("python programer");
	
//	List<User1> user=List.of(u1,u2);
//	
//	Iterable<User1> result=UserRepo.saveAll(user);
// @formatter:on

	
	User1 save=UserRepo.save(u2);
	
	System.out.println(save);
	System.out.println("Done");
	}

}
