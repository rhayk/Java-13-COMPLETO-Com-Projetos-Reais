package estruturaDeControle;

import java.util.Scanner;

public class Aula_73_Switch_CaseComBreak {

	public static void main(String[] args) {
	Scanner entrada = new Scanner(System.in);

	
	//switch case com o break, o break vai executar somente a estrutura que foi chamada.
		String conceito = "";
		System.out.println("Informe a nota: ");
		int nota = entrada.nextInt();
		
		
		switch (nota) {
		case 10:
		conceito = "A";
		break;
		case 9:
			conceito = "B";
			break;
		case 8:
			conceito = "C";
			break;
		case 7:
			conceito = "D";
			break;
		case 6:
			conceito = "E";
			break;
		case 5:
			conceito = "F";
			break;
			default:
				conceito = "não encontrado!";
				break;
		}
		System.out.println("Conceito é: "+ conceito);
		entrada.close();
	}

}
