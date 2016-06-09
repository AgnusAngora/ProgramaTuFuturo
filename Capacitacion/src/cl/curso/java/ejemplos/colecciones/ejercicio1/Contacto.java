package cl.curso.java.ejemplos.colecciones.ejercicio1;
/**
 * 
 * @author Agnus
 *
 */
public class Contacto {

	private String nombre;
	private int telefono;
	private String email;
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
	 * @return the telefono
	 */
	public int getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @param nombre
	 * @param telefono
	 * @param email
	 * @param contactos
	 */
	public Contacto(String nombre, int telefono, String email) {
		this.nombre = nombre;
		this.telefono = telefono;
		this.email = email;
	}
	/**
	 * 
	 */
	public Contacto() {
		super();
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Contacto [nombre=" + nombre + ", telefono=" + telefono + ", email=" + email + "]";
	}
}
