package a_02_estruturaDeControle;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Aula_58_59_if_else_if {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
//		String valor = JOptionPane.showInputDialog("Informe o número: ");
//		
//		int numero = Integer.parseInt(valor); //conveter string para numero inteiro
//		
//		
//		
//		 if(numero % 2 == 0) {
//			 System.out.println("Número par");
//			 
//		 } else { 
//			 System.out.println("Búmero impar");
//			 
//		 }
//		 // 
		 System.out.println("==========================================================================");
		
		 System.out.println("======Insira uma nota >= 0.0 e menor que <= 10======");
		double nota = entrada.nextDouble();
		//começa o código com if, e nunca começar começar com else if.
		if(nota > 10 || nota < 0) {
			System.out.println("nota invalida!");
		}else {
			System.out.println("nota valida");
		}
		if(nota <= 10 && nota >= 8) {
			System.out.println("nota (A) ");
		}else  if(nota < 8 && nota >= 6  ) {
			System.out.println("nota (B)");
		}else if(nota < 6 && nota >= 4) {
			System.out.println("nota (C)");
		}else if(nota < 4 && nota > 0) {
			System.out.println("nota (D)");
		}
			
			
			
		
		 
		 
		 
		 entrada.close();
		 

	}

}
