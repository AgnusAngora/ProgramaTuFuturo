package cl.curso.java.prueba_2.jzarate.ejercicio3;

/**
 * 
 * @author Jesús Antonio Zárate Hernández
 *
 */
public abstract class Tren {
	/**
	 * atributos
	 */
	private int numero;
	private String linea;

	/**
	 * Getters and Setters
	 */
	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
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
	 * constructor default
	 */
	public Tren() {
		this.numero = 0;
		this.linea = "Desconocida";
	}

	/**
	 * @param numero
	 * @param linea
	 */
	public Tren(int numero, String linea) {
		this.numero = numero;
		this.linea = linea;
	}

	/**
	 * metodos
	 */
	public abstract boolean seDetiene(Estacion estacion);
}
