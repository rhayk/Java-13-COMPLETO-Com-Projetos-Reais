package classe_E_Metodos;

public class Aulaa_104_This_This {
	String nome;
	double preco;
	double desconto;
	
	//1� exemplo de contrutor com o this,
	//onde o this chama outro construtor com o m�todo this.
	//restrin��o para usar o m�todo this � usar sempre dentro de um construtor.
	Aulaa_104_This_This(){
	this("notebook", 10, 10);
	}
	
	//Usando this para referencia o objeto atual, usar para resolver conflitos de nomes.
	//A finalidade dos this � ser usado para diferenciar parametros e atributos de instancia
	Aulaa_104_This_This(String nome, double preco, double desconto){
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
		}
	
	Aulaa_104_This_This a = new Aulaa_104_This_This();
	//continuar.............
	
	

}
