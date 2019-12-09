package a_05_orientação_A_Objetos;

public class Aula_131_RelacionamentoUmPraUm_CARRO {

	
		
		Aula_131_RelacionamentoUmPraUm_MOTOR motor = new Aula_131_RelacionamentoUmPraUm_MOTOR();
		
		void acelerar() {
			if(motor.FatorInjecao < 2.6) {
			motor.FatorInjecao += 0.4;
			}
		}

		void frear() {
			if(motor.FatorInjecao > 1) {
			motor.FatorInjecao -= 0.4;
			}
		}
		
		void ligar() {
			motor.ligado = true;
		}
		
		void desligar() {
			motor.ligado = false;
		}
		
		boolean estaLigado() {
			return motor.ligado;
		}

}
