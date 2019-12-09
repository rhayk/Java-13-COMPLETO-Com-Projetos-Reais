package a_02_estruturaDeControle;

public class Aula_74_Break {

	public static void main(String[] args) {
		//Usando break com o laço de repetição for. Ele vai sair da execução assim que chegar no break.
		for (int i = 0; i < 10; i++) {
			
			if (i == 5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("Fim!");
	}

}
