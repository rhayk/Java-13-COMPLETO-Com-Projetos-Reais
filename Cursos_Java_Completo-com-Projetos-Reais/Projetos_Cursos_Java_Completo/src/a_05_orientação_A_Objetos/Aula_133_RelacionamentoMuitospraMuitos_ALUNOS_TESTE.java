package a_05_orientação_A_Objetos;

public class Aula_133_RelacionamentoMuitospraMuitos_ALUNOS_TESTE {

	public static void main(String[] args) {
		Aula_133_RelacionamentoMuitospraMuitos_ALUNOS aluno = new Aula_133_RelacionamentoMuitospraMuitos_ALUNOS("Joao");
		Aula_133_RelacionamentoMuitospraMuitos_ALUNOS aluno1 = new Aula_133_RelacionamentoMuitospraMuitos_ALUNOS("Maria");
		Aula_133_RelacionamentoMuitospraMuitos_ALUNOS aluno2 = new Aula_133_RelacionamentoMuitospraMuitos_ALUNOS("Pedro");
		
		Aula_133_RelacionamentoMuitospraMuitos_CURSO curso = new Aula_133_RelacionamentoMuitospraMuitos_CURSO("Java");
		Aula_133_RelacionamentoMuitospraMuitos_CURSO curso1 = new Aula_133_RelacionamentoMuitospraMuitos_CURSO("Web");
		Aula_133_RelacionamentoMuitospraMuitos_CURSO curso2 = new Aula_133_RelacionamentoMuitospraMuitos_CURSO("React");
		

		curso.AdicionarAluno(aluno1);
		curso1.AdicionarAluno(aluno2);
		
		
		curso2.AdicionarAluno(aluno);
		curso2.AdicionarAluno(aluno2);
		
		aluno.AdicionarCurso(curso1);
		aluno1.AdicionarCurso(curso1);
		aluno2.AdicionarCurso(curso1);
		
		for(Aula_133_RelacionamentoMuitospraMuitos_ALUNOS alunoo: curso.alunos) {
			System.out.println("Estou matriculado no " + curso.nome);
			System.out.println(".... e meu nome é " + aluno.nome);
			System.out.println();
		}
		
		System.out.println(aluno2.cursos.get(0).alunos);
		
		System.out.println("========");
		Aula_133_RelacionamentoMuitospraMuitos_CURSO cursoEncontrado =	aluno1.ObterCursoPorNome("Java");
		if(cursoEncontrado != null) {
		System.out.println(cursoEncontrado.alunos);
		}
	}

}
