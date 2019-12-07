package estruturaDeControle;
import java.util.*;
public class Aula_64_While_Indeterminado {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		String valor = " ";
		//while indeterminante 
		while(!valor.equalsIgnoreCase("sair")) {
			System.out.println("Você diz: ");
			valor = entrada.nextLine();
		}
		
		entrada.close();

	}

}
