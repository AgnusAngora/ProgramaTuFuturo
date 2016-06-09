package cl.curso.java.ejercicios.conexion;

public class ConexionCerradaException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4383057953256211930L;

	/**
	 * @param message
	 */
	public ConexionCerradaException (String message)
	{
		super(message);
	}
}
