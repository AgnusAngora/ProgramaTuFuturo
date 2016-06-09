package cl.curso.java.ejemplos.colecciones.ejercicio3;

/**
 * 
 * @author Agnus
 *
 */
public class Cancion {

	/**
	 * atributos
	 */
	private String nombre;
	private String artista;
	private int duracionMinuto;

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
	 * @return the artista
	 */
	public String getArtista() {
		return artista;
	}

	/**
	 * @param artista
	 *            the artista to set
	 */
	public void setArtista(String artista) {
		this.artista = artista;
	}

	/**
	 * @return the duracionMinuto
	 */
	public int getDuracionMinuto() {
		return duracionMinuto;
	}

	/**
	 * @param duracionMinuto
	 *            the duracionMinuto to set
	 */
	public void setDuracionMinuto(int duracionMinuto) {
		this.duracionMinuto = duracionMinuto;
	}

	public Cancion() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param nombre
	 * @param artista
	 * @param duracionMinuto
	 */
	public Cancion(String nombre, String artista, int duracionMinuto) {
		this.nombre = nombre;
		this.artista = artista;
		this.duracionMinuto = duracionMinuto;
	}

	public boolean equals(Object obj) {
		if (obj instanceof Cancion) {
			return this.getNombre().equals(((Cancion) obj).getNombre())
					&& this.getArtista().equals(((Cancion) obj).getArtista());
		}
		return false;
	}
}
