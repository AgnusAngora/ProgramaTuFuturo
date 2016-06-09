package cl.curso.java.ejemplos.colecciones.ejercicio1;

import java.util.ArrayList;

public class Programa {
	public static void main(String[] args) {
		ArrayList<Contacto> lista1 = new ArrayList<Contacto>();
		Contacto contacto1 = new Contacto("Jesús", 71892371, "a@a.cl");
		Contacto contacto2 = new Contacto("Agnus", 71892371, "b@a.cl");
		Contacto contacto3 = new Contacto("Antonio", 71892371, "c@a.cl");
		lista1.add(contacto1);
		lista1.add(contacto2);
		lista1.add(contacto3);
		
		Telefono telefono = new Telefono(lista1);
		telefono.imprimirFor();
		System.out.println("---------------------");
		telefono.imprimirForEach();
		System.out.println("---------------------");
		telefono.imprimirIterador();
	}

}
