package cl.curso.java.guia12b;
/**
 * 
 * @author Agnus
 *
 */
public class Usuario {

	private String nombre;
	private String password;
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
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @param nombre
	 * @param password
	 */
	public Usuario(String nombre, String password) {
		this.nombre = nombre;
		this.password = password;
	}
	/**
	 * 
	 */
	public Usuario() {
		this.nombre = "";
		this.password = "";
	}
	

}
