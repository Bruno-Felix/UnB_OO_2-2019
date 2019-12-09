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
		System.out.println("# Nova Ocupacao Sendo Gerada...\n");
		
		System.out.println("  1º Passo: Escolher uma Turma para a Ocupacao.\n");
		
		Object[] objArrayDisciplina = Disciplina.listaDisciplina.toArray();
		
		String auxDisciplina = null;
		try {
			
			auxDisciplina = String.valueOf(JOptionPane.showInputDialog(
				null,"Escolha a Disciplina dessa Ocupação","Escolha",JOptionPane.QUESTION_MESSAGE,
				null,objArrayDisciplina,objArrayDisciplina[0]));
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("---------------------");
			System.out.println("# ERRO: Nao existem disciplinas cadastradas, logo não existe turmas cadastradas.\n");
			System.out.println("# Por Favor, crie uma disciplina\n");
			
			Disciplina.criarDisciplina();
			
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
					System.out.println("# ERRO: Nao existem turmas cadastradas na disciplina " + auxDisciplina + ".\n");
					
					System.out.println("# Por Favor, crie uma turma\n");
					//Disciplina.criarDisciplina();
					Disciplina.criarTurma();
					
					Object[] objNovoArrayTurma = Disciplina.listaDisciplina.get(aux).listaTurma.toArray();
					
					auxTurma = String.valueOf(JOptionPane.showInputDialog(
							null,"Escolha a Turma, da Disciplina " + Disciplina.listaDisciplina.get(aux).getNomeDisciplina() + ", para a Ocupação","Escolha",JOptionPane.QUESTION_MESSAGE,
							null,objNovoArrayTurma,objNovoArrayTurma[0]));	
				}
					
				for(int auxB = 0; auxB < Disciplina.listaDisciplina.get(aux).listaTurma.size(); auxB++) { 
					if(Disciplina.listaDisciplina.get(aux).listaTurma.get(auxB).nomeDaTurma.equalsIgnoreCase(auxTurma)) {
						
						novaOcupacao.turmaDaOcupacao = Disciplina.listaDisciplina.get(aux).listaTurma.get(auxB);
					}
				}
			}
		}
		
		System.out.println("---------------------\n");
		System.out.println("     Turma " + novaOcupacao.turmaDaOcupacao.nomeDaTurma + ", da Disciplina " + auxDisciplina + ", Atribuida a Nova Ocupação!\n");
	
		System.out.println("     2º Passo: Escolher uma Sala para a Ocupacao.\n");
		
		
		Object[] objArrayCampus = Campus.listaDeCampus.toArray();
		
		String auxCampus = null;
		try {
			
			auxCampus = String.valueOf(JOptionPane.showInputDialog(
				null,"Escolha o Campus dessa Ocupação","Escolha",JOptionPane.QUESTION_MESSAGE,
				null,objArrayCampus,objArrayCampus[0]));
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("---------------------");
			System.out.println("# ERRO: Nao existem campus cadastrados, logo não existe prédio e salas cadastradas.\n");
			System.out.println("# Por Favor, crie um campus\n");
			
			Campus.criarCampus();
			
			Object[] objNovoArrayCampus = Campus.listaDeCampus.toArray();
			
			auxCampus = String.valueOf(JOptionPane.showInputDialog(
					null,"Escolha o Campus dessa Ocupação","Escolha",JOptionPane.QUESTION_MESSAGE,
					null,objNovoArrayCampus,objNovoArrayCampus[0]));	
		}
		
		String auxPredios = null;
		for(int aux = 0; aux < Campus.listaDeCampus.size(); aux++) {   
			if(Campus.listaDeCampus.get(aux).nomeDoCampus.equalsIgnoreCase(auxCampus)) { 
					
				Object[] objArrayPredios = Campus.listaDeCampus.get(aux).listaDePredios.toArray();
				
				try {
					
					auxPredios = String.valueOf(JOptionPane.showInputDialog(
						null,"Escolha o Prédio, do Campus " + auxCampus + ", para a Ocupação","Escolha",JOptionPane.QUESTION_MESSAGE,
						null,objArrayPredios,objArrayPredios[0]));
				}
				catch(ArrayIndexOutOfBoundsException e) {
					
					System.out.println("---------------------");
					System.out.println("# ERRO: Nao existem predios cadastrados no campus " + auxCampus + ", logo não existe salas cadastradas.\n");
					System.out.println("# Por Favor, crie um campus\n");
					
					Campus.criarPredio();
					
					Object[] objNovoArrayPredios = Campus.listaDeCampus.get(aux).listaDePredios.toArray();
					
					auxPredios = String.valueOf(JOptionPane.showInputDialog(
							null,"Escolha o Prédio, do Campus " + auxCampus + ", para a Ocupação","Escolha",JOptionPane.QUESTION_MESSAGE,
							null,objNovoArrayPredios,objNovoArrayPredios[0]));	
				}
			}
			
			String auxSalas = null;
			for(int auxB = 0; auxB < Campus.listaDeCampus.get(auxB).listaDePredios.size(); auxB++) { 
				if(Campus.listaDeCampus.get(aux).listaDePredios.get(auxB).nomeDaEstrutura.equalsIgnoreCase(auxPredios)) { 
					
					Object[] objArraySalas = Campus.listaDeCampus.get(aux).listaDePredios.get(auxB).listaSala.toArray();
					
					try {
						
						auxSalas = String.valueOf(JOptionPane.showInputDialog(
							null,"Escolha a Sala do Prédio " + auxPredios + ", Campus " + auxCampus + ", para a Ocupação","Escolha",JOptionPane.QUESTION_MESSAGE,
							null,objArraySalas, objArraySalas[0]));
					}
					catch(ArrayIndexOutOfBoundsException e) {
						
						System.out.println("---------------------");
						System.out.println("# ERRO: Nao existem salas cadastradas no predio " + auxPredios + ".\n");
						System.out.println("# Por Favor, crie uma sala\n");
						
						Predio.criarSalaNoPredio();
						
						Object[] objNovoArraySalas = Campus.listaDeCampus.get(aux).listaDePredios.get(auxB).listaSala.toArray();
						
						auxSalas = String.valueOf(JOptionPane.showInputDialog(
								null,"Escolha a Sala do Prédio " + auxPredios + ", Campus " + auxCampus + ", para a Ocupação","Escolha",JOptionPane.QUESTION_MESSAGE,
								null,objNovoArraySalas, objNovoArraySalas[0]));	
					}
					
					for(int auxC = 0; auxC < Campus.listaDeCampus.get(aux).listaDePredios.get(auxB).listaSala.size(); auxC++) { 
						if(Campus.listaDeCampus.get(aux).listaDePredios.get(auxB).listaSala.get(auxC).nomeDaSala.equalsIgnoreCase(auxSalas)) { 
							
							novaOcupacao.salaDaOcupacao = Campus.listaDeCampus.get(aux).listaDePredios.get(auxB).listaSala.get(auxC);
						}
					}
				}
			}
		}
		
		System.out.println("---------------------\n");
		System.out.println("     Sala " + novaOcupacao.salaDaOcupacao.nomeDaSala + ", do Prédio " + auxPredios + ", Campus " + auxCampus + "Atribuida a Nova Ocupação!\n");
	}

	public static void listaDeOcupacoes() {
		// TODO Auto-generated method stub
		
	}
}
