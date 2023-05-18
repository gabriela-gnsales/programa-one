
public class TestaCaracteres {
	
	public static void main(String[] args) {
		
		char letra = 'a'; // não pode deixar vazio, dá erro
		System.out.println(letra);
		
		char valor = 66; // no fundo o char é um nº
		System.out.println(valor);
		
//		um char cabe em um inteiro, mas o contrário não
		valor = (char) (valor + 1);
		System.out.println(valor);
		
		String palavra = "alura cursos online de tecnologia";
		System.out.println("palavra: " + palavra);
		
		String stringVazia = " ";
		System.out.println("string vazia: " + stringVazia);
	}
}
