package com.nttdata.bootcamp.decorator;

import com.nttdata.bootcamp.Person;

import lombok.Builder;

@Builder
public class Decorator implements IPersona {
	private Person person;

	@Override
	public String getNombre() {
		return person.getNombre() + " el nombre es ";
	}

	@Override
	public int getEdad() {
		return person.getEdad() * 10;
	}

}
