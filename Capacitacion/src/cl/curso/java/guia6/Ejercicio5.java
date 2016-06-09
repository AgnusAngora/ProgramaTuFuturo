package cl.curso.java.guia6;
import java.util.Scanner;
public class Ejercicio5 {

	public static void main(String[] args) {
		int multiplicador = 2;
		int resultado = 0;
		Scanner leer = new Scanner(System.in);
		String definidor;
		String rut;
		String digitoVerificador;
		System.out.println("Ingrese el rut con guion y digito verificador: ");
		definidor = leer.nextLine();
		rut = definidor.split("-")[0];
		digitoVerificador = definidor.split("-")[1];
		for(int i = rut.length()-1;i>=0;i--){
			resultado = resultado+(Integer.parseInt(""+rut.charAt(i)*multiplicador));
			multiplicador++;
		}
		int resto=0;
		int verificacion = 0;
		resto = resultado % 11;

		if(resto == Integer.parseInt(digitoVerificador)){
			System.out.println("El rut "+rut+"-"+digitoVerificador+" es correcto.");
		}
		else{
			if(resto == 11){
				System.out.println(rut+"-K");
			}
			else{

				if(resto == 10){
					System.out.println(rut+"-0");
				}
				else{
					verificacion = 11 - resto;
					System.out.println(verificacion);
				}
			}
		}
		leer.close();
	}
}
