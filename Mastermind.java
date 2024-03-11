package master_Mind;

public class Mastermind {
	private int numJugadas;
	private Combinacion secreta;
	private Combinacion jugada;
	//private Combinacion jugada = new Combinacion();
	
	public Mastermind() {
		numJugadas = 0;
		secreta = new Combinacion();
		jugada = new Combinacion();
				
	}
	
	public void iniciarJuego() {
			secreta.generaCSecreta(2, 8);
			byte[] a = secreta.getArray_Combi();
	}
	
	public void funcion() {
		iniciarJuego();
	}
	
	public void pedirJugada() {
		
	}

}
