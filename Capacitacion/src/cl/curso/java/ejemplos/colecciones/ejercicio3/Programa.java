package cl.curso.java.ejemplos.colecciones.ejercicio3;

import java.awt.List;
import java.util.ArrayList;

public class Programa {

	public static void main(String[] args) {

		Cancion cancion1 = new Cancion("Hola", "Desconocido", 200);
		Cancion cancion2 = new Cancion("Holl", "Desconocido", 300);
		Cancion cancion3 = new Cancion("Hoaa", "Desconocido", 220);
		Cancion cancion4 = new Cancion("H0la", "Desconocido", 100);
		ArrayList<Cancion> listaDeCanciones1 = new ArrayList<>();
		listaDeCanciones1.add(cancion1);
		listaDeCanciones1.add(cancion2);
		listaDeCanciones1.add(cancion3);
		listaDeCanciones1.add(cancion4);
		ArrayList<Cancion> listaDeCanciones2 = new ArrayList<>();
		listaDeCanciones2.add(cancion1);
		listaDeCanciones2.add(cancion2);
		listaDeCanciones2.add(cancion3);	
		PlayList lista1 = new PlayList(" ", listaDeCanciones1, null);
		PlayList lista2 = new PlayList(" ", listaDeCanciones2, null);
		ArrayList<PlayList> listas = new ArrayList<>();
		listas.add(lista1);
		listas.add(lista2);
		lista2.agregarCancion(cancion4);
		System.out.println("La duracion es de: "+lista1.duracionMin());
		System.out.println("La duracion es de: "+lista2.duracionMin());
		lista2.eliminarCancion(cancion1);
		lista1.ordenarPorDuracionCancion();
		lista1.imprimir();
		Usuario usuario = new Usuario("", listas);
		
		
		
	}

}
