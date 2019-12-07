package fundamentos;

import java.util.Scanner;

public class Aula_24_Console {

	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia\n\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Mensage : %d,%d,%d,%d\n",1,2,3,4);
		System.out.printf("Mensage : %.0f%n", 234.567);
		
		
		
		//Usuário inserir entrada no console
	Scanner entrada = new Scanner(System.in);
	System.out.print("Digite seu nome: ");
	String nome = entrada.nextLine();
	
	System.out.print("Digite sua sobrenome: ");
	String sobrenome = entrada.nextLine();
	
	System.out.print("Digite sua idade: ");
	int idade = entrada.nextInt();
	
	
	
	System.out.printf("meu nome é: " + nome.toUpperCase()+ " sobrenome " + sobrenome.toUpperCase()+ " tenho "+idade);
	
	//fechar o scanner para economizar memoria
	entrada.close();
	
	
	}

}
