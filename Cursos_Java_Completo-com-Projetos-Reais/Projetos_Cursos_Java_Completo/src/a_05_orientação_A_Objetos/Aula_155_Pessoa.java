package a_05_orientação_A_Objetos;

public class Aula_155_Pessoa {

	private double peso;
	
	public Aula_155_Pessoa(double peso) {
		setPeso(peso);
	}
	public void comer (Aula_155_Arroz arroz) {
		this.peso += arroz.getPeso();
	}
	
	public void comer (Aula_155_Feijao feijao) {
		this.peso += feijao.getPeso();
	}
	
	public void comer ( Aula_155_Sorvete sorvete) {
		this.peso += sorvete.getPeso();
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if(peso >= 0) {
			this.peso = peso;
		}
		this.peso = peso;
	}
}
