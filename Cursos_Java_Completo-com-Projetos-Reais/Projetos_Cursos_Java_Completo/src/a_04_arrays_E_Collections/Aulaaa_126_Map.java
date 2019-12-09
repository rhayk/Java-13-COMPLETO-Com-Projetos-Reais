package a_04_arrays_E_Collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Aulaaa_126_Map {

	public static void main(String[] args) {
		
		Map<Integer, String> usuarios = new HashMap<>();
		//adicionar usando "put"
		usuarios.put(190, "João");
		usuarios.put(189, "Maria");
		usuarios.put(100, "Bia");
		
		
		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());//verificar se elemento....False  ou verdadeiro
		
		System.out.println(usuarios.keySet()); //imprimi todas as chaves...
		System.out.println(usuarios.values()); //Imprimi todos os valores...
		System.out.println(usuarios.entrySet());//imprimi todas as chaves e valores...
		
		System.out.println(usuarios.containsKey(100)); //verifica se contém a chave 100...
		System.out.println(usuarios.containsValue("Bia")); //verifica se tem o valor Bia...
		
		System.out.println(usuarios.get(190)); //retorna o valor da chave
		System.out.println(usuarios.remove(189)); //removendo elementos
		
		for( int chave: usuarios.keySet()) { //retorna so as chaves
			System.out.println(chave);
		}
		
		System.out.println("===========");
		
		for(String valor: usuarios.values()) {//retorna so valores
			System.out.println(valor);
		}
	
		for(Entry<Integer, String> registro: usuarios.entrySet()) {
			
			System.out.print(registro.getKey() + " "); //imprimi valor e chave juntos....
			System.out.println(registro.getValue());
			
			
		}
	}

}
