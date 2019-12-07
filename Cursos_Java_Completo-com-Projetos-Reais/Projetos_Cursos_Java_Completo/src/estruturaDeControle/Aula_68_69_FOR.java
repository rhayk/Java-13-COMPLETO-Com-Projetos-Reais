package estruturaDeControle;

public class Aula_68_69_FOR {

	public static void main(String[] args) {
		
		//for decrementando de 2 em 2
//		int contador = 10; //Essa é a estrutura para usar a variavel na classe toda, o contador tem que ficar fora do laço.
//		for(; contador >= 0; contador -=2 ) {
//			System.out.println("Resultado: "+ contador);
//		}
		
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 10; j++) {
				System.out.printf("[%d%d] \n", i, j);
			}
			System.out.println("Quebra de linha");
		}

	}

}
