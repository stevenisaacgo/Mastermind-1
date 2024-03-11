package master_Mind;

public class Combinacion {
	public static final int MIDA = 4;
	private byte[] array_combi;
	
	public Combinacion() {
		array_combi = new byte[MIDA];
	}
	
	public Combinacion(int n) {
		array_combi = new byte[n];
	}
	
	public byte[] getArray_Combi() {
		return array_combi;
	}
	
	public void setArray_Combi(byte[] a) {
		array_combi = a;
	}
	
	public void generaCSecreta(int min, int max) {
		for(int i = 0; i < MIDA; i++) {
			int c = (int)(Math.random() * (max - min + 1)+ min);
			System.out.print(c +" ");
		}

	}
	
	public boolean ComprovarJugada() {
		boolean tmp = false;
		
		return tmp;
	}
}
