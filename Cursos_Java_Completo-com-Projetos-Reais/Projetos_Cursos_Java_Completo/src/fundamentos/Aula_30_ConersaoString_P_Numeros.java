package fundamentos;

import javax.swing.JOptionPane;

public class Aula_30_ConersaoString_P_Numeros {

	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro número");
		String valor2 = JOptionPane.showInputDialog("Digite o primeiro número");
	
			System.out.println(valor1 + valor2);
			
			//Método parseDouble () duplo em Java com exemplos
			//O método parseDouble () da classe Java Double é um método interno em Java 
			//que retorna um novo duplo inicializado para o valor representado pela 
			//String especificada, conforme feito pelo método valueOf da classe Double .
			//Sintaxe:  public estático double parseDouble (String s)
			
			double numero1 = Double.parseDouble(valor1);
			double numero2 = Double.parseDouble(valor2);
			
			double soma = numero1 + numero2;
			System.out.println("Soma é "+ soma);
			System.out.println("Média é "+ soma / 2);
	}

}
