package cl.curso.java.ejemplos.mapas.ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class Programa {

	public static void main(String[] args) {

		String texto = "Buenos dias Buenos dias";
		String[] palabras = texto.split(" ");
		Map<String, Integer> contenedor = new HashMap<String, Integer>();
		for (int i = 0; i < palabras.length; i++) {

			if (contenedor.containsKey(palabras[i])) {
				contenedor.put(palabras[i], contenedor.get(palabras[i]) + 1);
			} else {
				contenedor.put(palabras[i], 1);
			}
			System.out.println("La palabra [" + palabras[i] + "] se encuentra: " + contenedor.get(palabras[i]));
		}

	}
}
