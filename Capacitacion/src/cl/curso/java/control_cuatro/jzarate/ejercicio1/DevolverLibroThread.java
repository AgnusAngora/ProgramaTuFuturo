package cl.curso.java.control_cuatro.jzarate.ejercicio1;

/**
 * 
 * @author Jes�s Z�rate Hern�ndez
 *
 */
public class DevolverLibroThread extends Thread {
	/**
	 * atributos
	 */
	private Libro libro;

	/**
	 * constructor default
	 */
	public DevolverLibroThread() {
		this.libro = new Libro();
	}

	/**
	 * metodos
	 */
	public void run() {
		this.libro.devolverLibro();
	}
}
