package cl.curso.java.control;

import javax.swing.JOptionPane;

/**
 * @author Agnus
 *
 */
public class ProgramaLibro {

	public static void main(String[] args) {
		String a = JOptionPane.showInputDialog("Ingrese el nombre del Libro: ");
		String b = JOptionPane.showInputDialog("Ingrese el nombre del Autor: ");
		int c = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de ejemplares: "));
		int d = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el número de ejemplares prestados: "));
		Libro libro = new Libro(a, b, c, d);
		libro.imprimir();

	}

}
