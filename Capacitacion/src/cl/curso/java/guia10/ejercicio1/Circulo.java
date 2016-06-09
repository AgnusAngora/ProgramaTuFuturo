package cl.curso.java.guia10.ejercicio1;

public class Circulo extends FiguraGeometrica{
	/**
	 * Atributos
	 */
	private double radio;
	/**
	 * Constructor default
	 */
	public Circulo(){
		this.radio = 90;
	}
	/**
	 * Constructor definido
	 */
	public Circulo(double radio){
		this.radio = radio;
	}
	/**
	 * Getters and Setters
	 */
	/**
	 * @return the radio
	 */
	public double getRadio() {
		return radio;
	}
	/**
	 * @param radio the radio to set
	 */
	public void setRadio(double radio) {
		this.radio = radio;
	}
	/**
	 * Metodos
	 */
	@Override
	public void dibujar()
	{
		System.out.print("O");
	}
	@Override
	public double calcularArea()
	{
		return Math.PI*this.getRadio();
	}
	
}
