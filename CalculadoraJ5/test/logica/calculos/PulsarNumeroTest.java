package logica.calculos;

import static org.junit.jupiter.api.Assertions.*;  
import org.junit.jupiter.api.Test;        

import logica.Calculos;

@SuppressWarnings("unused")

class PulsarNumeroTest {

	/**
	 * CASOS:
	 * 1- Numero normal
	 * 2- Pulsar 0 primero
	 * 3- Pulsar num justo después del igual
	 * 4- Numero después de coma
	 */
	
	/** 1 
	 * GIVEN: Numero normal
	 * WHEN: Pulso numero
	 * THEN: La hace bien
	 */
	@Test
	public void testNumeroNormal(){
		Calculos ca = new Calculos();
		ca.pulsarNumero("4");
		//Como aún no pulsé igual o operador, no es float todavía
		assertEquals("4", ca.getNumeroActual());			
	}
	
	/** 2
	 * GIVEN: Numero 0 primero
	 * WHEN: Pulso numero
	 * THEN: La hace bien
	 */
	@Test
	public void testNumero0Primero(){
		Calculos ca = new Calculos();
		ca.pulsarNumero("0");
		//Como aún no pulsé igual o operador, no es float todavía
		assertEquals("0", ca.getNumeroActual());			
	}
	
	/** 3
	 * GIVEN: Numero despues de igual
	 * WHEN: Pulso numero
	 * THEN: La hace bien
	 */
	@Test
	public void testNumeroDespuesDeIgual(){
		try {
			Calculos ca = new Calculos();
			ca.pulsarNumero("0");
			String res = ca.pulsarIgual();
			ca.pulsarNumero("2");
			assertEquals("2", ca.getNumeroActual());
		}catch(Exception ex) {
			System.out.println("Error");
		}	
	}

	/** 4
	 * GIVEN: Numero despues de coma
	 * WHEN: Pulso numero
	 * THEN: La hace bien
	 */
	@Test
	public void testNumeroDespuesDeComa(){
		Calculos ca = new Calculos();
		ca.pulsarNumero("0");
		ca.pulsarPunto();
		ca.pulsarNumero("2");
		//Como aún no pulsé igual o operador, no es float todavía
		assertEquals("0.2", ca.getNumeroActual());
	}

}
