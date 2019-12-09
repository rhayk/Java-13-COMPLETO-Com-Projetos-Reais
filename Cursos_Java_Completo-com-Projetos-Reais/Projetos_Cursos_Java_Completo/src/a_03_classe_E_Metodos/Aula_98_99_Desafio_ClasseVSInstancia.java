package a_03_classe_E_Metodos;

public class Aula_98_99_Desafio_ClasseVSInstancia {

	
	//Criar uma classe que o desconto seja de 25% de desconto para todos os produtos.
	//colocar o desconto como uma variavel de classe "Static".
	//o valor do desconto é de 0.25 de desconto.
	
	String nome;
	double preco;
	
	static double desconto = 1.25; // continuar......
	
	
	Aula_98_99_Desafio_ClasseVSInstancia (String nome, double preco){
		
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}

	double total = 0;
//	this.total = this.preco * this.deconto;

	void descontoo() {
	 if(nome != null && preco != 0) {
		 this.total = preco * desconto;
	 }
	 }

	
	String apresentar(double total) {
		return "O valor total com o desconto: " + nome +" e o preço: "+ total; 
	}

}

