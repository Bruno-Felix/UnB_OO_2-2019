package aplicacao;

import instituicao.*;
import comunidade.*;

public class App {

	public static void main(String[] args) {
		
		Campus.criarCampus();
		Campus.listarCampus();
		Campus.criarPredio();
		Predio.listarPredios();
		Predio.criarSalaNoPredio();
		Sala.listarSalasDeUmPredio();
			
//		Campus.criarProfessorCasoTeste();
//		Aluno.cadastrarAlunoCasoTeste();
//		Disciplina.criarDisciplina();
//		Disciplina.listarDisciplinas();
//		Disciplina.alterarDisciplina();
//		Disciplina.listarDisciplinas();
//		Disciplina.criarTurma();
//		Turma.listarAlunosDaTurma();
//		Turma.listarTurmas();
//		Aluno.listarTurmasDoAluno();
	}
}
