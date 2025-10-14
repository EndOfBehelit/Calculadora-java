package interfaz;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.Calculos;

import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JMenu;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private Calculos ca;
	
	private JPanel contentPane;
	private JLabel lblPantalla;
	private JButton btnDiv;
	private JButton btnMult;
	private JButton btnRest;
	private JButton btnSum;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btnIgual;
	private JButton btn0;
	private JButton btnComa;
	private JButton btnLimpiar;
	private JMenuBar menuBar;
	private JMenu mnOpciones;
	private JMenuItem mntmLimpiar;
	private JMenuItem mntmAboutUs;
	private JMenu mnSalir;
	private JMenuItem mntmSalir;


	//-------------METODOS AUX------------
	
	private void imprimirEnPantalla(String texto) {
		lblPantalla.setText(lblPantalla.getText().equals("") ? "0" : texto);
	}
	
	private boolean confirmarSalir() {
		return JOptionPane.showConfirmDialog(this, "¿Estás seguro de querer salir?") 
				== JOptionPane.YES_OPTION;
	}
	
	private void confirmar() {
		if (confirmarSalir())
			System.exit(0);
	}
	
	//------------------------------------
	

	/**
	 * Create the frame.
	 */
	public Ventana(Calculos ca) {
		setTitle("CALCULADORA");
		this.ca = ca;
		
		setIconImage(Toolkit.getDefaultToolkit().getImage(Ventana.class.getResource("/img/icono.jpeg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 365, 582);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.add(getLblPantalla());
		contentPane.add(getBtnDiv());
		contentPane.add(getBtnMult());
		contentPane.add(getBtnRest());
		contentPane.add(getBtnSum());
		contentPane.add(getBtn7());
		contentPane.add(getBtn8());
		contentPane.add(getBtn9());
		contentPane.add(getBtn4());
		contentPane.add(getBtn5());
		contentPane.add(getBtn6());
		contentPane.add(getBtn1());
		contentPane.add(getBtn2());
		contentPane.add(getBtn3());
		contentPane.add(getBtnIgual());
		contentPane.add(getBtn0());
		contentPane.add(getBtnComa());
		contentPane.add(getBtnLimpiar());
		contentPane.add(getMenuBar_1());

	}
	private JLabel getLblPantalla() {
		if (lblPantalla == null) {
			lblPantalla = new JLabel("0");
			lblPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
			lblPantalla.setForeground(Color.WHITE);
			lblPantalla.setFont(new Font("Consolas", Font.BOLD, 61));
			lblPantalla.setOpaque(true);
			lblPantalla.setBackground(Color.BLACK);
			lblPantalla.setAutoscrolls(true);
			lblPantalla.setBounds(10, 33, 326, 68);
			lblPantalla.setBorder(new EmptyBorder(30, 10, 10, 10));
		}
		return lblPantalla;
	}
	private JButton getBtnDiv() {
		if (btnDiv == null) {
			btnDiv = new JButton("/");
			btnDiv.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						ca.pulsarOperacion(getBtnDiv().getText());
						imprimirEnPantalla(ca.getOperador());
					}catch (NumberFormatException ex){
						lblPantalla.setText("Error");
					}
				}
			});
			btnDiv.setFocusPainted(false);
			btnDiv.setBounds(10, 118, 74, 74);
		}
		return btnDiv;
	}
	private JButton getBtnMult() {
		if (btnMult == null) {
			btnMult = new JButton("*");
			btnMult.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						ca.pulsarOperacion(getBtnMult().getText());
						imprimirEnPantalla(ca.getOperador());
					}catch (NumberFormatException ex){
						lblPantalla.setText("Error");
					}
				}
			});
			btnMult.setFocusPainted(false);
			btnMult.setBounds(94, 118, 74, 74);
		}
		return btnMult;
	}
	private JButton getBtnRest() {
		if (btnRest == null) {
			btnRest = new JButton("-");
			btnRest.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						ca.pulsarOperacion(getBtnRest().getText());
						imprimirEnPantalla(ca.getOperador());
					}catch (NumberFormatException ex){
						lblPantalla.setText("Error");
					}
				}
			});
			btnRest.setFocusPainted(false);
			btnRest.setBounds(178, 118, 74, 74);
		}
		return btnRest;
	}
	private JButton getBtnSum() {
		if (btnSum == null) {
			btnSum = new JButton("+");
			btnSum.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						ca.pulsarOperacion(getBtnSum().getText());
						imprimirEnPantalla(ca.getOperador());
					}catch (NumberFormatException ex){
						lblPantalla.setText("Error");
					}
				}
			});
			btnSum.setFocusPainted(false);
			btnSum.setBounds(262, 203, 74, 159);
		}
		return btnSum;
	}
	private JButton getBtn7() {
		if (btn7 == null) {
			btn7 = new JButton("7");
			btn7.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ca.pulsarNumero(getBtn7().getText());
					imprimirEnPantalla(ca.getNumeroActual());
				}
			});
			btn7.setFocusPainted(false);
			btn7.setBounds(10, 203, 74, 74);
		}
		return btn7;
	}
	private JButton getBtn8() {
		if (btn8 == null) {
			btn8 = new JButton("8");
			btn8.setFocusPainted(false);
			btn8.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ca.pulsarNumero(getBtn8().getText());
					imprimirEnPantalla(ca.getNumeroActual());
				}
			});
			btn8.setBounds(94, 203, 74, 74);
		}
		return btn8;
	}
	private JButton getBtn9() {
		if (btn9 == null) {
			btn9 = new JButton("9");
			btn9.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ca.pulsarNumero(getBtn9().getText());
					imprimirEnPantalla(ca.getNumeroActual());
				}
			});
			btn9.setFocusPainted(false);
			btn9.setBounds(178, 203, 74, 74);
		}
		return btn9;
	}
	private JButton getBtn4() {
		if (btn4 == null) {
			btn4 = new JButton("4");
			btn4.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ca.pulsarNumero(getBtn4().getText());
					imprimirEnPantalla(ca.getNumeroActual());
				}
			});
			btn4.setFocusPainted(false);
			btn4.setBounds(10, 288, 74, 74);
		}
		return btn4;
	}
	private JButton getBtn5() {
		if (btn5 == null) {
			btn5 = new JButton("5");
			btn5.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ca.pulsarNumero(getBtn5().getText());
					imprimirEnPantalla(ca.getNumeroActual());
				}
			});
			btn5.setFocusPainted(false);
			btn5.setBounds(94, 288, 74, 74);
		}
		return btn5;
	}
	private JButton getBtn6() {
		if (btn6 == null) {
			btn6 = new JButton("6");
			btn6.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ca.pulsarNumero(getBtn6().getText());
					imprimirEnPantalla(ca.getNumeroActual());
				}
			});
			btn6.setFocusPainted(false);
			btn6.setBounds(178, 288, 74, 74);
		}
		return btn6;
	}
	private JButton getBtn1() {
		if (btn1 == null) {
			btn1 = new JButton("1");
			btn1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ca.pulsarNumero(getBtn1().getText());
					imprimirEnPantalla(ca.getNumeroActual());
				}
			});
			btn1.setFocusPainted(false);
			btn1.setBounds(10, 373, 74, 74);
		}
		return btn1;
	}
	private JButton getBtn2() {
		if (btn2 == null) {
			btn2 = new JButton("2");
			btn2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ca.pulsarNumero(getBtn2().getText());
					imprimirEnPantalla(ca.getNumeroActual());
				}
			});
			btn2.setFocusPainted(false);
			btn2.setBounds(94, 373, 74, 74);
		}
		return btn2;
	}
	private JButton getBtn3() {
		if (btn3 == null) {
			btn3 = new JButton("3");
			btn3.setFocusPainted(false);
			btn3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ca.pulsarNumero(getBtn3().getText());
					imprimirEnPantalla(ca.getNumeroActual());
				}
			});
			btn3.setBounds(178, 373, 74, 74);
		}
		return btn3;
	}
	private JButton getBtnIgual() {
		if (btnIgual == null) {
			btnIgual = new JButton("=");
			btnIgual.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					try {
						imprimirEnPantalla(ca.pulsarIgual());	
					}catch (Exception ex) {
						imprimirEnPantalla("Error aa");
					}
						
				}
			});
			btnIgual.setFocusPainted(false);
			btnIgual.setBounds(262, 373, 74, 159);
		}
		return btnIgual;
	}
	private JButton getBtn0() {
		if (btn0 == null) {
			btn0 = new JButton("0");
			btn0.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					if (lblPantalla.getText() != "0") {
						ca.pulsarNumero(getBtn0().getText());
						imprimirEnPantalla(ca.getNumeroActual());
					}else{
						ca = new Calculos(); //Resetear todo
						imprimirEnPantalla("0");
					}
				}
			});
			btn0.setFocusPainted(false);
			btn0.setBounds(10, 458, 158, 74);
		}
		return btn0;
	}
	private JButton getBtnComa() {
		if (btnComa == null) {
			btnComa = new JButton(".");
			btnComa.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ca.pulsarPunto();
					imprimirEnPantalla(ca.getNumeroActual());
				}
			});
			btnComa.setFocusPainted(false);
			btnComa.setBounds(178, 458, 74, 74);
		}
		return btnComa;
	}
	private JButton getBtnLimpiar() {
		if (btnLimpiar == null) {
			btnLimpiar = new JButton("C");
			btnLimpiar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ca = new Calculos(); //Reiniciar todos los valores
					imprimirEnPantalla("0");//Cambiar valor pantalla
				}
			});
			btnLimpiar.setFocusPainted(false);
			btnLimpiar.setBounds(262, 118, 74, 74);
		}
		return btnLimpiar;
	}
	private JMenuBar getMenuBar_1() {
		if (menuBar == null) {
			menuBar = new JMenuBar();
			menuBar.setBounds(0, 0, 349, 22);
			menuBar.add(getMnOpciones());
			menuBar.add(getMnSalir());
		}
		return menuBar;
	}
	private JMenu getMnOpciones() {
		if (mnOpciones == null) {
			mnOpciones = new JMenu("Opciones");
			mnOpciones.add(getMntmLimpiar());
			mnOpciones.add(getMntmAboutUs());
		}
		return mnOpciones;
	}
	private JMenuItem getMntmLimpiar() {
		if (mntmLimpiar == null) {
			mntmLimpiar = new JMenuItem("Limpiar");
			mntmLimpiar.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ca = new Calculos(); //Reiniciar todos los valores
					imprimirEnPantalla("0");//Cambiar valor pantalla
				}
			});
		}
		return mntmLimpiar;
	}
	private JMenuItem getMntmAboutUs() {
		if (mntmAboutUs == null) {
			mntmAboutUs = new JMenuItem("About Us");
			mntmAboutUs.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					JOptionPane.showMessageDialog(null,
							"Calculadora en java \n Autor -> Jorge Carbajo",
							"About us", JOptionPane.INFORMATION_MESSAGE);
				}
			});
		}
		return mntmAboutUs;
	}
	private JMenu getMnSalir() {
		if (mnSalir == null) {
			mnSalir = new JMenu("Salir");
			mnSalir.add(getMntmSalir());
		}
		return mnSalir;
	}
	private JMenuItem getMntmSalir() {
		if (mntmSalir == null) {
			mntmSalir = new JMenuItem("Salir");
			mntmSalir.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					confirmar();
				}
			});
		}
		return mntmSalir;
	}
}
