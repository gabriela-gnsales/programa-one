package exercicios;

public class MultiplosDeTresAteCem {
	
	public static void main(String[] args) {
		System.out.println("Múltiplos de 3, entre 1 e 100:");
		for(int i = 1; i < 100; i++) {
			if(i % 3 == 0) {
				System.out.println(i);
			}
		}
	}

}
