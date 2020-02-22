package a_05_orientação_A_Objetos;

public class Aula_146_147_148_149_DesafioHerançaCarroTeste {

	public static void main(String[] args) {
		Aula_146_147_148_149_DesafioHerançaCivic c1 = new Aula_146_147_148_149_DesafioHerançaCivic();
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		c1.acelerar();
		System.out.println(c1);
		
		Aula_146_147_148_149_DesafioHerançaCarro c2 = new Aula_146_147_148_149_DesafioHerançaFerrari();
		c2.acelerar();
		c2.frear();
		System.out.println(c2);
		
		c2.acelerar();
		System.out.println(c2);
	}

}
