package cl.curso.java.control_cinco.jzarate.ejercicio2;

/**
 * 
 * @author Jesús Antonio Zárate Hernández
 *
 */
public class Departamento {

	private String nombre;
	private String descripcion;

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
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion
	 *            the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @param nombre
	 * @param descripcion
	 */
	public Departamento(String nombre, String descripcion) {
		this.nombre = nombre;
		this.descripcion = descripcion;
	}

	/**
	 * constructor default
	 */
	public Departamento() {
		// TODO Auto-generated constructor stub
	}

	public boolean equals(Object obj){
		if(obj instanceof Departamento){
			return ((Departamento)obj).getNombre()== this.getNombre();
		}
		return false;
	}

	public int compareTo(Departamento departamento) {
		// TODO Auto-generated method stub
		return 0;
	}
}

