package cl.curso.java.ejercicios.conexion;

public class ConexionAbierta extends EstadoConexion{
	
	public void abrir(Conexion conexion)
	{
		throw new ConexionAbiertaException( "El estado de la conexion es abierta" );
	}
	public void cerrar(Conexion conexion)
	{
		conexion.setEstadoConexion(new ConexionCerrada());
	}
}
