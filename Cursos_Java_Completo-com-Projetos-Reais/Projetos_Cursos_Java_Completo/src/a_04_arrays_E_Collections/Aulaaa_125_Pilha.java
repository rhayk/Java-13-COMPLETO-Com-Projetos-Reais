package a_04_arrays_E_Collections;


import java.util.ArrayDeque;
import java.util.Deque;

public class Aulaaa_125_Pilha {

	public static void main(String[] args) {
		Deque<String> livros = new ArrayDeque<String>(); {
			livros.add("O pequeno Princípe");
			livros.push("Don Quixote");
			livros.push("O Hobbit");
			
			System.out.println(livros.peek());
			System.out.println(livros.element());
			
			for(String teste: livros) {
				System.out.println(teste);
			}
			
//			System.out.println(livros.poll());
//			
//			System.out.println(livros);
//			
//			System.out.println(livros.remove());
//			System.out.println(livros);
//			
//			System.out.println(livros.size());
			//livros.size();
			//livros.clear();
			//livros.contains(o);
			//livros.isEmpty();
			
		}

	}

}