package a_04_arrays_E_Collections;

import java.util.ArrayList;

public class Aulaaa_123_List_Main {

	public static void main(String[] args) {
		
		ArrayList<Aulaaa_123_List_classe> lista  = new ArrayList<>();

		Aulaaa_123_List_classe u1 = new Aulaaa_123_List_classe ("Ana");
		
		lista.add(u1);
		lista.add(new Aulaaa_123_List_classe("Carlos"));
		lista.add(new Aulaaa_123_List_classe("Pedro"));
		lista.add(new Aulaaa_123_List_classe("Daniel"));
		lista.add(new Aulaaa_123_List_classe("Maria"));
		
		//retorna o index escolhido
		System.out.println(lista.get(2));//acessar pelo index
		
		System.out.println(lista.remove(1)); //removendo elemento
		
		for( Aulaaa_123_List_classe u  : lista) {
			System.out.println(u);
		}
		
		
	}

}
