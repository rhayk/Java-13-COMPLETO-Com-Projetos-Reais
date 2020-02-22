package a_05_orientação_A_Objetos;

public class Aula_148_GettersESettersPessoa {

	public int idade;
	public String nome;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Aula_148_GettersESettersPessoa(int idade) {
		this.idade = idade;
	}
		
	public int lerIdade() { //gette
		return idade;
	}
	
	public void alterarIdade(int novaIdade) { //setter
	if(novaIdade >= 0 && novaIdade <= 100) {
		this.idade = novaIdade;		
	}
	}
	@Override
	public String toString() {
		return "Olá eu sou o " + getNome() +" "+ "e minha idade é: "+ idade + " anos";
	
	}
}
