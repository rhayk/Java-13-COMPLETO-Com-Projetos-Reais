package estruturaDeControle;

import java.util.Scanner;

public class Aula_65_Do_While {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);
	String texto = "";
	//O DO While  sempre a express�o vai executar uma vez, diferente do while.
	do {
		System.out.println("quer sair? "
				+ "utilize as palavras m�gicas");
		texto = entrada.nextLine();
	
	}while(!texto.equalsIgnoreCase("favor"));
	
System.out.println("Obrigado!");
	entrada.close();

	}

}
