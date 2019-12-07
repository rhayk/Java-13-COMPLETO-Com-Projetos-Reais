package classe_E_Metodos;



public class Aula_85_Class_E_Produto_Teste {

	public static void main(String[] args) {
	

		Aula_85_Class_E_Produto p1 = new Aula_85_Class_E_Produto();
		p1.nome = "notebook";
		p1.preco = 1950;
		p1.desconto = 0.10;
		
		Aula_85_Class_E_Produto p2 = new Aula_85_Class_E_Produto();
		p2.nome = "tv";
		p2.preco = 2010;
		p2.desconto = 0.19;
		
		System.out.printf("%s\n",p1.nome);
		System.out.printf("%f\n",p1.preco);
		System.out.printf("Desconto de %.2f porcento \n", p1.desconto);
		double mediaFinal = p1.preco * (1 - p1.desconto);
		
		System.out.printf("Média final é igual a: %f", mediaFinal);
	}

}
