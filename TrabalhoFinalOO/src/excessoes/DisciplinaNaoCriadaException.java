package excessoes;
import instituicao.*;
public class DisciplinaNaoCriadaException {
	public static void DisciplinaNCriadaException() {
		try {
			Disciplina.criarTurma();
		}
		catch(ArrayIndexOutOfBoundsException  e) {
			System.out.println("---------------------");
			System.out.println("# ERRO: Nao existe uma Disciplina cadastrada para atribuir a essa Turma.\n");

			System.out.println("# Por Favor, crie uma Disciplina para atribui-la a Turma.\n");
			Disciplina.criarDisciplina();
			Disciplina.criarTurma();
		}
	}
}
