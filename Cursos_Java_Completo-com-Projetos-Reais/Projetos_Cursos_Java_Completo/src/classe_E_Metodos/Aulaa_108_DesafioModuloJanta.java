package classe_E_Metodos;

public class Aulaa_108_DesafioModuloJanta {

	public static void main(String[] args) {
		
		Aulaaa_108_DesafioModuloPessoa pessoa1 = new Aulaaa_108_DesafioModuloPessoa("Rhayk", 70.9);		
		Aulaa_108_DesafioModuloComida comida1 = new Aulaa_108_DesafioModuloComida("Arroz", 0.200);
	
		pessoa1.comer(comida1);
		
		System.out.println(pessoa1.apresentar());
		pessoa1.comer(comida1);
		
		
	}

}
