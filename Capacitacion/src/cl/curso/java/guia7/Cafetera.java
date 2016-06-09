package cl.curso.java.guia7;

import javax.swing.JOptionPane;

/**
 * @author Agnus
 *
 */
public class Cafetera {
	private int capacidadMaxima;
	public int getCapacidadMaxima() {
		return capacidadMaxima;
	}

	public void setCapacidadMaxima(int capacidadMaxima) {
		this.capacidadMaxima = capacidadMaxima;
	}

	public int getCantidadActual() {
		return cantidadActual;
	}

	public void setCantidadActual(int cantidadActual) {
		this.cantidadActual = cantidadActual;
	}

	private int cantidadActual;

	public Cafetera() {
		this.capacidadMaxima = 1000;
		this.cantidadActual = this.capacidadMaxima;
	}

	public Cafetera(int capacidadMaxima, int cantidadActual) {
		this.capacidadMaxima = capacidadMaxima;
		this.cantidadActual = cantidadActual;
		if (this.cantidadActual > this.capacidadMaxima) {
			this.cantidadActual = this.capacidadMaxima;
		}
	}

	public void llenarCafetera() {
		this.cantidadActual = this.capacidadMaxima;
	}

	public void servirTasa(int servirTasa) {
		if (servirTasa > this.cantidadActual) {
			this.cantidadActual = this.cantidadActual - this.cantidadActual;
		} else {
			this.cantidadActual = this.cantidadActual - servirTasa;
		}
	}

	public void vaciarCafetera() {
		this.cantidadActual = 0;
	}

	public void agregarCafe(int agregarCafe) {
		if (this.cantidadActual + agregarCafe < this.capacidadMaxima) {
			this.cantidadActual = this.cantidadActual + agregarCafe;
		} else {
			this.cantidadActual = this.capacidadMaxima;
		}
	}

	public void imprimir() {
		JOptionPane.showMessageDialog(null, "La capacidad maxima es: "+this.capacidadMaxima+"\n"+
		"La cantidad actual es: "+this.cantidadActual);
	}
}
