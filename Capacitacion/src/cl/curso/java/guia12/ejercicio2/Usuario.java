package cl.curso.java.guia12.ejercicio2;

public class Usuario {
	/**
	 * atributos
	 */
	private String nombreUsuario;
	private String password;
	private int intentosFallidos;

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombreUsuario;
	}

	/**
	 * @param nombre
	 *            the nombreUsuario to set
	 */
	public void setNombre(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password
	 *            the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the intentosFallidos
	 */
	public int getIntentosFallidos() {
		return intentosFallidos;
	}

	/**
	 * @param intentosFallidos
	 *            the intentosFallidos to set
	 */
	public void setIntentosFallidos(int intentosFallidos) {
		this.intentosFallidos = intentosFallidos;
	}
	/**
	 * constructor default
	 */
	public Usuario(){
		this.nombreUsuario = "Desconocido";
		this.password = "";
		this.intentosFallidos = 0;
	}
	/**
	 * @param nombre
	 * @param password
	 * @param intentosFallidos
	 */
	public Usuario(String nombreUsuario, String password, int intentosFallidos) {
		this.nombreUsuario = nombreUsuario;
		this.password = password;
		this.intentosFallidos = intentosFallidos;
	}

	public void login(String nombreUsuario, String password) throws CuentaBloqueadaException, AutenticacionException{
		if(this.getIntentosFallidos()>2){
				throw new CuentaBloqueadaException("La cuenta esta bloqueada");
		}
		
		if(!(this.nombreUsuario.equals(nombreUsuario) && this.password.equals(password))){
			this.intentosFallidos++;
			throw new AutenticacionException("Usuario o contraseña incorrecta");
		}
	}
}
