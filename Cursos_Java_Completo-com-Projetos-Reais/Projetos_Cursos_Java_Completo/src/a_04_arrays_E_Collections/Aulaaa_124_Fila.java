package a_04_arrays_E_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class Aulaaa_124_Fila {

	public static void main(String[] args) {
		

		Queue<String> fila = new LinkedList<>();
		
		// Offer e add -> adicionam elementos a fila, a diferença e o comportamento quando a fila está cheia!
	fila.add("Ana");	//O add lança um erro(exceção) quando ultrapassa o tamanho da fila 
	fila.offer("Bia"); // o Offer lança um false quando ultrapassa o tamanho da fila 
	fila.offer("joao");
	fila.offer("maria");
	fila.offer("pedro");
	fila.offer("be");
	
	//peek e elemente -> Obter o proximo elemento da fila sem remover
	//quando a fila estiver vazia!
	System.out.println(fila.peek());//return uma exceção
	System.out.println(fila.peek());
	System.out.println(fila.element()); //return uma exceção
	System.out.println(fila.element());
	
	
	
	//poll e remove -> Obter o proximo elemento da fila e remove
		//quando a fila estiver vazia!
	System.out.println(fila.poll());//return uma exceção
	System.out.println(fila.remove());//return uma exceção
	
	//fila.size();
		//fila.clear();
		//fila.isEmpty();
	//fila.contains();
	}

}
