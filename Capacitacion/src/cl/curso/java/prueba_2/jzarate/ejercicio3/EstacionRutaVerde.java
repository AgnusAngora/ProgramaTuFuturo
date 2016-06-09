package cl.curso.java.prueba_2.jzarate.ejercicio3;
/**
 * 
 * @author Jesús Antonio Zárate Hernández
 *
 */
public class EstacionRutaVerde extends Estacion{
	/**
	 * constructor
	 */
	public EstacionRutaVerde() {
		super();
		
	}
	public boolean seDetieneTrenRutaRoja(){
		return false;
	}
	public boolean seDetieneTrenRutaVerde(){
		return true;
	}
}
