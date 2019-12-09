package a_01_fundamentos;

public class Aula_26_Wrappers {

	public static void main(String[] args) {

		// Os tipos primitivos possuem suas classes correspondentes de ajuda.
		// Utiizamos essas classes para fazer wrapping(embrulho) com os tipos
		// primitivos.
		// Mas para que serve isso? Imagine que voc� quer usar um valor de uma
		// [b]int[/b]
		// em um metodo especifico. Porem esse metodo recebe como argumento apenas
		// um objeto. E agora? Agora voc� faz um [b]wrapping[/b], ou seja voc� vai
		// "embrulhar" seu valor primitivo em sua classe e instanciar o objeto.
		// Pronto agora voc� criou um objeto com seu valor primitivo.
		Byte b = 100;
		Short s = 1000;
		Integer i = 10000;
		Long l = 10000L;

		System.out.println(b.byteValue());

		System.out.println(s.toString());
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 127.5645566;
		System.out.println(d);

		// convers�o de um tipo boolean para uma string
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase()); // convers�o de boolean para string com "toString"

		Character c = '#'; // char
		System.out.println(c + "...");
	}

}
