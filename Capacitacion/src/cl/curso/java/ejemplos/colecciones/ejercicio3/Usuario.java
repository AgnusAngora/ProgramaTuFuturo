package cl.curso.java.ejemplos.colecciones.ejercicio3;

import java.util.ArrayList;

/**
 * 
 * @author Agnus
 *
 */
public class Usuario {
	/**
	 * atributos
	 */
	private String nombre;
	private ArrayList<PlayList> lista;

	/**
	 * getters and setters
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
	 * @return the lista
	 */
	public ArrayList<PlayList> getLista() {
		return lista;
	}

	/**
	 * @param lista
	 *            the lista to set
	 */
	public void setLista(ArrayList<PlayList> lista) {
		this.lista = lista;
	}

	public Usuario() {

	}

	/**
	 * @param nombre
	 * @param lista
	 */
	public Usuario(String nombre, ArrayList<PlayList> lista) {
		this.nombre = nombre;
		this.lista = lista;
	}

}
