package a_05_orientação_A_Objetos;

public class Aula_155_Comida {

	private double peso;
	
	public Aula_155_Comida(double peso) {
		setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}
	}
}
