package cl.curso.java.prueba_2.jzarate.ejercicio3;

public class Programa {

	public static void main(String[] args) {
		TrenRutaRoja trenRojo = new TrenRutaRoja();
		TrenRutaVerde trenVerde = new TrenRutaVerde();
		EstacionRutaRoja estacionRoja = new EstacionRutaRoja();
		System.out.println(estacionRoja.seDetieneTrenRutaRoja());
		EstacionRutaVerde estacionVerde = new EstacionRutaVerde();
		System.out.println(estacionVerde.seDetieneTrenRutaVerde());
		EstacionComun estacionComun = new EstacionComun();
		System.out.println(trenRojo.seDetiene(estacionRoja));
		System.out.println(trenVerde.seDetiene(estacionVerde));
	}

}
