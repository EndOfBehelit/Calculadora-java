package metodo1;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import Vista.Ventana;


class testVentana {
	
	@Before
	

	@Test
	void comprobarTrue() {
		Ventana ventana = new Ventana();

		assertTrue(ventana.checkUltimaOpIgual());
		
	}
	@Test
	void comprobarFlase() {
		Ventana ventana = new Ventana();
		
		assertFalse(ventana.checkUltimaOpIgual());
		
	}

}
