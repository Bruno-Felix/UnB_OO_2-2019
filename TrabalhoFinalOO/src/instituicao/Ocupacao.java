package instituicao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ocupacao {
	
	public Turma turmaDaOcupacao;
	public Sala salaDaOcupacao;
	public Periodos peridoDaOcupacao;
	public static List<Ocupacao> listaDeOcupacoes = new ArrayList<Ocupacao>();

	public static void criarECadastrarOcupacao() {
		
		Ocupacao novaOcupacao = new Ocupacao();
		
		System.out.println("---------------------");
		System.out.println("# Nova Ocupacao Sendo Gerada...");
		
		Object[] objArrayDisciplina = Disciplina.listaDisciplina.toArray();
		
		String auxDisciplina = null;
		try {
			
			auxDisciplina = String.valueOf(JOptionPane.showInputDialog(
				null,"Escolha a Disciplina dessa Ocupação","Escolha",JOptionPane.QUESTION_MESSAGE,
				null,objArrayDisciplina,objArrayDisciplina[0]));
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("---------------------");
			System.out.println("# ERRO: Nao existem disciplinas cadastradas.\n");
			Disciplina.criarDisciplina();
			//Disciplina.criarTurma();
			
			Object[] objNovoArrayDisciplina = Disciplina.listaDisciplina.toArray();
			
			auxDisciplina = String.valueOf(JOptionPane.showInputDialog(
					null,"Escolha a Disciplina dessa Ocupação","Escolha",JOptionPane.QUESTION_MESSAGE,
					null,objNovoArrayDisciplina,objNovoArrayDisciplina[0]));	
		}
		
		for(int aux = 0; aux < Disciplina.listaDisciplina.size(); aux++) {   
			if(Disciplina.listaDisciplina.get(aux).getNomeDisciplina().equalsIgnoreCase(auxDisciplina)) {
				
				Object[] objArrayTurma = Disciplina.listaDisciplina.get(aux).listaTurma.toArray();
				
				String auxTurma = null;
				try {
					
					auxTurma = String.valueOf(JOptionPane.showInputDialog(
							null,"Escolha a Turma, da Disciplina " + Disciplina.listaDisciplina.get(aux).getNomeDisciplina() + " para a Ocupação","Escolha",JOptionPane.QUESTION_MESSAGE,
							null,objArrayTurma,objArrayTurma[0]));
				}
				catch(ArrayIndexOutOfBoundsException e) {
					
					System.out.println("---------------------");
					System.out.println("# ERRO: Nao existem turmas cadastradas na disciplina.\n");
					//Disciplina.criarDisciplina();
					Disciplina.criarTurma();
					
					Object[] objNovoArrayTurma = Disciplina.listaDisciplina.get(aux).listaTurma.toArray();
					
					auxTurma = String.valueOf(JOptionPane.showInputDialog(
							null,"Escolha a Turma, da Disciplina " + Disciplina.listaDisciplina.get(aux).getNomeDisciplina() + " para a Ocupação","Escolha",JOptionPane.QUESTION_MESSAGE,
							null,objNovoArrayTurma,objNovoArrayTurma[0]));	
				}
					
				for(int auxB = 0; auxB < Disciplina.listaDisciplina.get(aux).listaTurma.size(); auxB++) { 
					if(Disciplina.listaDisciplina.get(aux).listaTurma.get(auxB).nomeDaTurma.equalsIgnoreCase(auxTurma)) {
						
						novaOcupacao.turmaDaOcupacao = Disciplina.listaDisciplina.get(aux).listaTurma.get(auxB);
					}
				}
			}
		}
		
		System.out.println("---------------------");
		System.out.println("   Nova Ocupacao Criada: \n" + "   Turma: " + novaOcupacao.turmaDaOcupacao.nomeDaTurma + " Criada!\n");
	}
}
