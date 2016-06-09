package cl.curso.java.control_cinco.jzarate.ejercicio2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * 
 * @author Jesús Antonio Zárate Hernández
 *
 */
public class Empresa {

	private String nombre;
	private ArrayList<Empleado> empleados;

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
	 * @return the empleados
	 */
	public ArrayList<Empleado> getEmpleados() {
		return empleados;
	}

	/**
	 * @param empleados
	 *            the empleados to set
	 */
	public void setEmpleados(ArrayList<Empleado> empleados) {
		this.empleados = empleados;
	}

	/**
	 * @param nombre
	 * @param empleados
	 */
	public Empresa(String nombre, ArrayList<Empleado> empleados) {
		this.nombre = nombre;
		this.empleados = empleados;
	}

	/**
	 * constructor default
	 */
	public Empresa() {
		// TODO Auto-generated constructor stub
	}

	public void ordenarEmpleadosPorNombre(){
		Collections.sort(this.getEmpleados(), new Comparator<Empleado>() {

			@Override
			public int compare(Empleado o1, Empleado o2) {
				return o1.getNombre().compareTo(o2.getNombre());
			}
		});
	}
	public void ordenarEmpleadosPorDepartamento(){
		Collections.sort(this.getEmpleados(), new Comparator<Empleado>() {

			@Override
			public int compare(Empleado o1, Empleado o2) {
				return o1.getDepartamento().compareTo(o2.getDepartamento());
			}
		});
	}
	public Empleado buscarEmpleado(String rut) throws ExcepcionNoChequeada{
		if(this.getEmpleados().contains(rut)){
			return this.buscarEmpleado(getNombre());
		}else{
			throw new ExcepcionNoChequeada ("El empleado buscado"
					+ " no se encuentra ingresado en la empresa.");
		}
	}
	public void imprimir(){
		Iterator<Empleado> iterador = empleados.iterator();
		while(iterador.hasNext()){
			System.out.println(iterador.next());
		}
	}
}
