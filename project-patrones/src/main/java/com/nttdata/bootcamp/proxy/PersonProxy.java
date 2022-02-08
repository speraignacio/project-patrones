package com.nttdata.bootcamp.proxy;

import com.nttdata.bootcamp.Person;

import lombok.Builder;

@Builder
public class PersonProxy implements IPersonaProxy{
	
	private Person person;
	
	@Override
	public void operacion() {
		
		
		System.out.println("antes");
		person.operacion();
		System.out.println("despues");
		
	}
	
	
	public PersonProxy(Person person) {
		super();
		this.person = person;
	}
	
	

}
