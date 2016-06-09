package cl.curso.java.ejemplos;

import javax.swing.JOptionPane;

public class Auto {
	private String color;
	private String marca;
	private String patente;
	private int kilometrosRecorridos;
	Motor motor;
	
	public Motor getMotor() {
		return motor;
	}

	public void setMotor(Motor motor) {
		this.motor = motor;
	}

	public Auto() {
		color = "Azul";
		marca = "Honda";
		patente = "YIYI01";
	}

	public Auto(String color, String marca, String patente) {
		this.color = color;
		this.marca = marca;
		this.patente = patente;
	}

	public void imprimir() {
		JOptionPane.showMessageDialog(null, this.color);
		JOptionPane.showMessageDialog(null, this.marca);
		JOptionPane.showMessageDialog(null, this.patente);
		this.motor.imprimirMotor();
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPatente() {
		return this.patente;
	}

	public void setPatente(String patente) {
		this.patente = patente;
	}

	public String getColor() {
		return this.color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void encender() {
		this.motor.setEncendido(true);
	}
	public void avanzar(int kilometrosRecorridos){
		this.kilometrosRecorridos = this.kilometrosRecorridos+kilometrosRecorridos;
		if(this.motor.isEncendido()){
			JOptionPane.showMessageDialog(null,"El auto esta Avanzando");
		}
		else{
			JOptionPane.showMessageDialog(null, "El auto no esta encendido");
		}
	}
	
	
	
}
