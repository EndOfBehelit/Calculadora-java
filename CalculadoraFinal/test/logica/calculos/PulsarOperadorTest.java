package logica.calculos;

import static org.junit.Assert.*;

import org.junit.Test;

import logica.Calculos;

class PulsarOperacionTest {

	/**
	 * CASOS:
	 * 1- Suma normal
	 * 2- Suma con comas
	 * 3- Pulsar operador 2 veces seguidas
	 * 4- Pulsar operador como primer boton
	 */
	
	/** 1 
	 * GIVEN: Suma normal
	 * WHEN: Hago la suma
	 * THEN: La hace bien y cambia los param
	 */
	@Test
	void testPulsarOperadorSumaNormal() throws Exception{
		Calculos ca = new Calculos();
		ca.pulsarNumero("4");
		ca.pulsarOperacion("+");
		assertEquals("+", ca.getOperador());
		assertFalse(ca.isRecienOperado());	
		ca.pulsarNumero("3");
		String res = ca.pulsarIgual();
		assertEquals("7.0", ca.getNumeroActual());		
		assertEquals("7.0", res);
		
	}
	
	/** 2
	 * GIVEN: Suma con coma
	 * WHEN: Hago la suma
	 * THEN: La hace bien y cambia los param
	 */
	@Test
	void testPulsarOperadorSumaConComa() throws Exception{
		Calculos ca = new Calculos();
		ca.pulsarNumero("4.1");
		ca.pulsarOperacion("+");
		assertEquals("+", ca.getOperador());
		assertFalse(ca.isRecienOperado());	
		ca.pulsarNumero("3.1");
		String res = ca.pulsarIgual();
		assertEquals("7.2", ca.getNumeroActual());		
		assertEquals("7.2", res);
		
	}

	/** 3
	 * GIVEN: Pulsar 2 veces un operador
	 * WHEN: Pulso la segunda vez
	 * THEN: Lanza NumberFormatException
	 */
	@Test 
	//(expected = NumberFormatException.class)
	void testPulsarOperador2Veces() throws NumberFormatException{
		Calculos ca = new Calculos();
		ca.pulsarOperacion("+");
		assertThrows(NumberFormatException.class, () -> {
			ca.pulsarOperacion("+");
	    });		
	}
	
	@Test 
	(expected = NumberFormatException.class)
	void testPulsarOperador2Vece222s(){
		Calculos ca = new Calculos();
		ca.pulsarNumero("4.1");
		ca.pulsarOperacion("+");
		ca.pulsarOperacion("+");
			
	}
}
