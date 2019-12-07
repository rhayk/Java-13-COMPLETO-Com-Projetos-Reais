package fundamentos;

public class Aula_27e28_ConversaoDeTiposPrimitivos {

	public static void main(String[] args) {
		
		//Conversão implícita
		double a = 1;
		System.out.println(a);
		
		//conversao explícita "Cast"
		float b = (float)1.82;
		System.out.println(b);
		
		int c = 4;
		byte d = (byte)c; //conversão explícta "Cast"
		System.out.println(d);
	}
}
