package a_05_orientação_A_Objetos;

public class Aula_142_143_Enum_JOGO {
 
	public static void main(String[] args) {
		
		
		//A classe jogador pode ser extendida ex: (heroi, monstro) e retornar naa classe jogo.
		Aula_142_143_Enum_Heroi jogador = new Aula_142_143_Enum_Heroi();
		
		jogador.x = 10;
		jogador.y = 10;
		//A classe jogador pode ser extendida ex: (heroi, monstro) e retornar naa classe jogo.
		Aula_142_143_Enum_Monstro jogador1 = new Aula_142_143_Enum_Monstro();
		
		jogador1.x = 10;
		jogador1.y = 11;
		
	Aula_142_143_Enum_JOGADOR jogador2 = new Aula_142_143_Enum_JOGADOR();
		
		jogador.x = 20;
		jogador.y = 20;
		
		Aula_142_143_Enum_JOGADOR jogador3 = new Aula_142_143_Enum_JOGADOR();
		
		jogador1.x = 20;
		jogador1.y = 21;
		
		System.out.println(jogador.vida);
		System.out.println(jogador1.vida);
		
		jogador.atacar(jogador1);
		jogador1.atacar(jogador);
		System.out.println("Ataque");
		System.out.println(jogador.vida);
		System.out.println(jogador1.vida);
		

	}
}
