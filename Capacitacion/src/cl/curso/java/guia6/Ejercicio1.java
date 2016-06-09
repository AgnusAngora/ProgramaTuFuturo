package cl.curso.java.guia6;

public class Ejercicio1 {

	public static void main(String[] args) {
	/* cantidad de meses pagados = 20;
	 * el cliente paga inicialmente  10 luego se multiplica por 2 hasta la cantidad de meses
	 * pagados.
	 */
		short cantidadMesesPagados = 20;
		short contador = 1;
		int pago = 5;
		int aux = 0;
		while(contador <= cantidadMesesPagados){
			pago = pago * 2;
			aux = aux + pago;
			contador++;
			System.out.println(pago);
		}
		System.out.println("El pago total es de: $"+aux);
	}
}
