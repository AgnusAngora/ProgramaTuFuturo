package cl.curso.java.ejercicios.conexion;

public abstract class EstadoConexion {
	
	public abstract void abrir(Conexion conexion);
	public abstract void cerrar(Conexion conexion);
}
