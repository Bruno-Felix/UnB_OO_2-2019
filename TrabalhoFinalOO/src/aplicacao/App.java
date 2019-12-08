package aplicacao;

import instituicao.*;
import comunidade.*;

public class App {

	public static void main(String[] args) {
		
		//Campus.criarCampus();
		//Campus.listarCampus();
		//Campus.criarPredio();
		//Predio.listarPredios();
		//Predio.criarSalaNoPredio();
		//Sala.listarSalasDeUmPredio();
			
		//Sala.cadastrarSala();
		//Campus.criarProfessorCasoTeste();
		Aluno.cadastrarAlunoCasoTeste();
		Disciplina.criarDisciplina();
		Disciplina.listarDisciplinas();
		//Disciplina.alterarDisciplina();
		//Disciplina.listarDisciplinas();
		Disciplina.criarTurma();
		//Turma.listarAlunosDaTurma();
		Turma.listarTurmas();
		Aluno.listarTurmasDoAluno();
		
		//Professor p1 = new Professor("Andre", 30, 789456);
		//Campus.cadastrarProfessoeEmCampus(p1);
		//Campus.listarProfessoresCampus();
		//Aluno a1 = new Aluno("Luiz", 21, "18/012454", 0);
		//Campus.cadastrarAlunoEmCampus(a1);
		//Campus.listarAlunosCampus();
	}
}
