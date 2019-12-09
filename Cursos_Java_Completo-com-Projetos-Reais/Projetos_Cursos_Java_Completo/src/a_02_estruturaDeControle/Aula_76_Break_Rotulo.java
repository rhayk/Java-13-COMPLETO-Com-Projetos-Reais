package a_02_estruturaDeControle;

public class Aula_76_Break_Rotulo {

	public static void main(String[] args) {
		
		//Inserindo rotulo para o break definir qual laço vai ser executado/utilizado.
		externo: for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (i == 1) {
					break externo;
				}
				System.out.printf("%d %d", i,j);
			}
			System.out.println();
		}

	System.out.println("Fim!");
	}

}
