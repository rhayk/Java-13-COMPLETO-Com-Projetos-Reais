package a_02_estruturaDeControle;

public class Aula_72_SWITCH {

	public static void main(String[] args) {
		
		//switch case sem o break, sem ele executa o restante do código...
		
		String faixa = "preta";
		
		switch (faixa.toLowerCase()) {
		case "preta":
			System.out.println("nivel 7");
		case "marrom":
			System.out.println("nivel 6");
		case "roxa":
			System.out.println("nivel 5");
		case "verde":
			System.out.println("nivel 4");
		case "laranja":
			System.out.println("nivel 3");
		case "vermelha":
			System.out.println("nivel 2");
		case "amarela":
			System.out.println("nivel 1");
		}

	}

}
