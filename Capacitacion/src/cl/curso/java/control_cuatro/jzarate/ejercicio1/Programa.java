package cl.curso.java.control_cuatro.jzarate.ejercicio1;

/**
 * 
 * @author Jes�s Z�rate Hern�ndez
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
