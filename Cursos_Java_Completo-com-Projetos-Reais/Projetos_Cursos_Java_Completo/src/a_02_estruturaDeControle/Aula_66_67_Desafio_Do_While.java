package a_02_estruturaDeControle;
import java.util.Scanner;

public class Aula_66_67_Desafio_Do_While {
    //Desafio: calcular m�dia de notas de uma turma
	//usu�rio vai digitar uma  nota de > 0 e < 10 que ser�o as notas validas
	//assim que o usu�rio digitar uma nota acrescentar em total.
	//fazendo que total armazene a soma de todas as notas
	//usar uma variavel para contar quantas notas validas o usu�rio digitou
	// imprimindo: total, quantidade de nota valida e a media
	//e pra sair o usu�rio tem que digitar -1
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Inserir nota do aluno sendo maior que 0 e menor que 10: ");
		double nota = entrada.nextDouble();
	
		while(nota > 0 && nota < 10 ) {
		double total = nota;
		 System.out.println(total);
		}
		

		entrada.close();

	}

}
