
public class TestaConversao {
	
	public static void main(String[] args) {
		
//		o Java faz conversão implícita de um tipo menor para os tipos "maiores"
//		quando tentamos colocar um valor inteiro em uma variável do tipo double o Java não mostra erro
//		quando tentamos, porém, colocar um double numa variável do tipo inteiro temos um erro de compilação
		
		double salario = 1250.70;
		int valor = (int) salario; // type casting
		System.out.println(valor);
		
		double valorInt = 3;
		System.out.println(valorInt);
		
		float pontoFlutuante = 3.14f;
		long numeroGrande = 156163851641646846L; // ou 156163851641646846l
		short numeroPequeno = 2131;
		byte b = 127;
		
		
		double valor1 = 0.2;
        double valor2 = 0.1;
        double total = valor1 + valor2;

        System.out.println(total);
		
	}

}
