package cl.curso.java.control;

/**
 * @author Agnus
 *
 */
public class Articulo {

	private String nombreArticulo;
	private int costoBase;

	public String getNombreArticulo() {
		return nombreArticulo;
	}

	public void setNombreArticulo(String nombreArticulo) {
		this.nombreArticulo = nombreArticulo;
	}

	public int getCostoBase() {
		return costoBase;
	}

	public void setCostoBase(int costoBase) {
		this.costoBase = costoBase;
	}

	public Articulo() {
		this.nombreArticulo = "Shampoo";
		this.costoBase = 1;
	}

	public Articulo(String nombreArticulo, int costoBase) {
		this.nombreArticulo = nombreArticulo;
		this.costoBase = costoBase;
	}

	public int precioAlDetalle() {
		return (int) (this.costoBase * 0.30);
	}

	public int precioAlMayor() {
		return (int) (this.costoBase * 0.15);
	}

	public void imprimir() {
		System.out.println(
				"El nombre del Articulo es: " + getNombreArticulo() + "\n" + "El costo base es: " + getCostoBase());
	}
}
