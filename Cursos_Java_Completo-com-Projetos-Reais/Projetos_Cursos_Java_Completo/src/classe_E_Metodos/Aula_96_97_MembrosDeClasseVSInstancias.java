package classe_E_Metodos;

public class Aula_96_97_MembrosDeClasseVSInstancias {


//Quando inserir o "Static" em atributos não é necessário instancia o objeto que refencia o atributo
	// o static tem a função de fazer com que o atributo pertença a classe.
		
		double raio;
		static double pi = 3.1415;
		
		Aula_96_97_MembrosDeClasseVSInstancias (double raio){
			this.raio = raio;
		}
		double area() {
			return pi * Math.pow(raio, 2);
		}
		
		public static void main(String[] args) {
Aula_96_97_MembrosDeClasseVSInstancias a1 = new Aula_96_97_MembrosDeClasseVSInstancias(10);
Aula_96_97_MembrosDeClasseVSInstancias a2 = new Aula_96_97_MembrosDeClasseVSInstancias(5);
		
Aula_96_97_MembrosDeClasseVSInstancias.pi = 3.1415;

System.out.println(a1.area());

Aula_96_97_MembrosDeClasseVSInstancias.pi = 0.1;
System.out.println(a2.area());
		
		
		
		
		}
		
	
		
	
	

}
