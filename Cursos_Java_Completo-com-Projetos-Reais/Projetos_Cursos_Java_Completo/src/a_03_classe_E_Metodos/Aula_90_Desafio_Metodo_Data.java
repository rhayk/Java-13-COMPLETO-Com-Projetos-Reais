package a_03_classe_E_Metodos;

public class Aula_90_Desafio_Metodo_Data {
	//Desafio retorna dia, mes e ano formatado na classe data do outro desafio.

	int dia;
	int mes;
	int ano;
	
	Aula_90_Desafio_Metodo_Data(int dia,int mes,int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	String obterdataFormatada() { //definir o tipo de retorno......void ^^
	return dia+"/"+mes +"/"+ano ;	
	}
}
