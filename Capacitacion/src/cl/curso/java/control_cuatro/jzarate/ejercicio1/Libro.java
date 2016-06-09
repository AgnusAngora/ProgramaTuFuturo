package cl.curso.java.control_cuatro.jzarate.ejercicio1;

/**
 * 
 * @author Jesús Zárate Hernández
 *
 */
public class Libro {
	/**
	 * atributos
	 */
	private String nombre;
	private String editorial;
	private int cantidadLibros;
	private int cantidadLibrosPrestados;

	/**
	 * constructor default
	 */
	public Libro() {
		this.nombre = "Desconocido";
		this.editorial = "Desconocida";
		this.cantidadLibros = 0;
		this.cantidadLibrosPrestados = 0;
	}

	/**
	 * @param nombre
	 * @param editorial
	 * @param cantidadLibros
	 * @param cantidadLibrosPrestados
	 */
	public Libro(String nombre, String editorial, int cantidadLibros, int cantidadLibrosPrestados) {
		this.nombre = nombre;
		this.editorial = editorial;
		this.cantidadLibros = cantidadLibros;
		this.cantidadLibrosPrestados = cantidadLibrosPrestados;
	}

	/**
	 * Getters and Setters
	 */
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the editorial
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * @param editorial
	 *            the editorial to set
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * @return the cantidadLibros
	 */
	public int getCantidadLibros() {
		return cantidadLibros;
	}

	/**
	 * @param cantidadLibros
	 *            the cantidadLibros to set
	 */
	public void setCantidadLibros(int cantidadLibros) {
		this.cantidadLibros = cantidadLibros;
	}

	/**
	 * @return the cantidadLibrosPrestados
	 */
	public int getCantidadLibrosPrestados() {
		return cantidadLibrosPrestados;
	}

	/**
	 * @param cantidadLibrosPrestados
	 *            the cantidadLibrosPrestados to set
	 */
	public void setCantidadLibrosPrestados(int cantidadLibrosPrestados) {
		this.cantidadLibrosPrestados = cantidadLibrosPrestados;
	}

	/**
	 * metodos
	 */
	public synchronized void reservarLibro() {
		if(this.getCantidadLibros()>0){
			this.cantidadLibrosPrestados++;
			this.cantidadLibros--;
			System.out.println("Se a prestado un libro.");
		}else{
			System.out.println("No hay libros disponibles.");
		}
	}
	public synchronized void devolverLibro(){
		if(this.getCantidadLibrosPrestados()>0){
			this.cantidadLibrosPrestados--;
			this.cantidadLibros++;
			System.out.println("Se a devuelto un libro.");
		}else{
			System.out.println("No hay libros prestados.");
		}
	}
}
