package cl.curso.java.prueba_2.jzarate.ejercicio3;
/**
 * 
 * @author Jesús Antonio Zárate Hernández
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
