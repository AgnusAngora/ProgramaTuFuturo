package cl.curso.java.guia10.ejercicio1;
/**
 * 
 * @author Agnus
 *
 */
public abstract class FiguraGeometrica {
/**
 * @param Atributos
 */
	private String color;
	private int cantidadLados;
	/**
	 * Getters and Setters
	 */
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return the cantidadLados
	 */
	public int getCantidadLados() {
		return cantidadLados;
	}
	/**
	 * @param cantidadLados the cantidadLados to set
	 */
	public void setCantidadLados(int cantidadLados) {
		this.cantidadLados = cantidadLados;
	}
	/**
	 * Metodos
	 */
	public abstract void dibujar();

	public abstract double calcularArea();
	
}
