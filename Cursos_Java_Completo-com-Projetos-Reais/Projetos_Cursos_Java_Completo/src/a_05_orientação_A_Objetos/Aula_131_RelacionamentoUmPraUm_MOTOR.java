package a_05_orientação_A_Objetos;

public class Aula_131_RelacionamentoUmPraUm_MOTOR {
	boolean ligado;
	double FatorInjecao = 1;
	
	int giros() {
		if(!ligado) {
			return 0;
		}else
			return (int) Math.round(FatorInjecao * 3000);
	}
	

}
