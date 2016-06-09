package cl.curso.java.control_cuatro.jzarate.ejercicio1;

/**
 * 
 * @author Jesús Zárate Hernández
 *
 */
public class Programa {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Libro libro = new Libro("Hola", "Mundo", 2, 0);
		libro.reservarLibro();
		libro.reservarLibro();
		libro.reservarLibro();
		libro.devolverLibro();
		libro.devolverLibro();
		libro.devolverLibro();

	}

}
