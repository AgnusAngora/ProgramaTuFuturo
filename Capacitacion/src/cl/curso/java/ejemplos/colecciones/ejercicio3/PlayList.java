package cl.curso.java.ejemplos.colecciones.ejercicio3;

import java.util.ArrayList;

/**
 * 
 * @author Agnus
 *
 */
public class PlayList {

	private String nombre;
	private ArrayList<Cancion> canciones;
	private ArrayList<Usuario> seguidores;

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
	 * @return the canciones
	 */
	public ArrayList<Cancion> getCanciones() {
		return canciones;
	}

	/**
	 * @param canciones
	 *            the canciones to set
	 */
	public void setCanciones(ArrayList<Cancion> canciones) {
		this.canciones = canciones;
	}

	/**
	 * @return the seguidores
	 */
	public ArrayList<Usuario> getSeguidores() {
		return seguidores;
	}

	/**
	 * @param seguidores
	 *            the seguidores to set
	 */
	public void setSeguidores(ArrayList<Usuario> seguidores) {
		this.seguidores = seguidores;
	}

	public PlayList() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param canciones
	 * @param seguidores
	 */
	public PlayList(String nombre, ArrayList<Cancion> canciones, ArrayList<Usuario> seguidores) {
		this.nombre = nombre;
		this.canciones = canciones;
		this.seguidores = seguidores;
	}

	public void agregarCancion(Cancion cancion) {
		if (this.getCanciones().contains(cancion)) {
			System.out.println("La cancion " + cancion.getNombre() + " ya se encuentra en el repertorio.");
		} else {
			this.getCanciones().add(cancion);
			System.out.println("La cancion " + cancion.getNombre() + " fue agregada en el repertorio.");
		}
	}

	public void eliminarCancion(Cancion cancion) {
		if(this.getCanciones().contains(cancion)){
			this.getCanciones().remove(cancion);
			System.out.println("La cancion " + cancion.getNombre() + " fue eliminada en el repertorio.");
		}else{
			System.out.println("La cancion " + cancion.getNombre() + " no se encuentra en el repertorio.");
		}
	}

	public int duracionMin() {
		int duracionLista = 0;
		for (int i = 0; i < canciones.size(); i++) {
			duracionLista = duracionLista + canciones.get(i).getDuracionMinuto();
		}
		return duracionLista;
	}
	public void ordenarPorDuracionCancion(){
		int duracionCancion;
		Cancion duracionCancion2;
		int cancionSiguiente;
		Cancion cancionSiguiente2;
		for (int i = 0; i < canciones.size(); i++) {
			Cancion auxiliar2;
			duracionCancion = canciones.get(i).getDuracionMinuto();
			cancionSiguiente = canciones.get(i+1).getDuracionMinuto();
			duracionCancion2 = canciones.get(i);
			cancionSiguiente2 = canciones.get(i+1);
			if(duracionCancion>cancionSiguiente){
				auxiliar2 = cancionSiguiente2;
				cancionSiguiente2 = duracionCancion2;
				duracionCancion2 = auxiliar2;
				i=0;
			}
		}
	}
	public void imprimir(){
		for (int i = 0; i < canciones.size(); i++) {
			System.out.println(canciones.get(i).getDuracionMinuto());
		}
	}
}
