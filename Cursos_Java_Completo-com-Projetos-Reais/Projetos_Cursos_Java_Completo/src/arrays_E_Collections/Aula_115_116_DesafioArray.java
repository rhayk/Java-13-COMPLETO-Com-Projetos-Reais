package arrays_E_Collections;

import java.util.Scanner;
//Desafio calcular a média dos alunos.
	//O programa  vai apresentar quantas
	//notas voçe quer informar,
	//o usuário digita o valor de nota
	//Com o valor de nota inserido, fazer um array.
	//Fazer dois laço for: No primeiro armazenar as notas for tradicional, digite a no 1......
	//No segundo pecorrer o array com foreach somar as notas na varivel soma
	//apresentar a media no final.
public class Aula_115_116_DesafioArray {

	   // static double nota;
	    double total;
//	    
//	  public Aula_115_116_DesafioArray(double nota, double total){
//		this.nota = nota;
//		this.total = total;
//	}
//	  
	public static void main(String[] args) {
 
  Scanner entrada = new Scanner(System.in);
 
int nota = 0;
    System.out.print("Digite quantas notas você quer: ");
    nota =  entrada.nextInt();
    		
  int [] notas = new int[nota];
  
    double valor = 0;
    double valorr = 0;
	for(int i = 0; i < notas.length; i++) {
			System.out.println("Insira uma nota: ");
			valor = entrada.nextDouble();
			valorr += valor;
		}
	System.out.printf("soma das notas é igual :%.1f", valorr);
	
    for(double total: notas) {
     total = nota / valorr;
    	System.out.printf("Media: %f", total );
    }
	
	entrada.close();
	
}
}
