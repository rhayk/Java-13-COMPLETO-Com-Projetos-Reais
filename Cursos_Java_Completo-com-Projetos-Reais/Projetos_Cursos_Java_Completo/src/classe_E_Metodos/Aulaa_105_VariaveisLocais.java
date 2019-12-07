package classe_E_Metodos;

public class Aulaa_105_VariaveisLocais {

	

	    public static void main(String args[]){
	        int res = soma(4,5);
	    }

	    public static int soma(int num1, int num2){
	        int resultado = num1 + num2; //resultado e sua variavel local
	        return resultado; // aqui voce esta despachando o valor de resultado pra fora do seu metodo para quem o chamar...
	    } 
	
//	a outra forma que vejo, e setando o teu valor local em uma variavel de instancia, porem sem muito PORQUE fazer isso…

//	public class Aulaa_105_VariaveisLocais {
//
//	    public static int resClass;
//
//	    public static void main(String args[]){
//	        int res = soma(4,5);
//	    }
//
//	    public static void soma(int num1, int num2){
//	        int resultado = num1 + num2; //resultado e sua variavel local
//	        resClass =  resultado; // aqui voce esta despachando o valor de resultado pra fora do seu metodo somente copiando o valor para uma variavel de instancia da classe...
//	    } 
	}


