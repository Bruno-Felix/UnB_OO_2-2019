package excessoes;

import comunidade.Professor;
import instituicao.Turma;

public class ProfessorNaoAtribuidoException {
	
	public static void ProfessorNaoAtribuidoException(Professor professorCriado, Turma turmaCriada) {
		
		try {
			Turma.atribuirProfessor(professorCriado, turmaCriada);
		}
		catch(NullPointerException e){
			System.out.println("Nome Professor Nulo");
		}
	}
}
