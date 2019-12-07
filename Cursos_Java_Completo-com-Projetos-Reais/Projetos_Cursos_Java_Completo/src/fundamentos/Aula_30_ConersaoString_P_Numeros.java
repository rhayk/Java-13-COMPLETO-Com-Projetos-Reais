package fundamentos;

import javax.swing.JOptionPane;

public class Aula_30_ConersaoString_P_Numeros {

	public static void main(String[] args) {
		String valor1 = JOptionPane.showInputDialog("Digite o primeiro n�mero");
		String valor2 = JOptionPane.showInputDialog("Digite o primeiro n�mero");
	
			System.out.println(valor1 + valor2);
			
			//M�todo parseDouble () duplo em Java com exemplos
			//O m�todo parseDouble () da classe Java Double � um m�todo interno em Java 
			//que retorna um novo duplo inicializado para o valor representado pela 
			//String especificada, conforme feito pelo m�todo valueOf da classe Double .
			//Sintaxe:  public est�tico double parseDouble (String s)
			
			double numero1 = Double.parseDouble(valor1);
			double numero2 = Double.parseDouble(valor2);
			
			double soma = numero1 + numero2;
			System.out.println("Soma � "+ soma);
			System.out.println("M�dia � "+ soma / 2);
	}

}
