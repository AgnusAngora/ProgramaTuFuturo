package cl.curso.java.control_cuatro.jzarate.ejercicio1;

/**
 * 
 * @author Jes�s Z�rate Hern�ndez
 *
 */
public class ReservarLibroThread extends Thread {
	/**
	 * atributos
	 */
	private Libro libro;

	/**
	 * constructor default
	 */
	public ReservarLibroThread() {
		this.libro = new Libro();
	}

	/**
	 * metodos
	 */
	public void run() {
		this.libro.reservarLibro();
	}
}
