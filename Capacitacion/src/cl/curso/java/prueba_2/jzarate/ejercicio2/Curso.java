package cl.curso.java.prueba_2.jzarate.ejercicio2;
/**
 * 
 * @author Jesús Antonio Zárate Hernández
 *
 */
public class Curso implements Imprimir {
	/**
	 * atributos
	 */
	private String nombre;
	private Alumno[] alumno;
	/**
	 * Getters and Setters
	 */
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the alumno
	 */
	public Alumno[] getAlumno() {
		return alumno;
	}
	/**
	 * @param alumno the alumno to set
	 */
	public void setAlumno(Alumno[] alumno) {
		this.alumno = alumno;
	}
	/**
	 * constructor default
	 */
	public Curso(){
		this.nombre = "1ro A";
		this.alumno = alumno;
	}
	/**
	 * @param nombre
	 * @param alumno
	 */
	public Curso(String nombre, Alumno[] alumno) {
		this.nombre = nombre;
		this.alumno = alumno;
	}
	/**
	 * metodos
	 */
	public double calcularPromedioCurso(){
		double auxiliar = 0;
		for(int i = 0;i<=this.alumno.length-1;i++){
			auxiliar = auxiliar + this.alumno[i].getPromedio();
		}
		return auxiliar/this.alumno.length;
	}
	public double obtenerMejorPromedio(){
		double mayor = 0;
		String nombre = "Desconocido";
		for (int i = 0; i<=this.alumno.length-1;i++){
			if(mayor<this.alumno[i].getPromedio()){
				mayor = alumno[i].getPromedio();
				nombre = alumno[i].getNombre();
			}
		}
		return mayor;
	}
	public void imprimir(){
		System.out.println(this.nombre);
		for(int i = 0; i<=this.alumno.length-1;i++){
			this.alumno[i].imprimir();
		}
		System.out.println("El promedio mas alto es: "+obtenerMejorPromedio());
	}	
}
