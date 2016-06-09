package cl.curso.java.guia10.ejercicio3;

/**
 * @author Agnus
 *
 */
public class Libro implements Imprimible {

	/**
	 * @param atributos
	 */
	private String nombre;
	private String editorial;

	/**
	 * constructor default
	 */
	public Libro() {
		this.nombre = "Desconocido";
	}

	/**
	 * constructor definido
	 * 
	 * @param nombre
	 * @param editorial
	 */
	public Libro(String nombre, String editorial) {
		this.nombre = nombre;
		this.editorial = editorial;
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

	@Override
	public void imprimir() {
		System.out.println("El nombre del libro es: " + this.getNombre() +
				"\nEl nombre de la editorial es: "+ this.getEditorial());
	}

}
