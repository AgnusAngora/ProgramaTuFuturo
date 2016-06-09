package cl.curso.java.ejercicios.thread.ejercicio1;

public class Programa {

	public static void main(String[] args) {
		Contador contador = new Contador(0);
		AumentaThread aumenta = new AumentaThread(contador);
		aumenta.start();

		
	}

}
