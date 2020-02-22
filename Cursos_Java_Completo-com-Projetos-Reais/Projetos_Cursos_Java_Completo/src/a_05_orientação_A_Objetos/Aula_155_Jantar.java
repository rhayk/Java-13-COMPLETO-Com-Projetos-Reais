package a_05_orientação_A_Objetos;

public class Aula_155_Jantar {

	public static void main(String[] args) {
		Aula_155_Pessoa convidado = new Aula_155_Pessoa(99.65);
		
		Aula_155_Arroz ingrediente2 = new Aula_155_Arroz(0.2);
		Aula_155_Feijao ingrediente1 = new Aula_155_Feijao(0.1);		
	
		System.out.println(convidado.getPeso());
		
		convidado.comer(ingrediente1);
		convidado.comer(ingrediente2);
		System.out.println("=================================");
		System.out.println(convidado.getPeso());
		System.out.println("=================================");
		Aula_155_Sorvete ingrendiente3 = new Aula_155_Sorvete(0.15);
	convidado.comer(ingrendiente3);
	System.out.println(convidado.getPeso());
	}

}
