package cl.curso.java.ejemplos.hilo;

public class ProgramaEjempoHilo {

	public static void main(String[] args) {
		EjemploHilo thread = new EjemploHilo();
		thread.start();
		System.out.println("metodo main; el nombre del thread es: "+Thread.currentThread().getName());
	}
}
