package com.nttdata.bootcamp.responsability;

import lombok.Builder;

@Builder
public class Unidad {
private String nombre;
private Unidad subordinado;
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
 * @return the subordinado
 */
public Unidad getSubordinado() {
	return subordinado;
}
/**
 * @param subordinado the subordinado to set
 */
public void setSubordinado(Unidad subordinado) {
	this.subordinado = subordinado;
}

public void ejecutarOrden() {
	if(subordinado!=null) {
		System.out.println("pasa la orden");
		
	}else {
		System.out.println("realizalo tu mismo");
	}
}

}
