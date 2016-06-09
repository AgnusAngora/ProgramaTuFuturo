package cl.curso.java.ejercicios.thread.ejercicio1;
/**
 * 
 * @author Agnus
 *
 */
public class Contador {

	private int cuenta;
	/**
	 * constructor default
	 */
	public Contador(){
		this.cuenta = 0;
	}
	public Contador(int cuenta){
		this.cuenta = cuenta;
	}
	/**
	 * @return the cuenta
	 */
	public int getCuenta() {
		return cuenta;
	}
	/**
	 * @param cuenta the cuenta to set
	 */
	public void setCuenta(int cuenta) {
		this.cuenta = cuenta;
	}
	/**
	 * metodos
	 */
	public void aumentarCuenta(){
		this.cuenta++;
		System.out.println(this.cuenta);
	}
	
}
