package a_03_classe_E_Metodos;

public class Aula_98_99_Desafio_ClasseVSInstanciaa {

	public static void main(String[] args) {
		
		Aula_98_99_Desafio_ClasseVSInstancia a = new Aula_98_99_Desafio_ClasseVSInstancia("notebook", 1000);
		
		Aula_98_99_Desafio_ClasseVSInstancia b = new Aula_98_99_Desafio_ClasseVSInstancia("celular", 200);
//		System.out.println("nome: "+a.nome);
//		System.out.println("valor: "+a.preco);
		
	//	a.descontoo(a.preco);
		
		double total = 0;
		 
		System.out.printf(a.apresentar(total = a.preco * a.desconto));
		System.out.println(" ");
		System.out.printf(b.apresentar(total = b.preco * b.desconto));
		
	//	System.out.printf(a.descontoo(a.preco));
		//a.descontoo(a.preco);
		
	}

}
