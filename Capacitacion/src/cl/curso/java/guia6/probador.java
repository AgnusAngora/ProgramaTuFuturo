package cl.curso.java.guia6;

public class probador {

	public static void main(String[] args) {
		String numero = "49927398716";
		int resultado = 0;
		int numeroSeparado = 0;
		int multiplicador = 2;
		int sumatoriaTotal = 0;
		for(int i = numero.length()-1;i>=0;i--){
			if (Integer.parseInt(""+numero) % 2 == 0){
				resultado = Integer.parseInt(""+numero) * multiplicador;
				String pasarNumero = "";
				pasarNumero = Integer.toString(resultado);
				int arreglo[] = new int[2];
				int sumatoria = 0;
				while(pasarNumero.length()>1){
					arreglo[0] = Integer.parseInt(""+pasarNumero.charAt(0));
					arreglo[1] = Integer.parseInt(""+pasarNumero.charAt(1));
					sumatoria = arreglo[0]+arreglo[1];
					pasarNumero = Integer.toString(sumatoria);
				}
				resultado = Integer.parseInt(pasarNumero);
				sumatoriaTotal = sumatoriaTotal + resultado;
			}
			else{
				sumatoriaTotal = sumatoriaTotal + numeroSeparado;
			}	
		}
		if(sumatoriaTotal % 10 == 0){
			System.out.println("La tarjeta es valida.");
		}
		else{
			System.out.println("La tarjeta no es valida.");
		}
	}

}
