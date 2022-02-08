package com.nttdata.bootcamp;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {
	
	// creamos un bean que devuelve a una persona
	
	@Bean(name = "personaPrototype")
	@Scope ("prototype")
	public Person personaPrototype() {
		return new Person("Enrique", 55);
	}
	
	@Bean(name = "personaSingleton")
	@Scope ("singleton")
	public Person personaSingleton() {
		return new Person("Pedro", 22);
	}
}
