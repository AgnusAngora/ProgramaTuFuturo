package cl.curso.java.ejercicios.division;

public class Division {

	private int dividendo;
	private int divisor;
	/**
	 * @return the dividendo
	 */
	public int getDividendo() {
		return dividendo;
	}

	/**
	 * @param dividendo the dividendo to set
	 */
	public void setDividendo(int dividendo) {
		this.dividendo = dividendo;
	}

	/**
	 * @return the divisor
	 */
	public int getDivisor() {
		return divisor;
	}

	/**
	 * @param divisor the divisor to set
	 */
	public void setDivisor(int divisor) {
		this.divisor = divisor;
	}


	public Division()
	{
		this.dividendo = 1;
		this.divisor = 1;
	}
	public Division(int dividendo, int divisor)
	{
		this.dividendo = dividendo;
		this.divisor = divisor;
	}
	public double hacerDivision()
	{
		return dividendo/divisor;
	}
}
