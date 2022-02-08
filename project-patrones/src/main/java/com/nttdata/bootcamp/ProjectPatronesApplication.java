package com.nttdata.bootcamp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.nttdata.bootcamp.decorator.Decorator;
import com.nttdata.bootcamp.proxy.PersonProxy;
import com.nttdata.bootcamp.responsability.Unidad;

@SpringBootApplication
public class ProjectPatronesApplication implements CommandLineRunner  {
	
	@Autowired
	private ApplicationContext context;
	public static void main(String[] args) {
		SpringApplication.run(ProjectPatronesApplication.class, args);
		
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		//responsability
		
		Unidad soldado = Unidad.builder().nombre("Soldado").build();
		Unidad sargento = Unidad.builder().nombre("Sargento").subordinado(soldado).build();
		Unidad capitan = Unidad.builder().nombre("Capitan").subordinado(sargento).build();
		
		soldado.ejecutarOrden();
		sargento.ejecutarOrden();
		capitan.ejecutarOrden();
		
		
		//proxy
//		Person person = new Person("javier", 22);
//		PersonProxy personproxy = new PersonProxy(person);
//		personproxy.operacion();
		
		// decorator
//		Decorator deco = Decorator.builder().person(Person.builder().edad(45).nombre("Alfonso").build()).build();
//		System.out.println(deco.getEdad());
//		System.out.println(deco.getNombre());

//		System.out.println(context.getBean("personaPrototype").hashCode());
//		System.out.println(context.getBean("personaPrototype").hashCode());
//		System.out.println(context.getBean("personaPrototype").hashCode());
//		System.out.println(context.getBean("personaPrototype").hashCode());
//		System.out.println(context.getBean("personaPrototype").hashCode());
//
//		System.out.println(context.getBean("personaSingleton").hashCode());
//		System.out.println(context.getBean("personaSingleton").hashCode());
//		System.out.println(context.getBean("personaSingleton").hashCode());
//		System.out.println(context.getBean("personaSingleton").hashCode());
//		System.out.println(context.getBean("personaSingleton").hashCode());
//		
		
//    	Person person1 = new Person("Juan", 22);
//    	Person person2 = new Person("Pedro", 32);
//    	
		// prototype
//    	Person person3 = person2.clone();
//    	System.out.println(person1);
//    	System.out.println(person2);
//    	System.out.println(person3);
		
		// builder
    	//Person person = Person.builder().edad(45).nombre("Alfonso").build();
		
		
	}

}
