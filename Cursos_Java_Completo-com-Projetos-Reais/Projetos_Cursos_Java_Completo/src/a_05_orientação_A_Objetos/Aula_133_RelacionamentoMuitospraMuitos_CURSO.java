package a_05_orientação_A_Objetos;

import java.util.ArrayList;
import java.util.List;

public class Aula_133_RelacionamentoMuitospraMuitos_CURSO {

	final String  nome;
	final List<Aula_133_RelacionamentoMuitospraMuitos_ALUNOS> alunos = new ArrayList<>();
	
	Aula_133_RelacionamentoMuitospraMuitos_CURSO(String nome){
		this.nome = nome;
	}
	void AdicionarAluno(Aula_133_RelacionamentoMuitospraMuitos_ALUNOS aluno){
		this.alunos.add(aluno);
		aluno.cursos.add(this);
	}
}
