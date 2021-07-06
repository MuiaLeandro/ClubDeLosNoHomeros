package ar.edu.java.pb2.clubDeLosHomero;

import java.util.HashSet;
import java.util.Set;

public class Bar {

	private String nombre;
	private Boolean estadoDeApertura;
	private Set<Cliente> clientes;

	public Bar(String nombre) {
		this.nombre = nombre; 
		this.estadoDeApertura = Boolean.FALSE;
		clientes = new HashSet<>();
	}

	
	public void abrirBar() {
		this.estadoDeApertura = true;
	}

	public Boolean estaAbierto() {
		return this.estadoDeApertura;
	}


	public Set<Cliente> getClientes() {
		
		return this.clientes;
	}


	public void agregarCliente(String nombre, Integer edad) {
		Cliente nuevo = new Cliente(nombre, edad);
		
		clientes.add(nuevo);		
	}
	
	

}
