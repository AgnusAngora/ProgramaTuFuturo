package cl.curso.java.ejercicios.hilos.ejercicio1;

/**
 * @author Agnus
 *
 */
public class BombaDeTiempo implements Runnable{

	String[] numeros = {"Cero","Uno","Dos","Tres","Cuatro","Cinco","Seis","Siete","Ocho","Nueve"};
	
	@Override
	public void run()
	{
		try{
			for(int i = numeros.length-1;i>=0;i--){
				Thread.sleep(1000);
				System.out.println(numeros[i]);
			}
			Thread.sleep(500);
			System.out.println("¡BOOM!");
		}catch (InterruptedException ex){
			
		}
	}
	/**
	 * 
	 * @param main
	 */
	public static void main (String args[]) throws InterruptedException{
		
		Thread thread = new Thread (new BombaDeTiempo());
		thread.start();
		
		
	}
}
