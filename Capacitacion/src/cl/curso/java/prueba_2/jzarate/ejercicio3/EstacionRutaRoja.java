package cl.curso.java.prueba_2.jzarate.ejercicio3;
/**
 * 
 * @author Jes�s Antonio Z�rate Hern�ndez
 *
 */
public class EstacionRutaRoja extends Estacion{

	/**
	 * constructor
	 * 
	 */
	public EstacionRutaRoja() {
		super();
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @return
	 */
	public boolean seDetieneTrenRutaRoja(){
		return true;
	}
	public boolean seDetieneTrenRutaVerde(){
		return false;
	}
}
