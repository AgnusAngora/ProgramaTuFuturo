package cl.curso.java.ejemplos;

import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class programa {

	public static void main(String[] args) {
		Auto autoToyota = new Auto("Rojo", "Toyota", "YIYI01");
		Motor motorToyota = new Motor(2000, "bencina");
		autoToyota.setMotor(motorToyota);
		boolean opcionSalir = false;
		do
		{
			String opcion = JOptionPane.showInputDialog(
					"Opcion 1: Enceder auto\n"
					+"Opcion 2: Avanzar\n"
					+"Opcion 3: Imprimir\n"
					+"Opcion 4: Salir");
			switch (opcion){
			case "1":
			{
				autoToyota.encender();
				JOptionPane.showMessageDialog(null, "El auto esta encendido.");
				break;
			}
			case "2":
			{
				String avanzando = JOptionPane.showInputDialog("Cuantos kilometros desea avanzar: ");
				autoToyota.avanzar(Integer.parseInt(avanzando));
				break;
			}
			case "3":
			{
				autoToyota.imprimir();
				break;
			}
			case "4":
			{
				opcionSalir = true;
				break;
			}
			default:
			{
				JOptionPane.showMessageDialog(null, "Opcion ingresada incorrecta.");
				break;
			}
			}
		}
		while(!opcionSalir);
			
//		autoToyota.avanzar();
//		autoToyota.imprimir();
//		autoToyota.setMarca("Mitsubichi");
//		autoToyota.setPatente("GGGG44");
//		autoToyota.imprimir();

	}

}
