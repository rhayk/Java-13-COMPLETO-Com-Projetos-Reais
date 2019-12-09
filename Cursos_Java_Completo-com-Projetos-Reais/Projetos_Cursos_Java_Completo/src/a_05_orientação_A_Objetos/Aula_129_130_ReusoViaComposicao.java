package a_05_orientação_A_Objetos;

public class Aula_129_130_ReusoViaComposicao {

//	Primeiramente é necessário entender o que é Composição e o que é Herança. 
//	Composição e Herança são dois mecanismos para reutilizar funcionalidades.
//	A herança sempre foi considerada uma ferramenta 
//	básica de extensão e reuso de funcionalidade e se dá estendendo atributos e métodos de uma classe.
//
//	O diagrama de classe acima seria implementado em Java conforme o código na listagem abaixo
//		Listagem 1: Exemplo de herança de classes em Java.

	
		public class Animal {
		 
		}
		 
		public class Cachorro extends Animal {
		 
		}
		 
		public class Gato extends Animal {
		     
		}
		
//		                 Benefícios e Problemas da Herança
//		Um dos benefícios da Herança é que ela captura o que é comum e o isola daquilo 
//		que é diferente, além disso, a herança é vista diretamente no código até mesmo 
//		devido a sua natureza estática.
//
//		Entre os problemas da Herança está o fraco encapsulamento entre classes e subclasses 
//		e o forte acoplamento entre elas onde ao mudar uma superclasse pode afetar todas as 
//		subclasses além de violar o princípio básico de projeto OO em que devemos ter sempre 
//		um baixo acoplamento entre as classes. Além disso, algumas vezes um objeto precisa ser 
//		de uma classe diferente em momentos diferentes o que não é possível com a herança, pois 
//		o código não pode sofrer alterações facilmente em tempo de execução, portanto tem-se que 
//		a herança é um relacionamento estático
}
