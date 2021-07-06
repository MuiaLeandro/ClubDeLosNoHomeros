package ar.edu.java.pb2.clubDeLosHomero;

import java.util.TreeSet;

public class Bar {

	private String nombre;
	private Boolean estadoDeApertura;
	private TreeSet<Cliente> clientes;

	public Bar(String nombre) {
		this.nombre = nombre; 
		this.estadoDeApertura = Boolean.FALSE;
		clientes = new TreeSet<Cliente>();
	}

	
	public void abrirBar() {
		this.estadoDeApertura = true;
	}

	public Boolean estaAbierto() {
		return this.estadoDeApertura;
	}


	public TreeSet<Cliente> getClientes() {
		
		return this.clientes;
	}


	public void agregarCliente(String nombre, Integer edad) {
		Cliente nuevo = new Cliente(nombre, edad);
		
		clientes.add(nuevo);		
	}
	
	public void ordenarsePorEdad() {
		TreeSet<Cliente> nuevaLista = new TreeSet<Cliente>(PorEdadComparator);
		
	}

}
