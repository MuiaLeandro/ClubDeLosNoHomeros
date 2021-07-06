package ar.edu.java.pb2.clubDeLosHomero;

import java.util.Comparator;

public class PorEdadComparator implements Comparator<Cliente> {

	@Override
	public int compare(Cliente cliente1, Cliente cliente2) {
		int compareNumber;
		
		compareNumber = (cliente1.getEdad().compareTo(cliente2.getEdad()));
		
		if (compareNumber==0) {
			compareNumber = cliente1.getNombre().compareTo(cliente2.getNombre());
		}
		
		return compareNumber;		
	}
}
