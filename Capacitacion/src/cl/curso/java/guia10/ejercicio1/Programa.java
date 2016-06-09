package cl.curso.java.guia10.ejercicio1;

public class Programa {

	public static void main(String args[]) {
		Cuadrado cuadrado = new Cuadrado(90);
		System.out.println(cuadrado.calcularArea());
		cuadrado.dibujar();
		System.out.println("");
		
		Triangulo triangulo = new Triangulo(30,60);
		System.out.println(triangulo.calcularArea());
		triangulo.dibujar();
		System.out.println("");
		
		Circulo circulo = new Circulo(60);
		System.out.println(circulo.calcularArea());
		circulo.dibujar();
	}
}
