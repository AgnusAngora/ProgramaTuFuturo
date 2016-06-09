package cl.curso.java.guia10.ejercicio2;
/**
 * 
 * @author Agnus
 *
 */
public abstract class Empleado {

	private String nombre;
	private int horasTrabajadas;
	/**
	 * Constructor default
	 */
	public Empleado(){
		this.nombre = "Sin Nombre";
		this.horasTrabajadas = 0;
	}
	/**
	 * Constructor definido.
	 * @param nombre
	 * @param horasTrabajadas
	 */
	public Empleado(String nombre, int horasTrabajadas){
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
	}
	/**
	 * Getters and Setters
	 */
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
	 * @return the horasTrabajadas
	 */
	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	/**
	 * @param horasTrabajadas the horasTrabajadas to set
	 */
	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public abstract int calcularSalario();
}
