package a_05_orientação_A_Objetos;

public class Aula_131_RelacionamentoUmPraUm_CARROTeste {

	public static void main(String[] args) {
		
		Aula_131_RelacionamentoUmPraUm_CARRO carro = new Aula_131_RelacionamentoUmPraUm_CARRO();
		
		
		System.out.println(carro.estaLigado());
		carro.ligar();
		System.out.println(carro.estaLigado());
		//System.out.println(carro.motor.giros());
		
//		carro.acelerar();
//		carro.acelerar();
//		carro.acelerar();
//		carro.acelerar();
//		carro.acelerar();
//		carro.acelerar();
//		carro.acelerar();
		carro.acelerar();
		carro.acelerar();
		//System.out.println(carro.motor.giros());
		
//		carro.frear();
//		carro.frear();
//		carro.frear();
//		carro.frear();
//		carro.frear();
//		carro.frear();
		carro.frear();
		carro.frear();
		carro.frear();
		
		
		//faltou o encapsulamento!!
		//carro.motor.FatorInjecao = -30;
		System.out.println(carro.motor.giros());
	}

}
