package com.nttdata.bootcamp;

import com.nttdata.bootcamp.decorator.IPersona;
import com.nttdata.bootcamp.proxy.IPersonaProxy;

public class Person implements IPrototype, IPersona, IPersonaProxy {

	private String nombre;
	private int edad;

	@Override
	public Person clone() {
		return new Person(this.nombre, this.edad);
	}

	public Person(String nombre, int edad) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		//System.out.println("Mi nombre es: " + this.nombre);
	}

	public static PersonBuilder builder() {
		return new PersonBuilder();
	}

	public static class PersonBuilder {
		private String nombre;
		private int edad;

		public PersonBuilder nombre(String nombre) {
			this.nombre = nombre;
			return this;
		}

		public PersonBuilder edad(int edad) {
			this.edad = edad;
			return this;
		}
		
		public Person build() {
			return new Person(this.nombre, this.edad);
		}

	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}

	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public void operacion() {
	System.out.println("operacion original");
		
	}

}
