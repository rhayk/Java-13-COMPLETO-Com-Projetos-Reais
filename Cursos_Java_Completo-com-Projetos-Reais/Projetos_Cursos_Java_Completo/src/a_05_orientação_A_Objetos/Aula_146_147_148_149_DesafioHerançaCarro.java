package a_05_orientação_A_Objetos;

public class Aula_146_147_148_149_DesafioHerançaCarro {
	
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	int delta = 5;
	
	Aula_146_147_148_149_DesafioHerançaCarro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	void acelerar() {
	if(velocidadeAtual + delta > VELOCIDADE_MAXIMA)	{
		velocidadeAtual = VELOCIDADE_MAXIMA;
	}else {
		velocidadeAtual += delta;
	}
	}

void frear() {
	if(velocidadeAtual >= 5) {
		velocidadeAtual -= 5;
	}else {
		velocidadeAtual = 0;
	}
}
public String toString() {
	return "velocidaade atual é" + velocidadeAtual + "e velocidade maxima é " + VELOCIDADE_MAXIMA; 
}
}

