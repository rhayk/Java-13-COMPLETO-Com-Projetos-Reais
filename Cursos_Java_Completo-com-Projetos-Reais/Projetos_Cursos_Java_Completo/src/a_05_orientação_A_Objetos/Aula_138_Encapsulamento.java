package a_05_orientação_A_Objetos;

public class Aula_138_Encapsulamento {

	//Encapsulamento vem de encapsular, que em programação orientada a objetos 
	//significa separar o programa em partes, o mais isolado possível. A idéia 
	//é tornar o software mais flexível, fácil de modificar e de criar novas implementações. 
	//O Encapsulamento serve para controlar o acesso aos atributos e métodos de uma classe. 
	//É uma forma eficiente de proteger os dados manipulados dentro da classe, além de determinar 
	//onde esta classe poderá ser manipulada. Usamos o nível de acesso mais restritivo, private, 
	//que faça sentido para um membro particular. Sempre usamos private, a menos que tenhamos um 
	//bom motivo para deixá-lo com outro nível de acesso. Não devemos permitir o acesso público 
	//aos membros, exceto em caso de ser constantes. Isso porque membros públicos tendem a nos ligar 
	//a uma implementação em particular e limita a nossa flexibilidade em mudar o código. 
	//O encapsulamento que é dividido em dois níveis:

		//Nível de classe: Quando determinamos o acesso de uma classe inteira que pode ser public 
	//ou Package-Private (padrão);
		//Nível de membro: Quando determinamos o acesso de atributos ou métodos de uma classe
	//que podem ser public, private, protected ou Package-Private (padrão).
	
	// private -> Acesso só dentro da classe.
	//Package(padrão) -> acesso dentro do pacote,ou seja, as classes queestão dentro do mesmo pacote pode ter acesso uma a outra.
	//protected -> classes de um pacote pode ter acesso a classe de outro pacote através de herança.
	//Public -> acesso geral.
	
}
