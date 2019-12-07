package fundamentos;

public class Aula_29_ConversaoNumeroString {

	public static void main(String[] args) {
		//conversão de int para string com ".toString"
		Integer num1 = 10000;
		System.out.println(num1.toString());
		
		
		//conversão de int para String com "Integer.toString(parametro)"
		int num2 = 100000;
		System.out.println(Integer.toString(num2));
		
		
		
		System.out.println((""+num1).length());
		System.out.println((""+num2).length());
	}

}
