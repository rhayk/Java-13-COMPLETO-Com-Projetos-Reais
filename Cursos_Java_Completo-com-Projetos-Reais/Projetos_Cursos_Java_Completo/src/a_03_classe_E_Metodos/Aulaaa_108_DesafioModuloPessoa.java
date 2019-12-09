package a_03_classe_E_Metodos;
//Desafio do modulo:
// Criar 3 classes sendo: pessoa, comida e jantar.
//A classe jantar vai ter o metodo main, onde vai ser instanciado pessoa e comida, fazer a pessoa comer a comida.
//A pessoa vai ter nome, peso e um metodo comer e esse metodo vai receber outro objto da classe comida.
//A classe comida vai ter o nome da comida e o peso da comida
//Quando passa o objeto comida para um metodo comer dentro da pessoa, pegar o peso da comida e acrescentar no peso da pessoa.
//quando chamar o metodo comer dentro da classe comida o peso da comida vai passar para o peso da pessoa
//na classe jantar colocar o metodo main e isntanciar os objetos das classes pessoa e comida.
public class Aulaaa_108_DesafioModuloPessoa {
	
	public String nome;
	public double peso;
	
	Aulaaa_108_DesafioModuloPessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
			}
		
	void comer(Aulaa_108_DesafioModuloComida comida) {
		if(nome != null) {
			this.peso += comida.peso;
		}
		
	}
	
	String apresentar() {
		return "Olá sou o " + nome + " e peso: " + peso +" Klg.";
	}
	
	
}
	
	



	
	
