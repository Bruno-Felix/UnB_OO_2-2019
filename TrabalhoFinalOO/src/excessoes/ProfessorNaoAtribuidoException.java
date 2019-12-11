package excessoes;

import instituicao.Campus;
import instituicao.Turma;
import comunidade.*;
public class ProfessorNaoAtribuidoException {
	
	public static void NaoAtribuidoException(Turma turmaCriada, Object[] objArrayProfessores) {
		
		try {
			
			Turma.atribuirProfessor(turmaCriada, objArrayProfessores);
		}
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("---------------------");
			System.out.println("# ERRO: Não existe professor cadastrados no Campos para atribui-lo a turma.\n");
			
			System.out.println("# Por Favor, crie um Professor para atribui-lo a Turma.\n");
			
			Campus.criarProfessor();
			
			Object[] objNovoArrayProfessores = Campus.listaDeProfessores.toArray();
			try{
				Turma.atribuirProfessor(turmaCriada, objNovoArrayProfessores);
			}
			catch(NullPointerException n) {
				System.out.println("---------------------");
				System.out.println("# ERRO: Nome do professor nao informado, por favor, insira-o.\n");
				Campus.criarProfessor();
			}
		}
		
	}
}
