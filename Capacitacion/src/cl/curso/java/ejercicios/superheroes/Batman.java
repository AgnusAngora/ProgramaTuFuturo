package cl.curso.java.ejercicios.superheroes;
/**
 * 
 * @author Agnus
 *
 */
public class Batman extends SuperHeroe{

	public void recibirAtaque(Arma arma)
	{
		if(arma instanceof Criptonita)
		{
			System.out.println("Sobrevive.");
		}
		else
		{
			System.out.println("Muere.");
		}
	}
}
