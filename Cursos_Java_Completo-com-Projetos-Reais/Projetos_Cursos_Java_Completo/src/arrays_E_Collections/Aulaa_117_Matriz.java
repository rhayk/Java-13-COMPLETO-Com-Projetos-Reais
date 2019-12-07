package arrays_E_Collections;

import java.util.Arrays;
import java.util.Scanner;

public class Aulaa_117_Matriz {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Quantos alunos?");
		int qtdAlunos = entrada.nextInt();
		
		System.out.println("Quantas notas por alunos?");
		int qtdNotas = entrada.nextInt();

		double [][] notas = new double[qtdAlunos][qtdNotas];
		
		double total = 0;
		for(int i = 0; i < notas.length; i++) {
			for (int j = 0; j < notas[i].length; j++) {
				System.out.printf("Informe a nota: %d do aluno: %d ", i + 1, j + 1);
				notas[i][j] = entrada.nextDouble();
				
				total += notas[i][j];
				
			}
		}
	
		double media = total / (qtdAlunos * qtdNotas);
		System.out.println("Média da turme é: "+ media);
		
		for(double[] nota: notas ) {
		System.out.println(Arrays.toString(notas));
		}
		entrada.close();

	}

}
