package cl.curso.java.control;

import javax.swing.JOptionPane;

public class ProgramaArticulo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Ingrese el Nombre del articulo: ");
		int b = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el costo base del producto: "));
		
		Articulo miselaneo = new Articulo(a,b);
		miselaneo.imprimir();

	}

}
