package cl.curso.java.ejercicios.herencia;

/**
 * @author Agnus
 *
 */
public class Profesor extends Persona{

	private String[] cursos;

	/**
	 * @param cursos
	 */
	public Profesor(String[] cursos) {
		super();
		this.cursos = cursos;
	}

	/**
	 * @param rut
	 * @param nombre
	 * @param apellidoPaterno
	 * @param apellidoMaterno
	 */
	public Profesor(String rut, String nombre, String apellidoPaterno, String apellidoMaterno,String[] cursos) {
		super(rut, nombre, apellidoPaterno, apellidoMaterno);
		this.cursos = cursos;
	}	

	/**
	 * @return the cursos
	 */
	public String[] getCursos() {
		return cursos;
	}

	/**
	 * @param cursos the cursos to set
	 */
	public void setCursos(String[] cursos) {
		this.cursos = cursos;
	}
	
}
