package cl.curso.java.guia7;

/**
 * @author Agnus
 *
 */
public class ProgramaCafetera {

	public static void main(String[] args) {
		Cafetera cafetera = new Cafetera();
		cafetera.imprimir();
		cafetera.setCapacidadMaxima(5000);
		cafetera.imprimir();
		cafetera.servirTasa(6000);
		cafetera.imprimir();
		cafetera.agregarCafe(6000);
		cafetera.imprimir();
		cafetera.vaciarCafetera();
		cafetera.imprimir();
	}

}
