package cl.curso.java.control_cinco.jzarate.ejercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * 
 * @author Jesús Antonio Zárate Hernández
 *
 */
public class CuentaBancaria {

	private int numero;
	private ArrayList<Transaccion> transacciones;

	/**
	 * @return the numero
	 */
	public int getNumero() {
		return numero;
	}

	/**
	 * @param numero
	 *            the numero to set
	 */
	public void setNumero(int numero) {
		this.numero = numero;
	}

	/**
	 * @return the transacciones
	 */
	public ArrayList<Transaccion> getTransacciones() {
		return transacciones;
	}

	/**
	 * @param transacciones
	 *            the transacciones to set
	 */
	public void setTransacciones(ArrayList<Transaccion> transacciones) {
		this.transacciones = transacciones;
	}

	/**
	 * @param numero
	 * @param transacciones
	 */
	public CuentaBancaria(int numero, ArrayList<Transaccion> transacciones) {
		this.numero = numero;
		this.transacciones = transacciones;
	}

	/**
	 * constructor default
	 */
	public CuentaBancaria() {
		// TODO Auto-generated constructor stub
	}

	public void ordenarTransaccionesPorFecha(){
		Collections.sort(this.getTransacciones(), new Comparator<Transaccion>() {

			@Override
			public int compare(Transaccion o1, Transaccion o2) {
				if (o1.getFecha() == o2.getFecha())
					return 0;
				if (o1.getFecha().getTime() > o2.getFecha().getTime())
					return 1;
				return -1;
			}
		});
	}
	
	public void ordenarTransaccionesPorTipo(){
		Collections.sort(this.getTransacciones(), new Comparator<Transaccion>() {

			@Override
			public int compare(Transaccion o1, Transaccion o2) {
				return o1.getTipo().compareTo(o2.getTipo());
			}
		});
	}
	public void imprimir(){
		for(Transaccion transacciones: transacciones){
			System.out.println(transacciones);
		}
	}
}
