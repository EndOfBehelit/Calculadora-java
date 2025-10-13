package calculadora;

import java.awt.EventQueue;

import interfaz.Ventana;
import logica.Calculos;

public class Main {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculos ca = new Calculos();
					Ventana frame = new Ventana(ca);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
}
