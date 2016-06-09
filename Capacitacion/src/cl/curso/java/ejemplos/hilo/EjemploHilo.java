package cl.curso.java.ejemplos.hilo;

public class EjemploHilo extends Thread{
	@Override
	public void run(){
		try{
			sleep(1000);
		}catch (InterruptedException ex){
			
		}
		System.out.println("El nombre del thread es: "+getName());
	}
}
