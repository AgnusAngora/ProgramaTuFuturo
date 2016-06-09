/**
 * 
 */
package cl.curso.java.ejemplos.colecciones.ejercicio1;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Agnus
 *
 */
public class Telefono {

	private ArrayList<Contacto> contactos;

	/**
	 * @return the contactos
	 */
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}

	/**
	 * @param contactos
	 *            the contactos to set
	 */
	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	/**
	 * @param contactos
	 */
	public Telefono(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}

	/**
	 * 
	 */
	public Telefono() {
		// TODO Auto-generated constructor stub
	}

	public void imprimirFor() {
		for (int i = 0; i < contactos.size(); i++) {
			System.out.println(contactos.get(i));
		}
	}

	public void imprimirForEach() {
		for (Contacto contactos : contactos) {
			System.out.println(contactos);
		}
	}

	public void imprimirIterador(){
		Iterator<Contacto> iterador = contactos.iterator();
		while(iterador.hasNext()){
			System.out.println(iterador.next());
		}
	}
}
