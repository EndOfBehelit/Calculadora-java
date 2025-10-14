package logica;


public class Calculos {
	
	private static final String SUMA = "+";
	private static final String RESTA = "-";
	private static final String MULT = "*";
	private static final String DIV = "/";
	
	private double num1 = 0;
	private double num2 = 0;
	private String numeroActual = "";
	private String operador = "";
	private boolean recienOperado = false;
	
	
	//--------GETTERS Y SETTERS-----------
	public double getNum1() {
		return num1;
	}
	private void setNum1(double num1) {
		this.num1 = num1;
	}
	public double getNum2() {
		return num2;
	}
	private void setNum2(double num2) {
		this.num2 = num2;
	}
	public String getNumeroActual() {
		return numeroActual;
	}
	private void setNumeroActual(String numeroActual) {
		this.numeroActual = numeroActual;
	}
	public String getOperador() {
		return operador;
	}
	private void setOperador(String operador) {
		this.operador = operador;
	}
	public boolean isRecienOperado() {
		return recienOperado;
	}
	private void setRecienOperado(boolean recienOperado) {
		this.recienOperado = recienOperado;
	}
	
	//----------------------------------
	
	//-----------METODOS AUX---------------
	
	/**
	 * Comprueba si el numeroActual tiene 0s delante y los quita para evitar 
	 * 001 y que sea 1
	 */
	public void checkFirstNum() {
		if(getNumeroActual().length() > 1 
				&& getNumeroActual().charAt(0) == '0'
				&& getNumeroActual().charAt(1) != '.') {
			setNumeroActual(getNumeroActual().substring(1));
		}
			
	}
	
	/**
	 * Comprobar ultimo boton pulsado
	 * @return true, ultima operacion el =
	 * @return false, ultima operación cualquiera menos =
	 */
	public boolean checkUltimaOpIgual() {
		return isRecienOperado() ? true : false;
	}
	
	//----------------------------------
	
	
	//-----------CONSTRUCTOR---------------
	
	/**
	 * Comprueba si el numeroActual tiene 0s delante y los quita para evitar 
	 * 001 y que sea 1
	 */
	public Calculos() {
		inicializar();
	}
	
	private void inicializar() {
		setNum1(0);
		setNum2(0);
		setNumeroActual("");
		setRecienOperado(false);
	}

	//----------------------------------
	
	/**
	 * Metodo para cuando se pulsa un boton numerico
	 * @param textoBoton, texto que contenga el numero pulsado
	 */
	public void pulsarNumero(String textoBoton) {
		if (checkUltimaOpIgual()) {
			inicializar();
			setNumeroActual(textoBoton);
		}else {
			setNumeroActual(getNumeroActual() + textoBoton);
			//checkFirstNum();
		}
			
		
		checkFirstNum();
		setRecienOperado(false);
	}
	
	/**
	 *Pone una coma en caso de que no tenga coma el numero,
	 *en caso de tenerla, no hace nada. 
	 */
	public void pulsarPunto() {
		if (getNumeroActual().equals("")) {
			setNumeroActual("0.");
		}
		if (!getNumeroActual().contains(".")) {
			setNumeroActual(getNumeroActual() + '.');
		}
	}
	
	/**
	 * Pulsar boton de operar, captura error en caso de no haber pulsado
	 * ningun boton antes
	 * @param op, tipo de operacion a utilizar
	 */
	public void pulsarOperacion(String op) throws NumberFormatException {
		setNum1(Double.parseDouble(getNumeroActual()));//Esto es lo que puede fallar
		setOperador(op);
		setNumeroActual("");
		setRecienOperado(false);
	}
	
	
	/**
	 * Opera los num1 y num2, en funcion de la operación que se marcó con
	 * anterioridad
	 * @return String resultado, valor de la operacion en formato String
	 * @throws Exception
	 */
	public String pulsarIgual() throws Exception{
		double resultado = 0;
		if (!isRecienOperado()) 
			setNum2(Double.parseDouble(getNumeroActual()));

		switch (getOperador()) {
			case SUMA: resultado = num1 + num2; break;
			case RESTA: resultado = num1 - num2; break;
			case MULT: resultado = num1 * num2; break;
			case DIV: 
				if (getNum2() != 0) {
					resultado = num1 / num2; break;
				}
				else
					return "Error";	
			default:
				resultado = Double.parseDouble(getNumeroActual());
				break;
		}

		setNumeroActual(String.valueOf(Math.round(resultado * 1000.0) / 1000.0));
		num1 = resultado; //Para evitar que al dar 2 veces al igual aplique la operación al primer nº, es decir
			// 1 + 2 = 3 -> = de nuevo debe ser 5, no 4
		setRecienOperado(true);
		return String.valueOf(Math.round(resultado * 1000.0) / 1000.0);
	}
	
	
	
}
