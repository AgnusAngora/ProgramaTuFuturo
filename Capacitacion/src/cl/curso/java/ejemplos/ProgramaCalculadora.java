package cl.curso.java.ejemplos;

import javax.swing.JOptionPane;

public class ProgramaCalculadora {

	public static void main(String[] args) {
		Calculadora operacion = new Calculadora();
		String opcion;
		int opcionInt;
		boolean opcionSalir = false;
		do{
		opcion = JOptionPane.showInputDialog("Ingrese un número para seleccionar una de estas operaciones\n"
				+"(1) Para Sumar. \n"
				+"(2) Para Restar. \n"
				+"(3) Para Multiplicar \n"
				+"(4) Para Dividir \n"
				+"(5) Para Resto \n"
				+"(6) Para Salir");
		opcionInt = Integer.parseInt(opcion);
		switch (opcionInt){
		case 1:
		{
			operacion.setNumero1(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:\n")));
			operacion.setNumero2(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:\n")));
			JOptionPane.showMessageDialog(null, operacion.sumar());
			break;
		}
		case 2:
		{
			operacion.setNumero1(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:\n")));
			operacion.setNumero2(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:\n")));
			JOptionPane.showMessageDialog(null, operacion.restar());
			break;
		}
		case 3:
		{
			operacion.setNumero1(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:\n")));
			operacion.setNumero2(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:\n")));
			JOptionPane.showMessageDialog(null, operacion.multiplicar());
			break;
		}
		case 4:
		{
			operacion.setNumero1(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:\n")));
			operacion.setNumero2(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:\n")));
			JOptionPane.showMessageDialog(null, operacion.dividir());
			break;
		}
		case 5:
		{
			operacion.setNumero1(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el primer número:\n")));
			operacion.setNumero2(Integer.parseInt(JOptionPane.showInputDialog("Ingrese el segundo número:\n")));
			JOptionPane.showMessageDialog(null, operacion.resto());
			break;
		}
		case 6:
		{
			opcionSalir = true;
			break;
		}
		}
		}
		while(opcionSalir);
		
	}

}
