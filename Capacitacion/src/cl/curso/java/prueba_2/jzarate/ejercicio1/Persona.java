package cl.curso.java.prueba_2.jzarate.ejercicio1;

/**
 * 
 * @author Jesús Antonio Zárate Hernández
 *
 */
public class Persona {
	/**
	 * atributos
	 */
	private String nombre;
	private int edad;
	private String rut;
	private double peso;
	private double altura;
	
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
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	/**
	 * @return the rut
	 */
	public String getRut() {
		return rut;
	}
	/**
	 * @param rut the rut to set
	 */
	public void setRut(String rut) {
		this.rut = rut;
	}
	/**
	 * @return the peso
	 */
	public double getPeso() {
		return peso;
	}
	/**
	 * @param peso the peso to set
	 */
	public void setPeso(double peso) {
		this.peso = peso;
	}
	/**
	 * @return the altura
	 */
	public double getAltura() {
		return altura;
	}
	/**
	 * @param altura the altura to set
	 */
	public void setAltura(double altura) {
		this.altura = altura;
	}
	/**
	 * constructor por default
	 */
	public Persona(){
		this.altura = 0;
		this.edad = 1;
		this.nombre = "Desconocido";
		this.rut = "1-9";
		this.peso = 0;
	}
	/**
	 * constructor que recibe parametros
	 */
	public Persona(double altura, int edad, String nombre, String rut, double peso){
		this.altura = altura;
		this.edad = edad;
		this.nombre = nombre;
		this.rut = rut;
		this.peso = peso;
	}
	/**
	 * Metodos
	 * @return
	 */
	public double calcularIMC(){
		double pesoIdeal = (this.peso/(this.altura*this.altura));
		if(pesoIdeal == -1){
			System.out.println("La persona se encuentra por debajo de su peso ideal.");
		}else{
			if(pesoIdeal == 0){
				System.out.println("La persona se encuentra en su peso ideal.");
			}else{
				if(pesoIdeal == 1){
					System.out.println("La persona se encuentra con sobre peso.");
				}
			}
		}
		return pesoIdeal;
	}
	public boolean esMayorDeEdad(){
		if(this.edad>=18){
			System.out.println("La persona es mayor de edad.");
			return true;
		}else{
			System.out.println("La persona es menor de edad.");
			return false;
		}
	
		
		
	}
}
