package cl.curso.java.ejercicios.superheroes;

/**
 * @author Agnus
 *
 */
public class Superman extends SuperHeroe{

	public void recibirAtaque(Arma arma)
	{
		if(arma instanceof Criptonita)
		{
			System.out.println("Muere.");
		}
		else
		{
			System.out.println("Sobrevive.");
		}
	}
}
