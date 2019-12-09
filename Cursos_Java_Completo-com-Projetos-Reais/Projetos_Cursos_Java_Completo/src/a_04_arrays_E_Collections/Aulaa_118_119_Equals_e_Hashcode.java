package a_04_arrays_E_Collections;

public class Aulaa_118_119_Equals_e_Hashcode {

	String nome;
	String email;
	
		
		public boolean equals(Object objeto) {
			
				Aulaa_118_119_Equals_e_Hashcode outro = (Aulaa_118_119_Equals_e_Hashcode) objeto;
		
		boolean nomeigual = outro.nome.equals(this.nome);
		boolean emailigual = outro.email.equals(this.email);
		
		return nomeigual && emailigual;
		//O hashcode vai ser abordado em outra aula!
	}
}
