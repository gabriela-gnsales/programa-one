
public class TestaValores {
	
	public static void main(String[] args) {
		
		int primeiro = 5;
		int segundo = 7;
		segundo = primeiro;
		primeiro = 10;
		
//		quanto vale o segundo?
//		variáveis de tipos primitivos guardam valores e não referências
		System.out.println(segundo);
	}
}
