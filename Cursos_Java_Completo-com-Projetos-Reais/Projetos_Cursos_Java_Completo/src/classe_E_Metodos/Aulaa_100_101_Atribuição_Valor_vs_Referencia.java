package classe_E_Metodos;

public class Aulaa_100_101_Atribuição_Valor_vs_Referencia {
	//o valor e atribuido por tipos primitivos. ex: --> int a = 2;
	//O valor por referencia é atribuido pelos objetos. ex:  d2 = new Data();   d2.dia = 4;
	
	public static void main(String[] args) {
		//atribuição por valor (Tipo primitivo)
		double a = 2;
		double b = a; 
		a++;
		b--;
		System.out.println(a+ " " +b);
		
		System.out.println("=========================================================");
		//valor atribuido por referencia (Objeto)
		Aula_92_93_Construtor d1  = new Aula_92_93_Construtor("Notebook", 2000, 200);
		
		d1.nome = "Celular";
		d1.preco = 1500;
		d1.desconto = 100;
		
		System.out.println("nome: "+ d1.nome +" \npreço: "+ d1.preco +" \ndesconto: "+ d1.desconto);
		
		
	}

}
