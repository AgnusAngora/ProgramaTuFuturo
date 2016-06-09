package cl.curso.java.ejemplos;

public class Alumno {

	private String nombreAlumno;
	private int nota1;
	private int nota2;
	private int nota3;

	public Alumno() {
		this.nombreAlumno = "Jesús";
		this.nota1 = 70;
		this.nota2 = 70;
		this.nota3 = 70;
	}

	public Alumno(String nombreAlumno, int nota1, int nota2, int nota3) {
		this.nombreAlumno = nombreAlumno;
		this.nota1 = nota1;
		this.nota2 = nota2;
		this.nota3 = nota3;

	}

	public String getNombreAlumno() {
		return nombreAlumno;
	}

	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}

	public int getNota1() {
		return nota1;
	}

	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}

	public int getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

	public int getNota3() {
		return nota3;
	}

	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}

	public int promedio() {
		return (this.nota1 + this.nota2 + this.nota3) / 3;
	}
}
