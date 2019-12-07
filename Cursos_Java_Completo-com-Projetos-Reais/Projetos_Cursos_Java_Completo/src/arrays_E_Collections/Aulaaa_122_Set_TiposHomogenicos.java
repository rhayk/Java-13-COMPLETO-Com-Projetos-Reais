package arrays_E_Collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Aulaaa_122_Set_TiposHomogenicos {

	public static void main(String[] args) {
		

		Set<String> lista =  new HashSet<>();
		
		lista.add("a");
		lista.add("t");
		lista.add("b");
		lista.add("Maria");
		for(String conjunto: lista) {
			System.out.println(conjunto);
		}
		
		//TreeSet -> Ordenação dos elementos
		Set<Integer> nums =  new TreeSet<>();
		nums.add(26);
		nums.add(3);
		nums.add(55);
		nums.add(67);
		
		//Atentar nos tipos e nomes de referencia
		for(Integer nu: nums ) {
			System.out.println(nu);
		}
		
	}

}
