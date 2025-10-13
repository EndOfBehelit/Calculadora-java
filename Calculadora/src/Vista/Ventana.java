package Vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ventana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	private double num1 = 0;
	private double num2 = 0;
	private String operador = "";
	private String numeroActual = "";
	private boolean recienOperado = false;
	
	//-----------METODOS AUX---------------
	public void checkFirstNum() {
		if (numeroActual.charAt(0) == '0')
			numeroActual = numeroActual.substring(1);
	}
	
	public boolean checkUltimaOpIgual() {
		if (recienOperado) {
			return true;
		}else {
			return false;
		}
	}
	//----------------------------------
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana frame = new Ventana();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Ventana() {		
		
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 266, 442);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		//--------------PANTALLA-----------------
		JLabel lblPantalla = new JLabel("0");
		lblPantalla.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPantalla.setForeground(Color.GREEN);
		lblPantalla.setBackground(new Color(0, 64, 128));
		lblPantalla.setBorder(null);
		lblPantalla.setFont(new Font("Consolas", Font.BOLD, 38));
		lblPantalla.setBounds(10, 11, 230, 55);
		lblPantalla.setOpaque(true);
		lblPantalla.setBorder(new EmptyBorder(20, 10, 10, 10));
		contentPane.add(lblPantalla);
		
		//-----------------------------
		
		//------------BOTONES----------------
		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(lblPantalla.getText());
				operador = "/";
				numeroActual = "";
				lblPantalla.setText("/");
				recienOperado = false;
			}
		});
		btnDiv.setBounds(10, 77, 50, 50);
		contentPane.add(btnDiv);
		
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(lblPantalla.getText());
				operador = "*";
				numeroActual = "";
				lblPantalla.setText("*");
				recienOperado = false;
			}
		});
		btnMult.setBounds(70, 77, 50, 50);
		contentPane.add(btnMult);
		
		JButton btnResta = new JButton("-");
		btnResta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(lblPantalla.getText());
				operador = "-";
				numeroActual = "";
				lblPantalla.setText("-");
				recienOperado = false;
			}
		});
		btnResta.setBounds(130, 77, 50, 50);
		contentPane.add(btnResta);
		
		JButton btnSuma = new JButton("+");
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = Double.parseDouble(lblPantalla.getText());
				operador = "+";
				numeroActual = "";
				lblPantalla.setText("+");
				recienOperado = false;
			}
		});
		btnSuma.setBounds(190, 138, 50, 111);
		contentPane.add(btnSuma);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkUltimaOpIgual()) {
					numeroActual = "7";
				}else {
					numeroActual += 7;
				}				
				checkFirstNum();
				lblPantalla.setText(numeroActual);
				recienOperado = false;
			}
		});
		btn7.setBounds(10, 138, 50, 50);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkUltimaOpIgual()) {
					numeroActual = "8";
				}else {
					numeroActual += 8;
				}
				checkFirstNum();
				lblPantalla.setText(numeroActual);
				recienOperado = false;
			}
		});
		btn8.setBounds(70, 138, 50, 50);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkUltimaOpIgual()) {
					numeroActual = "9";
				}else {
					numeroActual += 9;
				}
				checkFirstNum();
				lblPantalla.setText(numeroActual);
				recienOperado = false;
			}
		});
		btn9.setBounds(130, 138, 50, 50);
		contentPane.add(btn9);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkUltimaOpIgual()) {
					numeroActual = "4";
				}else {
					numeroActual += 4;
				}
				checkFirstNum();
				lblPantalla.setText(numeroActual);
				recienOperado = false;
			}
		});
		btn4.setBounds(10, 199, 50, 50);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkUltimaOpIgual()) {
					numeroActual = "5";
				}else {
					numeroActual += 5;
				}
				checkFirstNum();
				lblPantalla.setText(numeroActual);
				recienOperado = false;
			}
		});
		btn5.setBounds(70, 199, 50, 50);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkUltimaOpIgual()) {
					numeroActual = "6";
				}else {
					numeroActual += 6;
				}
				checkFirstNum();
				lblPantalla.setText(numeroActual);
				recienOperado = false;
			}
		});
		btn6.setBounds(130, 199, 50, 50);
		contentPane.add(btn6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkUltimaOpIgual()) {
					numeroActual = "1";
				}else {
					numeroActual += 1;
				}
				checkFirstNum();
				lblPantalla.setText(numeroActual);
				recienOperado = false;
			}
		});
		btn1.setBounds(10, 260, 50, 50);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkUltimaOpIgual()) {
					numeroActual = "2";
				}else {
					numeroActual += 2;
				}
				checkFirstNum();
				lblPantalla.setText(numeroActual);
				recienOperado = false;
			}
		});
		btn2.setBounds(70, 260, 50, 50);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (checkUltimaOpIgual()) {
					numeroActual = "3";
				}else {
					numeroActual += 3;
				}
				checkFirstNum();
				lblPantalla.setText(numeroActual);
				recienOperado = false;
			}
		});
		btn3.setBounds(130, 260, 50, 50);
		contentPane.add(btn3);
		
		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					num2 = Double.parseDouble(numeroActual);
					double resultado = 0;
					switch (operador) {						
						case "+": resultado = num1 + num2; break;
						case "-": resultado = num1 - num2; break;
						case "*": resultado = num1 * num2; break;
						case "/":
							if (num2 != 0) {
								resultado = num1 / num2;
							}else {
								lblPantalla.setText("Error: Div0");
								return ; //Esto sirve para que se salga del método al ser un error
							}
							break;
						default:
							resultado = Double.parseDouble(lblPantalla.getText());
							break;
					}
					
					lblPantalla.setText(String.valueOf(Math.round(resultado * 1000.0) / 1000.0)); //Imprimir por pantalla el resultado
					numeroActual = String.valueOf(resultado); //Esto almacena el resultado como numeroActual para poder realizar ops sobre este
					if (!recienOperado)
						num1 = num2; //Para evitar que al dar 2 veces al igual aplique la operación al primer nº, es decir
								// 1 + 2 = 3 -> = de nuevo debe ser 5, no 4
					recienOperado = true; //Controlar que el ultimo boton fue igual
					
				}catch(Exception ex) {
					lblPantalla.setText("Error");
				}
			}
		});
		btnIgual.setBounds(190, 260, 50, 111);
		contentPane.add(btnIgual);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (lblPantalla.getText() != "0") {
					if (checkUltimaOpIgual()) {
						numeroActual = "0";
					}else {
						numeroActual += 0;
					}
					lblPantalla.setText(numeroActual);
				}else {
					numeroActual = "0";
					lblPantalla.setText("0");
				}
				recienOperado = false;
				
			}
		});
		btn0.setBounds(10, 321, 110, 50);
		contentPane.add(btn0);
		
		JButton btnComa = new JButton(".");
		btnComa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (numeroActual.contains(".")) {
					return ; //Si ya tiene coma que no haga nada
				}else {
					numeroActual += '.';
					lblPantalla.setText(numeroActual);
				}
				recienOperado = false;
			}
		});
		btnComa.setBounds(130, 321, 50, 50);
		contentPane.add(btnComa);
		
		JButton btnBorrar = new JButton("C");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1 = 0;
				num2 = 0;
				numeroActual = "";
				operador = "";
				lblPantalla.setText("0");
				recienOperado = false;
			}
		});
		btnBorrar.setBounds(190, 77, 50, 50);
		contentPane.add(btnBorrar);
		
		//---------------------------------------------

	}
}
