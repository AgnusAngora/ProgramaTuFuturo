package cl.curso.java.ejercicios.herencia;

/**
 * @author Agnus
 *
 */
public class Alumno extends Persona{

	private int[] Notas;

	/**
	 * 
	 */
	public Alumno(int[] notas) {
		super();
		this.Notas = notas;
	}

	/**
	 * @param rut
	 * @param nombre
	 * @param apellidoPaterno
	 * @param apellidoMaterno
	 */
	public Alumno(String rut, String nombre, String apellidoPaterno, String apellidoMaterno, int[] notas) {
		super(rut, nombre, apellidoPaterno, apellidoMaterno);
		this.Notas = notas;
	}

	/**
	 * @return the notas
	 */
	public int[] getNotas() {
		return Notas;
	}

	/**
	 * @param notas the notas to set
	 */
	public void setNotas(int[] notas) {
		Notas = notas;
	}

	

}
