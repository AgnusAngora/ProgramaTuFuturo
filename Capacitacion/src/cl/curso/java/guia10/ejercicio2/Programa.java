package cl.curso.java.guia10.ejercicio2;

public class Programa {

	public static void main(String args[]){
		EmpleadoContratado ec = new EmpleadoContratado("Jes�s",8);
		System.out.println("El salario es: "+ec.calcularSalario());
		EmpleadoComision ecom = new EmpleadoComision("Jes�s",8,90,10000);
		System.out.println("El salario es: "+ecom.calcularSalario());
	}
}
