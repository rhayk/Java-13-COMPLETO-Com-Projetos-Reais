package estruturaDeControle;

import java.util.Scanner;

public class Aula_54e55_IF {

	public static void main(String[] args) {
		//Bloco de código para definir as condições com IF
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a média: ");
		double media = entrada.nextDouble();
		if(media <= 10 && media >= 7.0) {
			System.out.println("Aprovado");
			System.out.println("Parabéns");
		}
		if(media >= 5.0 && media < 7.0) {
			System.out.println("Recuperação");
			
		}
		
		//Se o bloco do if ficar muito grande é interessante quebrar o bloco em variáveis 
		//para ficar mais simples de ler o código.
		boolean criteriodeReprovacao = media >=4.0 && media < 5.0;
		
		if(criteriodeReprovacao) {
			System.out.println("Reprovado");
		}
		entrada.close();
		
		

	}

}
