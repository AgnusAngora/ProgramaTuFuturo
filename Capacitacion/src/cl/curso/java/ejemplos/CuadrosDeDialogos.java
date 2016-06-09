package cl.curso.java.ejemplos;

import javax.swing.JOptionPane;

public class CuadrosDeDialogos {

	public static void main(String[] args) {
		String nota;
		int auxiliar = 0;
		int promedio = 0;
		String limite = JOptionPane.showInputDialog(null, "Ingrese la cantidad de notas a promediar: ");
		
		for(int i = 1; i<=Integer.parseInt(limite);i++){
			nota = JOptionPane.showInputDialog("Ingrese nota "+i);
			auxiliar = auxiliar + Integer.parseInt(nota);
			
		}
		promedio = auxiliar /Integer.parseInt(limite);
		JOptionPane.showMessageDialog(null, "El promedio es: "+promedio);
	}
	 
	
	
}
