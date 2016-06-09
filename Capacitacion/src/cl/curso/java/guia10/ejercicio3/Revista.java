package cl.curso.java.guia10.ejercicio3;

public class Revista implements Imprimible {

	/**
	 * @param Atributos
	 */
	private int numeroEdicion;
	private String editorial;
	private String nombre;

	/**
	 * Getters and Setters
	 */
	
	/**
	 * @return the numeroEdicion
	 */
	public int getNumeroEdicion() {
		return numeroEdicion;
	}

	/**
	 * @param numeroEdicion the numeroEdicion to set
	 */
	public void setNumeroEdicion(int numeroEdicion) {
		this.numeroEdicion = numeroEdicion;
	}

	/**
	 * @return the editorial
	 */
	public String getEditorial() {
		return editorial;
	}

	/**
	 * @param editorial the editorial to set
	 */
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * constructor default
	 */
	public Revista() {
		this.numeroEdicion = 0;
		this.editorial = "Desconocido";
		this.nombre = "Desconocido";
	}

	/**
	 * constructor definido
	 * @param numeroEdicion
	 * @param editorial
	 * @param nombre
	 */
	public Revista(int numeroEdicion, String editorial, String nombre) {
		this.numeroEdicion = numeroEdicion;
		this.editorial = editorial;
		this.nombre = nombre;
	}

	@Override
	public void imprimir() {
		System.out.println("Número de la Edición: "+this.getNumeroEdicion()+
				"\nNombre de la Editorial: "+this.getEditorial()+
				"\nNombre"+this.getNombre());

	}

}
