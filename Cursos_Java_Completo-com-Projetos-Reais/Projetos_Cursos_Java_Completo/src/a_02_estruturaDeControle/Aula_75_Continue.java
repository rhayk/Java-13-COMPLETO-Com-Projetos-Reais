package a_02_estruturaDeControle;

public class Aula_75_Continue {

	public static void main(String[] args) {

		//O continue interrompe aquela repetição que foi escolhida para interromper
	externo:	for (int i = 0; i < 10; i++) {
			if (i % 2 == 1) { //interromper números impares
				continue externo;
			}
			System.out.println(i);
		}

	}

}
