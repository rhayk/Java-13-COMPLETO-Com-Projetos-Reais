package a_03_classe_E_Metodos;

import java.util.Scanner;

public class Aula_90_Desafio_Metodo_DataTeste {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
	
		Aula_90_Desafio_Metodo_Data aa = new Aula_90_Desafio_Metodo_Data(12 , 12, 2012);
		
//		System.out.println("Digite um dia:");
//		int d = entrada.nextInt();
//		
//		System.out.println("Digite um mês:");
//		int m = entrada.nextInt();
//		
//		System.out.println("Digite um ano:");
//		int a = entrada.nextInt();
		
		System.out.println(aa.obterdataFormatada());
		
		entrada.close();
	}

}
