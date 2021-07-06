package ar.edu.java.pb2.clubDeLosHomero;

import static org.junit.Assert.*;

import org.junit.Test;

public class ClienteTest {

	@Test
	public void dosClientesConElMismoNombreSeanIguales() {
		Cliente cliente1 = new Cliente("Roberto", 22);
		Cliente cliente2 = new Cliente("Alberto", 25);
		Cliente cliente3 = new Cliente("Alberto", 44);

		assertTrue(cliente2.equals(cliente3));
		assertFalse(cliente1.equals(cliente2));		
	}

}
