package cl.curso.java.ejercicios;

import javax.swing.JOptionPane;

public class ProgramaNotas {

	public static void main(String[] args) {
		
		Nota[] nota = new Nota[3];
		
		for(int i = 0; i < nota.length ; i++)
		{
			String nota = JOptionPane.showInputDialog("Ingresar nota "+ i);
			String nota = JOptionPane.showInputDialog("Ingresar porcentaje "+i);
		}
		
	}
}
