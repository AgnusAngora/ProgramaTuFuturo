package cl.curso.java.ejercicios.thread.ejercicio1;
/**
 * 
 * @author Agnus
 *
 */
public class AumentaThread extends Thread{

	private Contador contador;
	/**
	 * @param contador
	 */
	public AumentaThread(Contador contador) {
		super();
		this.contador = contador;
	}



	public void run(){
		this.contador.aumentarCuenta();
		this.contador.aumentarCuenta();
		this.contador.aumentarCuenta();
	}
}
