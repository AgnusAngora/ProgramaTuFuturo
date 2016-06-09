package cl.curso.java.prueba_2.jzarate.ejercicio2;
/**
 * 
 * @author Jesús Antonio Zárate Hernández
 *
 */
public class Alumno implements Imprimir{

	/**
	 * atributos
	 */
	private String nombre;
	private double promedio;
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
	 * @return the promedio
	 */
	public double getPromedio() {
		return promedio;
	}
	/**
	 * @param promedio the promedio to set
	 */
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	/**
	 * constructor default
	 */
	public Alumno(){
		this.nombre = "Desconocido";
		this.promedio = 1.0;
	}
	/**
	 * @param nombre
	 * @param promedio
	 */
	public Alumno(String nombre, double promedio) {
		this.nombre = nombre;
		this.promedio = promedio;
	}
	public void imprimir(){
		System.out.println(this.getNombre());
		System.out.println(this.getPromedio());
	}
}
