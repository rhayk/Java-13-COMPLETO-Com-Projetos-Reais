package a_05_orientação_A_Objetos;

public class Aula_148_GettersESettersPessoaTeste {

	public static void main(String[] args) {
		Aula_148_GettersESettersPessoa p1 = new Aula_148_GettersESettersPessoa(20);
		p1.alterarIdade(-30);//setter
		p1.nome = "pedro";
		System.out.println(p1.lerIdade());//gette
		System.out.println(p1);
	}

}
