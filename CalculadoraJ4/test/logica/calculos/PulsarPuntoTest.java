package logica.calculos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import logica.Calculos;

public class PulsarPuntoTest {

	private Calculos ca;
	
	@Before
	public void setUp() {
		ca = new Calculos();
	}
	
	/**
	 * CASOS:
	 * 1- Un numero normal sin coma
	 * 2- Un numero con ya una coma
	 * 3- Pulsar como primer boton la coma
	 * 4- Pulsar como primer botón después de pulsar un operador la coma
	 */
	
	/** 1 
	 * GIVEN: Un 4 sin comas
	 * WHEN: Pulso la coma
	 * THEN: Añade una coma
	 */
	@Test
	public void testPulsarPuntoNumeroSinComa() {
		ca.pulsarNumero("4");
		ca.pulsarPunto();
		assertEquals("4.", ca.getNumeroActual());		
	}

	/** 2 
	 * GIVEN: Un 4 con coma
	 * WHEN: Pulso la coma
	 * THEN: No hace nada y se mantiene igual
	 */
	@Test
	public void testPulsarPuntoNumeroConComa() {
		ca.pulsarNumero("4");
		ca.pulsarPunto();
		ca.pulsarPunto();
		assertEquals("4.", ca.getNumeroActual());		
	}
	
	/** 3
	 * GIVEN: Ningun boton pulsado
	 * WHEN: Pulso la coma
	 * THEN: El valor debe ser 0.
	 */
	@Test
	public void testPulsarPuntoPrimerBoton() {
		ca.pulsarPunto();
		assertEquals("0.", ca.getNumeroActual());
	}
	
	/** 3
	 * GIVEN: Numero y operador pulsado
	 * WHEN: Pulso la coma
	 * THEN: El valor debe ser 0.
	 */
	@Test
	public void testPulsarPuntoPrimerBotonDespuesDeOperador() {
		ca.pulsarNumero("4");
		ca.pulsarOperacion("+");
		ca.pulsarPunto();
		assertEquals("0.", ca.getNumeroActual());		
	}
}
