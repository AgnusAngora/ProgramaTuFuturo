package cl.curso.java.guia10.ejercicio2;

public class EmpleadoContratado extends Empleado {



	/**
	 * Heredado
	 */
	public EmpleadoContratado() {
		super();
	}
	/**
	 * @param nombre
	 * @param horasTrabajadas
	 */
	public EmpleadoContratado(String nombre, int horasTrabajadas) {
		super(nombre, horasTrabajadas);
	}

	public int calcularSalario() {
		return this.getHorasTrabajadas() * 20000;
	}
}
