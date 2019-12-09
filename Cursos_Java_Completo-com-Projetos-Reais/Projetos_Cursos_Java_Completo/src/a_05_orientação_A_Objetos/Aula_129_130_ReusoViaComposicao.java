package a_05_orienta��o_A_Objetos;

public class Aula_129_130_ReusoViaComposicao {

//	Primeiramente � necess�rio entender o que � Composi��o e o que � Heran�a. 
//	Composi��o e Heran�a s�o dois mecanismos para reutilizar funcionalidades.
//	A heran�a sempre foi considerada uma ferramenta 
//	b�sica de extens�o e reuso de funcionalidade e se d� estendendo atributos e m�todos de uma classe.
//
//	O diagrama de classe acima seria implementado em Java conforme o c�digo na listagem abaixo
//		Listagem 1: Exemplo de heran�a de classes em Java.

	
		public class Animal {
		 
		}
		 
		public class Cachorro extends Animal {
		 
		}
		 
		public class Gato extends Animal {
		     
		}
		
//		                 Benef�cios e Problemas da Heran�a
//		Um dos benef�cios da Heran�a � que ela captura o que � comum e o isola daquilo 
//		que � diferente, al�m disso, a heran�a � vista diretamente no c�digo at� mesmo 
//		devido a sua natureza est�tica.
//
//		Entre os problemas da Heran�a est� o fraco encapsulamento entre classes e subclasses 
//		e o forte acoplamento entre elas onde ao mudar uma superclasse pode afetar todas as 
//		subclasses al�m de violar o princ�pio b�sico de projeto OO em que devemos ter sempre 
//		um baixo acoplamento entre as classes. Al�m disso, algumas vezes um objeto precisa ser 
//		de uma classe diferente em momentos diferentes o que n�o � poss�vel com a heran�a, pois 
//		o c�digo n�o pode sofrer altera��es facilmente em tempo de execu��o, portanto tem-se que 
//		a heran�a � um relacionamento est�tico
}
