package com.nttdata.bootcamp;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProjectPatronesApplication implements CommandLineRunner  {

	public static void main(String[] args) {
		SpringApplication.run(ProjectPatronesApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
    	Person person1 = new Person("Juan", 22);
    	Person person2 = new Person("Pedro", 32);
    	
    	Person person3 = person2.clone();
    	System.out.println(person1);
    	System.out.println(person2);
    	System.out.println(person3);
    	
    	Person person = Person.builder().edad(45).nombre("Alfonso").build();
	}

}
