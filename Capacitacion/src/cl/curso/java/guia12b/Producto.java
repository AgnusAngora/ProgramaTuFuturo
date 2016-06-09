package cl.curso.java.guia12b;

/**
 * 
 * @author Agnus
 *
 */
public class Producto {

	private int identificador;
	private String nombre;
	private int precio;

	/**
	 * @return the identificador
	 */
	public int getIdentificador() {
		return identificador;
	}

	/**
	 * @param identificador
	 *            the identificador to set
	 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre
	 *            the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the precio
	 */
	public int getPrecio() {
		return precio;
	}

	/**
	 * @param precio
	 *            the precio to set
	 */
	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Producto() {
		this.identificador = 0;
		this.nombre = "";
		this.precio = 0;
	}

	/**
	 * @param identificador
	 * @param nombre
	 * @param precio
	 */
	public Producto(int identificador, String nombre, int precio) {
		this.identificador = identificador;
		this.nombre = nombre;
		this.precio = precio;
	}
	@Override
	public boolean equals (Object obj){
		if(obj instanceof Producto){
			return ((Producto)obj).getIdentificador()== this.getIdentificador();
		}
		return false;
	}

}
