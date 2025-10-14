package logica.calculos;

import static org.junit.Assert.*;

import org.junit.Test;

import logica.Calculos;

public class PulsarIgualTest {

	/**
	 * CASOS:
	 * 1- Suma
	 * 2- Division
	 * 3- Division 0
	 * 4- Igual 2 veces seguidas
	 */
	
	/** 1 
	 * GIVEN: Suma normal
	 * WHEN: Pulso igual
	 * THEN: La hace bien
	 */
	@Test
	public void testSuma(){
		try {
			Calculos ca = new Calculos();
			ca.pulsarNumero("4");
			ca.pulsarOperacion("+");
			ca.pulsarNumero("4");
			String res = ca.pulsarIgual();
			assertEquals("8.0", ca.getNumeroActual());	
			assertEquals("8.0", res);
			assertTrue(ca.isRecienOperado());
		}catch(Exception ex) {
			System.out.println("Error");
		}		
	}

	/** 2
	 * GIVEN: Dividir
	 * WHEN: Pulso igual
	 * THEN: La hace bien
	 */
	@Test
	public void testDiv(){
		try {
			Calculos ca = new Calculos();
			ca.pulsarNumero("4");
			ca.pulsarOperacion("/");
			ca.pulsarNumero("4");
			String res = ca.pulsarIgual();
			assertEquals("1.0", ca.getNumeroActual());	
			assertEquals("1.0", res);
			assertTrue(ca.isRecienOperado());
		}catch(Exception ex) {
			System.out.println("Error");
		}		
	}
	
	/** 3
	 * GIVEN: Dividir por 0
	 * WHEN: Pulso igual
	 * THEN: Da error
	 */
	@Test
	public void testDiv0(){
		try {
			Calculos ca = new Calculos();
			ca.pulsarNumero("4");
			ca.pulsarOperacion("/");
			ca.pulsarNumero("0");
			String res = ca.pulsarIgual();
			assertEquals("0", ca.getNumeroActual());	
			assertEquals("Error", res);
			assertFalse(ca.isRecienOperado());
		}catch(Exception ex) {
			System.out.println("Error");
		}		
	}
	
	/** 4
	 * GIVEN: Pulsar igual 2 veces seguidas
	 * WHEN: Pulso igual
	 * THEN: Hace la ultima operacion con el resultado anterior
	 */
	@Test
	public void testIgual2Veces(){
		try {
			Calculos ca = new Calculos();
			ca.pulsarNumero("4");
			ca.pulsarOperacion("+");
			ca.pulsarNumero("2");
			String res = ca.pulsarIgual();
			assertEquals("6.0", ca.getNumeroActual());	
			assertEquals("6.0", res);
			assertTrue(ca.isRecienOperado());
			
			res = ca.pulsarIgual();
			assertEquals("8.0", ca.getNumeroActual());	
			assertEquals("8.0", res);
			assertTrue(ca.isRecienOperado());
		}catch(Exception ex) {
			System.out.println("Error");
		}		
	}
}
