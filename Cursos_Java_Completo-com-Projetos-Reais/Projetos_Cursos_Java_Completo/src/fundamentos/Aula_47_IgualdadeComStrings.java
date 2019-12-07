package fundamentos;

import java.util.Scanner;

public class Aula_47_IgualdadeComStrings {

	public static void main(String[] args) {
		//Usae sempre o "equals", poq o "==" pode alterar o resultado quando instânciar um objeto
		System.out.println("2" == "2");
		
		String s1  = new String("2");
		System.out.println("2" == s1);
		System.out.println("2".equals(s1));
		
		Scanner entrada = new Scanner(System.in);
		
		String s2 = entrada.next();
		System.out.println("2" == s2.trim()); //trim-> tira os espaços"  "
		System.out.println("2".equals(s2)); //O equals compara as strings de um projeto.
		
		entrada.close();
		

	}

}
