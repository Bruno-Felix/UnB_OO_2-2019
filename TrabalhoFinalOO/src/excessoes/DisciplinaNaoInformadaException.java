package excessoes;

import instituicao.*;

public class DisciplinaNaoInformadaException {
			
	public static void DisciplinaNaoInformadaException(Turma turmaCriada, Object[] objArrayDsc )  {

		try {
			
			Turma.atribuirDisciplina(turmaCriada, objArrayDsc);
		}
		catch(ArrayIndexOutOfBoundsException  e){
			
			System.out.println("---------------------");
			System.out.println("# ERRO: Nao existem disciplinas cadastradas para atribui-la a turma.\n");

			System.out.println("#       Por Favor, crie uma Disciplina para atribui-la a Turma.\n");
			
			Disciplina.criarDisciplina();

			Object[] objNovoArrayDisciplinas = Disciplina.listaDisciplina.toArray();
			
			Turma.atribuirDisciplina(turmaCriada, objNovoArrayDisciplinas);
		}
	}
}