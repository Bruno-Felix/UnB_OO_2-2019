package excessoes;

import comunidade.Professor;
import instituicao.Campus;
import instituicao.Turma;

public class ProfessorNaoAtribuidoException {
	
	public static void NaoAtribuidoException(Turma turmaCriada, Object[] objArrayProfessores) {
		
		try {
			
			Turma.atribuirProfessor(turmaCriada, objArrayProfessores);
		}
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("---------------------");
			System.out.println("# ERRO: Não existe professor cadastrados no Campos para atribui-lo a turma.\n");
			
			System.out.println("#       Por Favor, crie um Professor para atribui-lo a Turma.\n");
			
			Campus.criarProfessor();
			
			Object[] objNovoArrayProfessores = Campus.listaDeProfessores.toArray();
			Turma.atribuirProfessor(turmaCriada, objNovoArrayProfessores);
		}
	}
}
