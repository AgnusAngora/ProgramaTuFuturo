package cl.curso.java.guia12b;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author Agnus
 *
 */
public class CarroDeCompra {

	private Usuario usuario;
	private List<Producto> productos;

	/**
	 * @return the usuario
	 */
	public Usuario getUsuario() {
		return usuario;
	}

	/**
	 * @param usuario
	 *            the usuario to set
	 */
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	/**
	 * @return the productos
	 */
	public List<Producto> getProductos() {
		return productos;
	}

	/**
	 * @param productos
	 *            the productos to set
	 */
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}

	public CarroDeCompra() {
		this.usuario = null;
		this.productos = null;
	}

	/**
	 * @param usuario
	 * @param productos
	 */
	public CarroDeCompra(Usuario usuario, List<Producto> productos) {
		this.usuario = usuario;
		this.productos = productos;
	}

	public void agregarProducto(Producto productoNuevo) {
		this.getProductos().add(productoNuevo);
		System.out.println("Se a agregado " + productoNuevo + " en el carrito.");
	}

	public void eliminarProducto(Producto productoEliminado) {
		int limite = Collections.frequency(this.getProductos(), productoEliminado);
		int contador = 0;
		while (this.getProductos().contains(productoEliminado) && contador < limite) {
			this.getProductos().remove(productoEliminado);
			contador++;
		}
	}

	public void ordenarPorPrecio() {
		Collections.sort(this.getProductos(), new Comparator<Producto>() {

			@Override
			public int compare(Producto o1, Producto o2) {
				if (o1.getPrecio() == o2.getPrecio())
					return 0;
				if (o1.getPrecio() > o2.getPrecio())
					return 1;
				return -1;
			}
		});
	}

	public int costoTotal(){
		int suma=0;
		for(int i=0; i<this.getProductos().size();i++){
			suma = suma + this.getProductos().get(i).getPrecio();
		}
		return suma;
	}
	public void imprimir() {
		System.out.println(this.getProductos());
	}

}
