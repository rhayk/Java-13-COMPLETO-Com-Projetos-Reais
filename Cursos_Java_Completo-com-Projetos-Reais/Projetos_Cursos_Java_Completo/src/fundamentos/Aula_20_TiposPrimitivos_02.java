package fundamentos;

public class Aula_20_TiposPrimitivos_02 {

	public static void main(String[] args) {
		
		//Informações de funcionários
		
		//Tipos númericos
		byte anosdeEmpresa = 127;
		short numeroDeVoos = 542;
		int id = 56345;
		long  pontosAcumulados = 3_134_244_116l;
		
		
		//Tipos númericos reais
		float salario = 11_445.44F;
		double VendasAcumuladas = 2_991_797_103.01;
		
		//Tipos booleano
		boolean estaDeFerias = false; //true
		
		
		//Tipo caractere
		char status = 'a'; //ativo
		
		//Dias de empresa
		System.out.println(anosdeEmpresa * 365);
		
		//Numeros de viagens
		System.out.println(numeroDeVoos / 2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / VendasAcumuladas);
		
		System.out.println(id + ": ganha -> " + salario);
		System.out.println("Férias "+ estaDeFerias);
		System.out.println("Status: " + status);

	}

}
