package cl.curso.java.guia10.ejercicio1;

public class Triangulo extends FiguraGeometrica {
	/**
	 * Atributos
	 */
	private int base;
	private int altura;

	/**
	 * Constructor default
	 */
	public Triangulo() {
		this.base = 90;
		this.altura = 90;
	}
	/**
	 * Constructor definido
	 */
	public Triangulo(int base, int altura){
		this.base = base;
		this.altura = altura;
	}
	
	/**
	 * Getters and Setters
	 */

	/**
	 * @return the base
	 */
	public int getBase() {
		return base;
	}

	/**
	 * @param base
	 *            the base to set
	 */
	public void setBase(int base) {
		this.base = base;
	}

	/**
	 * @return the altura
	 */
	public int getAltura() {
		return altura;
	}

	/**
	 * @param altura
	 *            the altura to set
	 */
	public void setAltura(int altura) {
		this.altura = altura;
	}

	/**
	 * Metodos
	 */
	@Override
	public void dibujar() {
		
		System.out.print(" /\\ " + "\n/__\\ ");
	}

	@Override
	public double calcularArea() {
		return this.getBase() * this.getAltura();
	}

}
