package cl.curso.java.ejercicios.division;

import javax.swing.JOptionPane;

public class ProgramaDivision {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "Programa para dividir.");

		try{
			int a = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Dividendo"));
			int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Divisor"));
			Division division = new Division(a,b);
			division.hacerDivision();
		}catch(ArithmeticException e){
			JOptionPane.showMessageDialog(null, "No se pueden realizar divisiones por 0.");
		}catch(NumberFormatException n){
			JOptionPane.showMessageDialog(null, "No se pueden ingresar letras. Ingrese valores númericos.");
		}
		
		
	}

}
