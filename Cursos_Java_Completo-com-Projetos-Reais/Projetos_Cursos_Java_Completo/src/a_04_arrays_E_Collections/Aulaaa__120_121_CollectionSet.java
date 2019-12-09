package a_04_arrays_E_Collections;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;

public class Aulaaa__120_121_CollectionSet {
// List e Set. Ambos armazenam uma “lista”. A diferença principal 
// é que o 'Set' não aceita elementos duplicados, diferente do List.
	public static void main(String[] args) {
		
		HashSet  conjunto = new HashSet();

		conjunto.add(123); // int -> Interger
		conjunto.add("teste"); 
		conjunto.add(12.4); // double -> Double
		conjunto.add(false);

		System.out.println("Tamanho é: "+ conjunto.size());
		
		conjunto.remove(123);
		System.out.println("Tamanho é: "+ conjunto.size());
		System.out.println("Tamanho é - "+ conjunto.remove(12));
		
		//verificar se tem o elemento
		System.out.println(conjunto.contains("teste"));
		System.out.println(conjunto.contains(true));
		
		System.out.println("===============================");
		
		Set nums = new HashSet();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		System.out.println("===============================");
		//conjunto.addAll(nums); União de dois conjuntos
	  
		conjunto.clear();
		System.out.println(conjunto);
		
	}

}
