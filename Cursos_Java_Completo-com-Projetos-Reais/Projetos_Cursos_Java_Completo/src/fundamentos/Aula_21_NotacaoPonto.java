package fundamentos;

public class Aula_21_NotacaoPonto {

	public static void main(String[] args) {
		double a = 2.3;
		
		// Notação ponto é utilizado sempre no tipo "STRING".
		//Métodos com "s."	no caso do toUpperCase é preciso fazer a conversão e passar para a variavel	
		String s = "Testando o A";
		s = s.replace("A", "Algortimo");
		s = s.toUpperCase();
		System.out.println(s);
		
		System.out.println("==========================");
		// Usando o notação ponto para facilitar a execução
		String b = "testando j".replace("j", "código").toUpperCase();
		
		System.out.println(b);
	}

}
