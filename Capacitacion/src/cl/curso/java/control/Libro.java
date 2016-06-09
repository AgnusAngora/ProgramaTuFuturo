package cl.curso.java.control;

/**
 * @author Agnus
 *
 */
public class Libro {
	String tituloDelLibro;
	String autor;
	int numeroDeEjemplares;
	int numeroDeEjemplaresPrestados;

	public Libro() {
		this.tituloDelLibro = "Sin Nombre";
		this.autor = "Desconocido";
		this.numeroDeEjemplares = 0;
		this.numeroDeEjemplaresPrestados = 0;
	}

	public Libro(String tituloDelLibro, String autor, int numeroDeEjemplares, int numeroDeEjemplaresPrestados) {
		this.tituloDelLibro = tituloDelLibro;
		this.autor = autor;
		this.numeroDeEjemplares = numeroDeEjemplares;
		this.numeroDeEjemplaresPrestados = numeroDeEjemplaresPrestados;
	}

	public void prestarLibro() {
		if (this.numeroDeEjemplares > this.numeroDeEjemplaresPrestados) {
			this.numeroDeEjemplaresPrestados++;
		} else {
			System.out.println("No hay libros disponibles.");
		}
	}

	public void devolverLibro() {
		if (this.numeroDeEjemplaresPrestados > 0) {
			this.numeroDeEjemplaresPrestados--;
		} else {
			System.out.println("No hay libros prestados.");
		}
	}

	public void imprimir() {
		System.out.println("El nombre del libro es: " + this.tituloDelLibro + "\n" + "El nombre del autor es: "
				+ this.autor + "\n" + "El número de ejemplares es: " + this.numeroDeEjemplares + "\n"
				+ "El número de ejemplares prestados es: " + this.numeroDeEjemplaresPrestados);
	}
}
