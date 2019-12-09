package a_04_arrays_E_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Aulaaa_124_Fila {

	public static void main(String[] args) {
		

		Queue<String> fila = new LinkedList<>();
		
		// Offer e add -> adicionam elementos a fila, a diferen�a e o comportamento quando a fila est� cheia!
	fila.add("Ana");	//O add lan�a um erro(exce��o) quando ultrapassa o tamanho da fila 
	fila.offer("Bia"); // o Offer lan�a um false quando ultrapassa o tamanho da fila 
	fila.offer("joao");
	fila.offer("maria");
	fila.offer("pedro");
	fila.offer("be");
	
	//peek e elemente -> Obter o proximo elemento da fila sem remover
	//quando a fila estiver vazia!
	System.out.println(fila.peek());//return uma exce��o
	System.out.println(fila.peek());
	System.out.println(fila.element()); //return uma exce��o
	System.out.println(fila.element());
	
	
	
	//poll e remove -> Obter o proximo elemento da fila e remove
		//quando a fila estiver vazia!
	System.out.println(fila.poll());//return uma exce��o
	System.out.println(fila.remove());//return uma exce��o
	
	//fila.size();
		//fila.clear();
		//fila.isEmpty();
	//fila.contains();
	}

}
