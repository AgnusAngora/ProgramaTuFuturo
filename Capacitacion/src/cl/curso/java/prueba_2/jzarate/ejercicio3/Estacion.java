package cl.curso.java.prueba_2.jzarate.ejercicio3;

/**
 * 
 * @author Jesús Antonio Zárate Hernández
 *
 */
public abstract class Estacion {

	/**
	 * atributos
	 */
	private String nombre;
	private String linea;
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
	 * @return the linea
	 */
	public String getLinea() {
		return linea;
	}

	/**
	 * @param linea
	 *            the linea to set
	 */
	public void setLinea(String linea) {
		this.linea = linea;
	}

	/**
	 * constructor
	 */
	public Estacion() {

		this.nombre = "Desconocido";
		this.linea = "Común";
	}

	/**
	 * @param nombre
	 * @param linea
	 */
	public Estacion(String nombre, String linea) {
		this.nombre = nombre;
		this.linea = linea;
	}

	/**
	 * metodos
	 * 
	 * @return
	 */
	public abstract boolean seDetieneTrenRutaRoja();

	public abstract boolean seDetieneTrenRutaVerde();
}
