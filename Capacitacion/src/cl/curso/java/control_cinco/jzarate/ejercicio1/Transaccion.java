package cl.curso.java.control_cinco.jzarate.ejercicio1;

import java.util.Date;

/**
 * 
 * @author Jes�s Antonio Z�rate Hern�ndez
 *
 */
public class Transaccion {

	private String id;
	private String tipo;
	private Date fecha;
	private int monto;
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	/**
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the monto
	 */
	public int getMonto() {
		return monto;
	}
	/**
	 * @param monto the monto to set
	 */
	public void setMonto(int monto) {
		this.monto = monto;
	}
	
	/**
	 * constructor default
	 */
	public Transaccion() {
	}
	/**
	 * @param id
	 * @param tipo
	 * @param fecha
	 * @param monto
	 */
	public Transaccion(String id, String tipo, Date fecha, int monto) {
		this.id = id;
		this.tipo = tipo;
		this.fecha = fecha;
		this.monto = monto;
	}
	
	public boolean equals(Object obj){
		if(obj instanceof Transaccion){
			return ((Transaccion)obj).getId()== this.getId();
		}
		return false;
	}
	
}
