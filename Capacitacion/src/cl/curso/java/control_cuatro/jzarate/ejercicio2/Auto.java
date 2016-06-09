package cl.curso.java.control_cuatro.jzarate.ejercicio2;
/**
 * 
 * @author Jesús Zárate Hernández
 *
 */
public class Auto {
	/**
	 * atributos
	 */
	private String marca;
	private String modelo;
	private int anio;
	private int stock;

	/**
	 * constructor
	 */
	public Auto() {
		this.marca = "Desconocida";
		this.modelo = "000000-00";
		this.anio = 0;
		this.stock = 0;
	}

	/**
	 * @param marca
	 * @param modelo
	 * @param anio
	 * @param stock
	 */
	public Auto(String marca, String modelo, int anio, int stock) {
		this.marca = marca;
		this.modelo = modelo;
		this.anio = anio;
		this.stock = stock;
	}

	/**
	 * Getters and Setters
	 */
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}

	/**
	 * @param marca
	 *            the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}

	/**
	 * @return the modelo
	 */
	public String getModelo() {
		return modelo;
	}

	/**
	 * @param modelo
	 *            the modelo to set
	 */
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	/**
	 * @return the anio
	 */
	public int getAnio() {
		return anio;
	}

	/**
	 * @param anio
	 *            the anio to set
	 */
	public void setAnio(int anio) {
		this.anio = anio;
	}

	/**
	 * @return the stock
	 */
	public int getStock() {
		return stock;
	}

	/**
	 * @param stock
	 *            the stock to set
	 */
	public void setStock(int stock) {
		this.stock = stock;
	}

	public void venderAuto(){
		if(this.getStock()==0){
			throw new SinStockException("No es posible vender auto. No hay stock");
		}else{
			this.stock--;
		}
	}
}
