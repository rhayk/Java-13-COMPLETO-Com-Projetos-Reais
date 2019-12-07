package arrays_E_Collections;

public class Aulaa_118_119_Equals_e_HashcodeTeste {

	public static void main(String[] args) {
		
		Aulaa_118_119_Equals_e_Hashcode u1 = new Aulaa_118_119_Equals_e_Hashcode();
		u1.nome = "rhayk";
		u1.email = "rhaykvini";
		
		Aulaa_118_119_Equals_e_Hashcode u2 = new Aulaa_118_119_Equals_e_Hashcode();
		u2.nome = "rhayk";
		u2.email = "rhaykvini";
		//Quando o resultado é falso acontece porque a classe "Aulaa_118_119_Equals_e_Hashcode" não sobrescreveu o método equals() da classe Object 
		//a fim de definir uma lógica de comparação entre objetos do tipo Pessoa.
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		
		System.out.println(u1 == u1);
		System.out.println(u1.equals(u1));
	}

}
