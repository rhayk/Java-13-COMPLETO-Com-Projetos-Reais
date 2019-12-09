package a_05_orienta��o_A_Objetos;

public class Aula_138_Encapsulamento {

	//Encapsulamento vem de encapsular, que em programa��o orientada a objetos 
	//significa separar o programa em partes, o mais isolado poss�vel. A id�ia 
	//� tornar o software mais flex�vel, f�cil de modificar e de criar novas implementa��es. 
	//O Encapsulamento serve para controlar o acesso aos atributos e m�todos de uma classe. 
	//� uma forma eficiente de proteger os dados manipulados dentro da classe, al�m de determinar 
	//onde esta classe poder� ser manipulada. Usamos o n�vel de acesso mais restritivo, private, 
	//que fa�a sentido para um membro particular. Sempre usamos private, a menos que tenhamos um 
	//bom motivo para deix�-lo com outro n�vel de acesso. N�o devemos permitir o acesso p�blico 
	//aos membros, exceto em caso de ser constantes. Isso porque membros p�blicos tendem a nos ligar 
	//a uma implementa��o em particular e limita a nossa flexibilidade em mudar o c�digo. 
	//O encapsulamento que � dividido em dois n�veis:

		//N�vel de classe: Quando determinamos o acesso de uma classe inteira que pode ser public 
	//ou Package-Private (padr�o);
		//N�vel de membro: Quando determinamos o acesso de atributos ou m�todos de uma classe
	//que podem ser public, private, protected ou Package-Private (padr�o).
	
	// private -> Acesso s� dentro da classe.
	//Package(padr�o) -> acesso dentro do pacote,ou seja, as classes queest�o dentro do mesmo pacote pode ter acesso uma a outra.
	//protected -> classes de um pacote pode ter acesso a classe de outro pacote atrav�s de heran�a.
	//Public -> acesso geral.
	
}
