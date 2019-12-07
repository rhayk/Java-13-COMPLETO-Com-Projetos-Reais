package classe_E_Metodos;

public class Aula_92_93_Construtor {
	//O construtor tem a finalidade de criar instancias de objetos dentro de uma classe.
	//Geralmente a classe forne o construtor padrão implicitamente
	//Quando criamos um construtor explicitamente o construtor padrão é perdido.
//	Restrinções de contrutores:
//		1. Nome da classe -> sendo o nome do contrutor.
//		2. contutor não tem retorno;
//		3. As assinaturas dos contrures da classe deve ser diferente da assinatura do outro construtor.
	
	String nome;
	double preco;
	double desconto;
	//construtores com parametros 
	Aula_92_93_Construtor(String nome, double preco, double desconto){
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		
	}
	
	double precoDesconto(){
		return preco * (1 - desconto);
		
		}
	
	double desncotoDoGerente(double desGerente) {
		return preco * (1 - desconto + desGerente);
	
}
	//====================================ClasseTeste====================================
	public static void main(String[] args) {
		//intancia definindo os atributos
		Aula_92_93_Construtor resultado = new Aula_92_93_Construtor("tv", 20.9, 0.90);
		
		System.out.println(resultado.nome);
		System.out.println(resultado.preco);
		System.out.println(resultado.desconto);
	}

}
