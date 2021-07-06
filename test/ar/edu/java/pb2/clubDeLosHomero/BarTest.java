package ar.edu.java.pb2.clubDeLosHomero;

import static org.junit.Assert.*;

import org.junit.Test;

public class BarTest {

	@Test
	public void queSePuedaAbrirSinPersonas() {
		Bar bar = new Bar("Club de los No Homeros");
		bar.abrirBar();
		assertTrue(bar.estaAbierto());
		assertTrue(bar.getClientes().isEmpty());
		
	}
	
	@Test
	public void queNoSePuedanAgregarDosPersonasConElMismoNombre() throws elBarEstaCerradoException  {
		Bar bar = new Bar("Club de los No Homeros");
		bar.abrirBar();
		bar.agregarCliente("Carlos", 42);
		bar.agregarCliente("Carlos", 25);
		bar.agregarCliente("Carlos", 42);
		bar.agregarCliente("Luis", 42);
		int cantidadDeClientesEsperada = 2;
		int cantidadDeClientesReal = bar.getClientes().size();
		
		assertEquals(cantidadDeClientesEsperada, cantidadDeClientesReal);		
	}

	@Test
	public void queSePresentenAlfabeticamente() throws elBarEstaCerradoException {
		Bar bar = new Bar("Club de los No Homeros");
		bar.abrirBar();
		bar.agregarCliente("Carlos", 42);
		bar.agregarCliente("Luis", 25);
		bar.agregarCliente("Andres", 42);
		bar.agregarCliente("Daniel", 42);
		bar.agregarCliente("Benito", 42);

		
		assertEquals(bar.getClientes().first().getNombre(), "Andres");
		assertEquals(bar.getClientes().last().getNombre(), "Luis");
	}

	@Test
	public void queSeOrdenenPorEdad() throws elBarEstaCerradoException {
		Bar bar = new Bar("Club de los No Homeros");
		bar.abrirBar();
		bar.agregarCliente("Carlos", 42);
		bar.agregarCliente("Luis", 25);
		bar.agregarCliente("Andres", 20);
		bar.agregarCliente("Daniel", 55);
		bar.agregarCliente("Benito", 25);
		
		assertEquals(5, bar.getClientes().size());
		assertEquals(4, bar.ordenarsePorEdad().size());
		assertEquals(bar.ordenarsePorEdad().first().getNombre(), "Andres");
		assertEquals(bar.ordenarsePorEdad().last().getNombre(), "Daniel");		
	}
	
}
