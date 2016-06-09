package cl.curso.java.guia6;

import java.util.Scanner;
public class Ejercicio3 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int cantidadAlumnos = 0;
		int contador = 1;
		int contador2 = 1;
		System.out.println("Ingrese la cantidad de Alumnos del curso: ");
		cantidadAlumnos = leer.nextInt();
		int cantidadNotas = 0;
		int nota=0;
		int aux=0;
		int promedioAlumno = 0;
		int arreglo[] = new int[2];
		int cantidadAprovados = 0;
		int cantidadReprovados = 0;
		System.out.println("Ingrese la cantidad de notas del curso: ");
		//cantidadNotas = Leer.datoInt();
		cantidadNotas = leer.nextInt();
		while(contador<=cantidadAlumnos){
			
			while(contador2<=cantidadNotas){
				System.out.println("Ingrese la nota del "+contador+" alumno: ");
				nota = leer.nextInt();
				aux = aux + nota;
				contador2++;
			}
			promedioAlumno = aux / cantidadNotas;
			if(promedioAlumno>=4){
				cantidadAprovados++;
			}
			else{
				cantidadReprovados++;
			}
			contador++;
			contador2 = 1;
		}
		arreglo[0] = cantidadAprovados;
		arreglo[1] = cantidadReprovados;
		System.out.println("Cantidad de Alumnos Aprovados: "+arreglo[0]);
		System.out.println("Cantidad de Alumnos Reprovados: "+arreglo[1]);
		leer.close();
	}

}
