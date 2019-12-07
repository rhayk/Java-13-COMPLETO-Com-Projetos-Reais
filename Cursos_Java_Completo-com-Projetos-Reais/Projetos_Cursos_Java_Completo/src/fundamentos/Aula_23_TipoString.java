package fundamentos;

public class Aula_23_TipoString {

	public static void main(String[] args) {
		System.out.println("Ola pessoal".charAt(2));
		String s = "Boa tarde!";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!!!");
		
		//startsWith comparando se o inicio é igual 
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		
		//quantos caracteres tem?
		System.out.println(s.length());
		
		//Equals comparação
		System.out.println(s.contentEquals("Boa tarde!"));
		
		//.substring seleciona os caracteres
		System.out.println("Testando a notação ponto do string".substring(7));		
		System.out.println("Testando a notação ponto do string".substring(3,9));
	}

}
