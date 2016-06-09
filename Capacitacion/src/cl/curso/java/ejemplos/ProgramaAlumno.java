package cl.curso.java.ejemplos;

import javax.swing.JOptionPane;

/**
 * @author Agnus
 *
 */
public class ProgramaAlumno {

	public static void main(String[] args) {
		Alumno alumno = new Alumno();
		alumno.setNombreAlumno(JOptionPane.showInputDialog("Ingrese el Nombre del Alumno"));
		alumno.setNota1(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la primera nota:")));
		alumno.setNota2(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la segunda nota:")));
		alumno.setNota3(Integer.parseInt(JOptionPane.showInputDialog("Ingrese la tercera nota:")));
		JOptionPane.showMessageDialog(null,
				"El nombre del alumno es: " + alumno.getNombreAlumno() + "\nEl promedio de notas es: " + alumno.promedio());
	}

}
