package cl.curso.java.ejercicios.herencia;

/**
 * @author Agnus
 *
 */
public class Persona {

	private String rut;
	private String nombre;
	private String apellidoPaterno;
	private String apellidoMaterno;

	/**
	 * 
	 */
	public Persona() {
	}

	/**
	 * @param rut
	 * @param nombre
	 * @param apellidoPaterno
	 * @param apellidoMaterno
	 */
	public Persona(String rut, String nombre, String apellidoPaterno, String apellidoMaterno) {
		super();
		this.rut = rut;
		this.nombre = nombre;
		this.apellidoPaterno = apellidoPaterno;
		this.apellidoMaterno = apellidoMaterno;
	}

	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}

	/**
	 * @param rut
	 *            the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}

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
	 * @return the apellidoPaterno
	 */
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	/**
	 * @param apellidoPaterno
	 *            the apellidoPaterno to set
	 */
	public void setApellidoPaterno(String apellidoPaterno) {
		this.apellidoPaterno = apellidoPaterno;
	}

	/**
	 * @return the apellidoMaterno
	 */
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	/**
	 * @param apellidoMaterno
	 *            the apellidoMaterno to set
	 */
	public void setApellidoMaterno(String apellidoMaterno) {
		this.apellidoMaterno = apellidoMaterno;
	}

	/**
	 * 
	 */
	public void irAClases() {
		System.out.println("Ir a clases.");
	}

}
