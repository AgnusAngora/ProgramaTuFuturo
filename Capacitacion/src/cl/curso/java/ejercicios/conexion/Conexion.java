package cl.curso.java.ejercicios.conexion;

/**
 * @author Agnus
 *
 */
public class Conexion {
	/**
	 * @param Atributos
	 */
	private EstadoConexion estadoConexion;
	/**
	 * @param Constructor Default
	 */
	public Conexion(){
		
	}
	/**
	 * 
	 * @param estadoConexion
	 */
	public Conexion(EstadoConexion estadoConexion)
	{
		this.estadoConexion = estadoConexion;
	}
	/**
	 * @return the estadoConexion
	 */
	public EstadoConexion getEstadoConexion() {
		return estadoConexion;
	}

	/**
	 * @param estadoConexion the estadoConexion to set
	 */
	public void setEstadoConexion(EstadoConexion estadoConexion) {
		this.estadoConexion = estadoConexion;
	}
	/**
	 * @param Metodo abrir.
	 */
	public void abrir()
	{
		this.getEstadoConexion().abrir(this);
	}
	/**
	 * @param Metodo cerrar.
	 */
	public void cerrar()
	{
		this.getEstadoConexion().cerrar(this);
	}
}
