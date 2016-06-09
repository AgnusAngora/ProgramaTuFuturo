package cl.curso.java.control_cuatro.jzarate.ejercicio1;

/**
 * 
 * @author Jesús Zárate Hernández
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
