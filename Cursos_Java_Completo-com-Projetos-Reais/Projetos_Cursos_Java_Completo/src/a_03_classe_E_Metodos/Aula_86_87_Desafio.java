package a_03_classe_E_Metodos;

public class Aula_86_87_Desafio {
	//Desafio - > criar a classe data com 3 atributos (dia, mes e ano)
	//Instaciar o dia o mes e o ano na classe teste.
	
	public int dia;
	public int mes;
	public int ano;

	Aula_86_87_Desafio(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String apresentar() {
		return "O dia é: "+ dia + " do mes "+mes + " do ano "+ ano;
	}
}
