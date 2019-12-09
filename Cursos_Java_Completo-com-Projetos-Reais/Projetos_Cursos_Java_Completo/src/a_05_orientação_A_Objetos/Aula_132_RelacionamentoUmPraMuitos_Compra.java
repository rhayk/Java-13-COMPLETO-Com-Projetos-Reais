package a_05_orientação_A_Objetos;

import java.util.ArrayList;

public class Aula_132_RelacionamentoUmPraMuitos_Compra {

	String cliente;
	ArrayList<Aula_132_RelacionamentoUmPraMuitos_Item> itens = new ArrayList<Aula_132_RelacionamentoUmPraMuitos_Item>();
	
	double ObterValorTotal() {
		double total = 0;
		for(Aula_132_RelacionamentoUmPraMuitos_Item item: itens) {
			total +=  item.quantidade * item.preco;
		}
		
		return total;
	}
	
}
