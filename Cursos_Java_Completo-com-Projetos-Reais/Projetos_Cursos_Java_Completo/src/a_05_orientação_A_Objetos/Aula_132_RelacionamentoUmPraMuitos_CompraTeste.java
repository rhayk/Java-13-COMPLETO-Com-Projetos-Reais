package a_05_orientação_A_Objetos;

public class Aula_132_RelacionamentoUmPraMuitos_CompraTeste {

	public static void main(String[] args) {
		Aula_132_RelacionamentoUmPraMuitos_Compra compra = new Aula_132_RelacionamentoUmPraMuitos_Compra();
		compra.cliente = "Pedro";
		compra.itens.add(new Aula_132_RelacionamentoUmPraMuitos_Item("caderno", 3, 10.9));
		compra.itens.add(new Aula_132_RelacionamentoUmPraMuitos_Item("caneta", 3, 4.6));

		System.out.println(compra.ObterValorTotal());
		
		
//		double total = compra.itens.get(0).compra.itens.get(1).compra.ObterValorTotal();
//		System.out.println("O total R$ "+total);
	}

}
