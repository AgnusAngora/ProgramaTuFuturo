package cl.curso.java.guia10.ejercicio2;

public class EmpleadoComision extends Empleado {

	private int cantidadDeVentas;
	private int salarioBase;

	/**
	 * constructor default
	 */
	public EmpleadoComision() {
		super();
		this.cantidadDeVentas = 0;
		this.salarioBase = 0;
	}

	/**
	 * constructor definido
	 * @param nombre
	 * @param horasTrabajadas
	 */
	public EmpleadoComision(String nombre, int horasTrabajadas, int cantidadDeVentas, int salarioBase) {
		super(nombre, horasTrabajadas);
		this.cantidadDeVentas = cantidadDeVentas;
		this.salarioBase = salarioBase;
	}

	public int calcularSalario() {
		return this.salarioBase + this.cantidadDeVentas * 9000;
	}

}
