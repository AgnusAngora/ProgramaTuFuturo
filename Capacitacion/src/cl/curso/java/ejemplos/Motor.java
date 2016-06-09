package cl.curso.java.ejemplos;

import javax.swing.JOptionPane;

public class Motor {
	int caballosDeFuerza;
	String tipo;
	boolean encendido;
	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	public Motor(int caballosDeFuerza, String tipo) {
		super();
		this.caballosDeFuerza = caballosDeFuerza;
		this.tipo = tipo;
	}

	public Motor() {
		this.caballosDeFuerza = 1000;
	}

	public Motor(int caballosDeFuerza) {
		this.caballosDeFuerza = caballosDeFuerza;
	}

	public int getCaballosDeFuerza() {
		return caballosDeFuerza;
	}

	public void setCaballosDeFuerza(int caballosDeFuerza) {
		this.caballosDeFuerza = caballosDeFuerza;
	}
	public void imprimirMotor(){
		JOptionPane.showMessageDialog(null, this.caballosDeFuerza);
		JOptionPane.showMessageDialog(null, this.encendido);
	}

}
