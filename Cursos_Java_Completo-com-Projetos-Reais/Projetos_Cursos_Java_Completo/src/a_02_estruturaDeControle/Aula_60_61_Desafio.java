package a_02_estruturaDeControle;
import java.util.Scanner;
public class Aula_60_61_Desafio {

	//Digitar os numéros de 1 até 7 e imprimir os dias da semana dos respectivos numeros
	//com if e else
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int numero =  entrada.nextInt();
				
		//System.out.println("Digite de 1 até 7, que iria imprimir os respectivos dias da semana");
		System.out.println("================================================");
		if(numero == 1) {
			System.out.println("DOMINGO!");
		}else if(numero == 2) {
			System.out.println("SEGUNDA");
		}else if(numero == 3) {
			System.out.println("TERÇA");
		}else if(numero == 4) {
			System.out.println("QUARTA");
		}else if(numero == 5) {
			System.out.println("QUINTA");
		}else if(numero == 6) {
			System.out.println("SEXTA");
		}else if(numero == 7) {
			System.out.println("SÁBADO");
		}
		System.out.println("================================================");
	}

}
