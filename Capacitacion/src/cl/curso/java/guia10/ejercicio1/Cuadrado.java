package cl.curso.java.guia10.ejercicio1;

public class Cuadrado extends FiguraGeometrica{

	/**
	 * Atributos
	 */
	private int lado;
	/**
	 * Constructor default
	 */
	public Cuadrado(){
		this.lado = 90;
	}
	/**
	 * Constructor definido
	 */
	public Cuadrado(int lado){
		this.lado = lado;
	}
	/**
	 * Getters and Setters
	 */
	/**
	 * @return the lado
	 */
	public int getLado() {
		return lado;
	}
	/**
	 * @param lado the lado to set
	 */
	public void setLado(int lado) {
		this.lado = lado;
	}
	/**
	 * Metodos
	 */
	@Override
	public void dibujar()
	{
		System.out.print(" _"+
					  "\n[_]");
	}
	@Override
	public double calcularArea()
	{
		return this.getLado()*2;
	}
	
}
