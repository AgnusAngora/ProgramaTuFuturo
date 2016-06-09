package cl.curso.java.guia6;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner leer = new Scanner(System.in);
		int multiplicador = 2;
		int resultado = 0;
		String definidor;
		String codigoVerificador;
		String codigoNumerico;
		System.out.println("Ingrese el codigo numerico del libro: ");
		definidor = leer.nextLine();
		codigoNumerico = definidor.split("-")[0];
		codigoVerificador = definidor.split("-")[1];
		for(int i = 8; i >-1;i--){
			resultado = resultado+(Integer.parseInt(""+codigoNumerico.charAt(i)*multiplicador));
			multiplicador++;
		}
		int resto = 0;
		int checksum = 0;
		resto = resultado % 11;
		if(resto == Integer.parseInt(codigoVerificador)){
			codigoVerificador = "0";
			System.out.println("El codigo es correcto");
		}
		else{
		checksum = 11 - resto;
		if(checksum == 10){
			codigoVerificador = "X";
			System.out.println("El codigo es correcto");
		}
		else{
			codigoVerificador = ""+checksum;
		}
		}
		leer.close();
	}

}
