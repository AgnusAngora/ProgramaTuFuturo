package cl.curso.java.guia7;

import javax.swing.JOptionPane;

public class CuentaVista {
	private int saldo;
	private int giroMaximo;

	public CuentaVista() {
		this.saldo = 0;
		this.giroMaximo = 200000;
	}

	public CuentaVista(int saldo, int giroMaximo) {
		this.saldo = saldo;
		this.giroMaximo = giroMaximo;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getGiroMaximo() {
		return giroMaximo;
	}

	public void setGiroMaximo(int giroMaximo) {
		this.giroMaximo = giroMaximo;
	}

	public void depositar(int deposito) {
		this.saldo = this.saldo + deposito;
	}

	public void girar(int giro)
	{
		if(giro> this.giroMaximo){
			JOptionPane.showMessageDialog(null, "Ha superado el giro maximo.");
		}
		else{
			if(giro>this.saldo){
			JOptionPane.showMessageDialog(null, "Su saldo es menor al giro realizado.");
		}
			else{
				this.saldo = this.saldo - giro;
			}
		}
	}
}
