package a_02_estruturaDeControle;

import java.util.Scanner;

public class Aula_54e55_IF {

	public static void main(String[] args) {
		//Bloco de c�digo para definir as condi��es com IF
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe a m�dia: ");
		double media = entrada.nextDouble();
		if(media <= 10 && media >= 7.0) {
			System.out.println("Aprovado");
			System.out.println("Parab�ns");
		}
		if(media >= 5.0 && media < 7.0) {
			System.out.println("Recupera��o");
			
		}
		
		//Se o bloco do if ficar muito grande � interessante quebrar o bloco em vari�veis 
		//para ficar mais simples de ler o c�digo.
		boolean criteriodeReprovacao = media >=4.0 && media < 5.0;
		
		if(criteriodeReprovacao) {
			System.out.println("Reprovado");
		}
		entrada.close();
		
		

	}

}
