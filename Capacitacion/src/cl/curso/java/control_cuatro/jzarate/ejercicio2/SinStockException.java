package cl.curso.java.control_cuatro.jzarate.ejercicio2;
/**
 * 
 * @author Jes�s Z�rate Hern�ndez
 *
 */
public class SinStockException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 2001828777584566994L;

	/**
	 * constructor default
	 */
	public SinStockException() {
	}

	/**
	 * 
	 * @param menssage
	 */
	public SinStockException(String menssage) {
		super(menssage);
	}

}
