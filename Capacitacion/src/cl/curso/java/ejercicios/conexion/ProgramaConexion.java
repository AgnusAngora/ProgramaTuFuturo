package cl.curso.java.ejercicios.conexion;

public class ProgramaConexion {

	public static void main(String[] args) {
		
		ConexionAbierta open = new ConexionAbierta();
		Conexion conexion = new Conexion(open);
		conexion.abrir();

	}

}
