package cl.curso.java.prueba_2.jzarate.ejercicio3;
/**
 * 
 * @author Jes�s Antonio Z�rate Hern�ndez
 *
 */
public class TrenRutaRoja extends Tren{
	/**
	 * @param estacion
	 * @return
	 */
	public boolean seDetiene(Estacion estacion){
		return estacion.seDetieneTrenRutaRoja();
	}
	
}
