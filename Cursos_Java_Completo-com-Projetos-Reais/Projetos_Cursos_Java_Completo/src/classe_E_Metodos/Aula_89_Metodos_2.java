package classe_E_Metodos;

public class Aula_89_Metodos_2 {
	String nome;
	double preco = 100.10;
	double desconto = 0.10;
	
	
	double precoDesconto(){
		return preco * (1 - desconto);
		
		}
	
	double desncotoDoGerente(double desGerente) {
		return preco * (1 - desconto + desGerente);
	
}
	//====================================ClasseTeste====================================
	public static void main(String[] args) {
		
		Aula_89_Metodos_2 resultado = new Aula_89_Metodos_2();
		
		double resultadoFinal = resultado.precoDesconto();
		
		System.out.printf("O resultado é: %f ", resultadoFinal);
	}
}
