package a_05_orientação_A_Objetos;

import java.util.ArrayList;
import java.util.List;

public class Aula_133_RelacionamentoMuitospraMuitos_ALUNOS {

	final String nome;
	final List<Aula_133_RelacionamentoMuitospraMuitos_CURSO> cursos = new ArrayList<>();

	Aula_133_RelacionamentoMuitospraMuitos_ALUNOS(String nome){
		this.nome = nome;
	}
	
	void AdicionarCurso(Aula_133_RelacionamentoMuitospraMuitos_CURSO curso){
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	Aula_133_RelacionamentoMuitospraMuitos_CURSO ObterCursoPorNome(String nome) {
//		Aula_133_RelacionamentoMuitospraMuitos_CURSO procurado = null;
		for(Aula_133_RelacionamentoMuitospraMuitos_CURSO curso: this.cursos) {
			if(curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
		
		
		return null;
	}
	
	
	public String toString() { //colocar o public por causa de herança
		
		return nome;
	}
	
	
}
