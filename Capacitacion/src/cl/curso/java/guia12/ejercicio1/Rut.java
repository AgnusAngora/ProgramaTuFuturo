package cl.curso.java.guia12.ejercicio1;

public class Rut {

	private String rut;
	/**
	 * constructor
	 */
	public Rut(){
		this.rut = "12345678-9";
	}
	/**
	 * 
	 * @param Rut
	 */
	public Rut(String rut){
		this.rut = rut;
	}
	/**
	 * Getters and Setters
	 */
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
	public void validar() throws RutNoValidoException {
		
		int multiplicador = 2;
		int resultado = 0;
		String rut = this.getRut().split("-")[0];
		String digVer = this.getRut().split("-")[1];
		for(int i = this.rut.length()-1;i>-1;i++){
			resultado = resultado+(Integer.parseInt(""+rut.charAt(i)*multiplicador));
			if(multiplicador == 7){
				multiplicador = 2;
			}else{
			multiplicador++;
			}
		}
		int division;
		division = resultado % 11;
		int resto  = 11 - division;
		if(resto == Integer.parseInt(digVer)){
			System.out.println("El Rut:"+this.getRut()+" es correcto.");
		}else{
			if(resto == 11 && digVer == "0"){
				System.out.println("El Rut:"+this.getRut()+" es correcto.");
			}else{
				if(resto == 10 && digVer == "K"){
					System.out.println("El Rut:"+this.getRut()+" es correcto.");
				}else{
					if(resto != Integer.parseInt(digVer)){
					throw new RutNoValidoException("El Rut: "+this.getRut()+" es incorrecto");
					}
				}
			}
		}
		
		
		
	}
}
