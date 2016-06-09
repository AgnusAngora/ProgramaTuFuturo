package cl.curso.java.guia6;

import java.util.Scanner;
public class Ejercicio2 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int monedas = 0;
		int billetes = 0;
		System.out.println("Ingrese el total de monedas: ");
		monedas = leer.nextInt();
		System.out.println("Ingrese el total de billetes: ");
		billetes = leer.nextInt();
		int total = 0;
		total = monedas + billetes;
		System.out.println("El total es: "+total);
		leer.close();
	}

}
