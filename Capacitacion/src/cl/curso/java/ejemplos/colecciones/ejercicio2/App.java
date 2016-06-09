package cl.curso.java.ejemplos.colecciones.ejercicio2;

public class App {

	private String nombre;
	private int pesoMB;

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
	 * @return the pesoMB
	 */
	public int getPesoMB() {
		return pesoMB;
	}

	/**
	 * @param pesoMB
	 *            the pesoMB to set
	 */
	public void setPesoMB(int pesoMB) {
		this.pesoMB = pesoMB;
	}

	/**
	 * 
	 */
	public App() {
	}

	/**
	 * @param nombre
	 * @param pesoMB
	 */
	public App(String nombre, int pesoMB) {
		this.nombre = nombre;
		this.pesoMB = pesoMB;
	}

	public boolean equals(Object obj){
		if(obj instanceof App){
			return this.getNombre().equals(((App)obj).getNombre());
		}
		return false;
	}
}
