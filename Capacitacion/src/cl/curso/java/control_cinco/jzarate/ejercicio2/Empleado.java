package cl.curso.java.control_cinco.jzarate.ejercicio2;

/**
 * 
 * @author Jesús Antonio Zárate Hernández
 *
 */
public class Empleado extends Persona {

	private Departamento departamento;
	private int salario;

	/**
	 * @return the departamento
	 */
	public Departamento getDepartamento() {
		return departamento;
	}

	/**
	 * @param departamento
	 *            the departamento to set
	 */
	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	/**
	 * @return the salario
	 */
	public int getSalario() {
		return salario;
	}

	/**
	 * @param salario
	 *            the salario to set
	 */
	public void setSalario(int salario) {
		this.salario = salario;
	}

	/**
	 * @param departamento
	 * @param salario
	 */
	public Empleado(Departamento departamento, int salario) {
		this.departamento = departamento;
		this.salario = salario;
	}

	/**
	 * constructor default
	 */
	public Empleado() {
		// TODO Auto-generated constructor stub
	}

	public boolean equals(Object obj){
		if(obj instanceof Persona){
			return ((Persona)obj).getRut().equals(obj);
		}
		return false;
	}
}
