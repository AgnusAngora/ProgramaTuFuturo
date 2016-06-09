package cl.curso.java.guia6;
import java.util.Scanner;
public class Ejercicio6 {

	public static void main(String[] args) {
		Scanner leer = new Scanner (System.in);
		String numero = "49927398716";
		System.out.println("Ingrese el codigo de la targeta:");
		numero = leer.nextLine();
		int resultado = 0;
		int numeroSeparado=0;
		for(int i = numero.length()-1;i>=0;i--){
			numeroSeparado= Integer.parseInt(""+numero.charAt(i));
			if(numeroSeparado % 2 == 0){
				while((numeroSeparado*2)>9){
					numeroSeparado = 1+(numeroSeparado % 10);
				}
				resultado = resultado + numeroSeparado;
			}
			else{
				resultado = resultado + numeroSeparado;
			}		
		}
		if(resultado % 10 == 0){
			System.out.println("La targeta es valida");
		}
		else{
			System.out.println("La targeta no es valida");
		}
		leer.close();
	}
}
