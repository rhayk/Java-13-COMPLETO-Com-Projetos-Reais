package a_01_fundamentos;

public class Aula_21_NotacaoPonto {

	public static void main(String[] args) {
		double a = 2.3;
		
		// Nota��o ponto � utilizado sempre no tipo "STRING".
		//M�todos com "s."	no caso do toUpperCase � preciso fazer a convers�o e passar para a variavel	
		String s = "Testando o A";
		s = s.replace("A", "Algortimo");
		s = s.toUpperCase();
		System.out.println(s);
		
		System.out.println("==========================");
		// Usando o nota��o ponto para facilitar a execu��o
		String b = "testando j".replace("j", "c�digo").toUpperCase();
		
		System.out.println(b);
	}

}
