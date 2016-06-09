package cl.curso.java.ejercicios.conexion;

public class ConexionAbiertaException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6535236499611402354L;

	/**
	 * @param message
	 */
	public ConexionAbiertaException (String message)
	{
		super(message);
	}
}
