package instituicao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Ocupacao {
	
	public Turma turmaDaOcupacao;
	public Sala salaDaOcupacao;
	public Periodos periodoDaOcupacao;
	public static List<Ocupacao> listaDeOcupacoes = new ArrayList<Ocupacao>();
	
	public static Object[] dias = {"Segunda", "Terca","Quarta","Quinta","Sexta","Sabado"};
	public static String [] horas = {"00","1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23"};
	public static String [] minutos;

	public static void criarECadastrarOcupacao() {
		
		Ocupacao novaOcupacao = new Ocupacao();
		
		System.out.println("---------------------");
		System.out.println("\n      # Nova Ocupacao Sendo Gerada...\n");
		System.out.println("		1º Passo: Escolher um Perído para a Ocupacao.\n");
		
		System.out.println("		Perído para a Ocupacao Sendo Escolhido...\n");
		String auxDiaPeriodo = String.valueOf(JOptionPane.showInputDialog(null, "Escolha o Dia da Semana dessa Ocupação?", "Escolha",
				JOptionPane.QUESTION_MESSAGE, null, dias, dias[0]));
		
		if(auxDiaPeriodo.equalsIgnoreCase("Segunda")) {
			
			if (Periodos.listaSegunda.size() == 0) {
				System.out.println("---------------------");
				System.out.println("#		ERRO: Nao existem periodos cadastrados na Segunda.\n");
				System.out.println("#       Por Favor, crie um período\n");
				
				Periodos.cadastrarPeriodos();
				criarECadastrarOcupacao();
			}
			else {
				
				Object[] objArrayPeriodos = Periodos.listaSegunda.toArray();
				for(int i = 0; i < objArrayPeriodos.length; i++) {
					objArrayPeriodos[i] = objArrayPeriodos[i] + " : " + Periodos.listaSegunda.get(i).minutosInicio + " - " + Periodos.listaSegunda.get(i).horaTermino + " : " + Periodos.listaSegunda.get(i).minutosTermino;
				}
				String auxPeriodo = String.valueOf(JOptionPane.showInputDialog(
						null,"Escolha o Periodo dessa Ocupação","Escolha",JOptionPane.QUESTION_MESSAGE,
						null,objArrayPeriodos,objArrayPeriodos[0]));
				
				for(int auxB = 0; auxB < Periodos.listaSegunda.size(); auxB++) {
					if(Periodos.listaSegunda.get(auxB).horaInicio.equalsIgnoreCase(auxPeriodo.substring(0,1))) {
						
						novaOcupacao.periodoDaOcupacao = Periodos.listaSegunda.get(auxB);
						
						System.out.println("---------------------\n");
						System.out.println("		" + novaOcupacao.periodoDaOcupacao.diaDaSemana + " da Semana Atribuida a Nova Ocupação!\n");
						System.out.println("   		Periodo " + novaOcupacao.periodoDaOcupacao.horaInicio + ":" +
														   novaOcupacao.periodoDaOcupacao.minutosInicio + " - " +	
														   novaOcupacao.periodoDaOcupacao.horaTermino + ":" +
														   novaOcupacao.periodoDaOcupacao.minutosTermino +
														   ", na " + novaOcupacao.periodoDaOcupacao.diaDaSemana + " Atribuida a Nova Ocupação!\n");
					}
				}
			}
		}
		else if(auxDiaPeriodo.equalsIgnoreCase("Terca")) {
			
			if (Periodos.listaTerca.size() == 0) {
				System.out.println("---------------------");
				System.out.println("#		ERRO: Nao existem periodos cadastrados na Terca.\n");
				System.out.println("#       Por Favor, crie um período\n");
				
				Periodos.cadastrarPeriodos();
				criarECadastrarOcupacao();
			}
			else {
				
				Object[] objArrayPeriodos = Periodos.listaTerca.toArray();
				for(int i = 0; i < objArrayPeriodos.length; i++) {
					objArrayPeriodos[i] = objArrayPeriodos[i] + " : " + Periodos.listaTerca.get(i).minutosInicio + " - " + Periodos.listaTerca.get(i).horaTermino + " : " + Periodos.listaTerca.get(i).minutosTermino;
				}
				String auxPeriodo = String.valueOf(JOptionPane.showInputDialog(
						null,"Escolha o Dia da Semana dessa Ocupação","Escolha",JOptionPane.QUESTION_MESSAGE,
						null,objArrayPeriodos,objArrayPeriodos[0]));
				
				for(int auxB = 0; auxB < Periodos.listaTerca.size(); auxB++) {
					if(Periodos.listaTerca.get(auxB).horaInicio.equalsIgnoreCase(auxPeriodo)) {
						
						novaOcupacao.periodoDaOcupacao = Periodos.listaTerca.get(auxB);
						
						System.out.println("---------------------\n");
						System.out.println("   " + novaOcupacao.periodoDaOcupacao.diaDaSemana + " da Semana Atribuida a Nova Ocupação!\n");
						System.out.println("   Periodo " + novaOcupacao.periodoDaOcupacao.horaInicio + ":" +
														   novaOcupacao.periodoDaOcupacao.minutosInicio + " - " +	
														   novaOcupacao.periodoDaOcupacao.horaTermino + ":" +
														   novaOcupacao.periodoDaOcupacao.minutosTermino +
														   ", na " + novaOcupacao.periodoDaOcupacao.diaDaSemana + " Atribuida a Nova Ocupação!\n");
					}
				}
			}
		}
		else if(auxDiaPeriodo.equalsIgnoreCase("Quarta")) {
			
			if (Periodos.listaQuarta.size() == 0) {
				System.out.println("---------------------");
				System.out.println("#		ERRO: Nao existem periodos cadastrados na Quarta.\n");
				System.out.println("#       Por Favor, crie um período\n");
				
				Periodos.cadastrarPeriodos();
				criarECadastrarOcupacao();
			}
			else {
				
				Object[] objArrayPeriodos = Periodos.listaQuarta.toArray();
				for(int i = 0; i < objArrayPeriodos.length; i++) {
					objArrayPeriodos[i] = objArrayPeriodos[i] + " : " + Periodos.listaQuarta.get(i).minutosInicio + " - " + Periodos.listaQuarta.get(i).horaTermino + " : " + Periodos.listaQuarta.get(i).minutosTermino;
				}
				String auxPeriodo = String.valueOf(JOptionPane.showInputDialog(
						null,"Escolha o Dia da Semana dessa Ocupação","Escolha",JOptionPane.QUESTION_MESSAGE,
						null,objArrayPeriodos,objArrayPeriodos[0]));
				
				for(int auxB = 0; auxB < Periodos.listaQuarta.size(); auxB++) {
					if(Periodos.listaQuarta.get(auxB).horaInicio.equalsIgnoreCase(auxPeriodo)) {
						
						novaOcupacao.periodoDaOcupacao = Periodos.listaQuarta.get(auxB);
						
						System.out.println("---------------------\n");
						System.out.println("   " + novaOcupacao.periodoDaOcupacao.diaDaSemana + " da Semana Atribuida a Nova Ocupação!\n");
						System.out.println("   Periodo " + novaOcupacao.periodoDaOcupacao.horaInicio + ":" +
														   novaOcupacao.periodoDaOcupacao.minutosInicio + " - " +	
														   novaOcupacao.periodoDaOcupacao.horaTermino + ":" +
														   novaOcupacao.periodoDaOcupacao.minutosTermino +
														   ", na " + novaOcupacao.periodoDaOcupacao.diaDaSemana + " Atribuida a Nova Ocupação!\n");
					}
				}
			}
		}
		else if(auxDiaPeriodo.equalsIgnoreCase("Quinta")) {
			
			if (Periodos.listaQuinta.size() == 0) {
				System.out.println("---------------------");
				System.out.println("#		ERRO: Nao existem periodos cadastrados na Quinta.\n");
				System.out.println("#       Por Favor, crie um período\n");
				
				Periodos.cadastrarPeriodos();
				criarECadastrarOcupacao();
			}
			else {
				
				Object[] objArrayPeriodos = Periodos.listaQuinta.toArray();
				for(int i = 0; i < objArrayPeriodos.length; i++) {
					objArrayPeriodos[i] = objArrayPeriodos[i] + " : " + Periodos.listaQuinta.get(i).minutosInicio + " - " + Periodos.listaQuinta.get(i).horaTermino + " : " + Periodos.listaQuinta.get(i).minutosTermino;
				}
				String auxPeriodo = String.valueOf(JOptionPane.showInputDialog(
						null,"Escolha o Dia da Semana dessa Ocupação","Escolha",JOptionPane.QUESTION_MESSAGE,
						null,objArrayPeriodos,objArrayPeriodos[0]));
				
				for(int auxB = 0; auxB < Periodos.listaQuinta.size(); auxB++) {
					if(Periodos.listaQuinta.get(auxB).horaInicio.equalsIgnoreCase(auxPeriodo.substring(0,1))) {
						
						novaOcupacao.periodoDaOcupacao = Periodos.listaQuinta.get(auxB);
						
						System.out.println("---------------------\n");
						System.out.println("   " + novaOcupacao.periodoDaOcupacao.diaDaSemana + " da Semana Atribuida a Nova Ocupação!\n");
						System.out.println("   Periodo " + novaOcupacao.periodoDaOcupacao.horaInicio + ":" +
														   novaOcupacao.periodoDaOcupacao.minutosInicio + " - " +	
														   novaOcupacao.periodoDaOcupacao.horaTermino + ":" +
														   novaOcupacao.periodoDaOcupacao.minutosTermino +
														   ", na " + novaOcupacao.periodoDaOcupacao.diaDaSemana + " Atribuida a Nova Ocupação!\n");
					}
				}
			}
		}
		else if(auxDiaPeriodo.equalsIgnoreCase("Sexta")) {
			
			if (Periodos.listaSexta.size() == 0) {
				System.out.println("---------------------");
				System.out.println("#		ERRO: Nao existem periodos cadastrados na Sexta.\n");
				System.out.println("#       Por Favor, crie um período\n");
				
				Periodos.cadastrarPeriodos();
				criarECadastrarOcupacao();
			}	
			else {
				
				Object[] objArrayPeriodos = Periodos.listaSexta.toArray();
				for(int i = 0; i < objArrayPeriodos.length; i++) {
					objArrayPeriodos[i] = objArrayPeriodos[i] + " : " + Periodos.listaSexta.get(i).minutosInicio + " - " + Periodos.listaSexta.get(i).horaTermino + " : " + Periodos.listaSexta.get(i).minutosTermino;
				}
				String auxPeriodo = String.valueOf(JOptionPane.showInputDialog(
						null,"Escolha o Dia da Semana dessa Ocupação","Escolha",JOptionPane.QUESTION_MESSAGE,
						null,objArrayPeriodos,objArrayPeriodos[0]));
				
				for(int auxB = 0; auxB < Periodos.listaSexta.size(); auxB++) {
					if(Periodos.listaSexta.get(auxB).horaInicio.equalsIgnoreCase(auxPeriodo.substring(0,1))) {
						
						novaOcupacao.periodoDaOcupacao = Periodos.listaSexta.get(auxB);
						
						System.out.println("---------------------\n");
						System.out.println("   " + novaOcupacao.periodoDaOcupacao.diaDaSemana + " da Semana Atribuida a Nova Ocupação!\n");
						System.out.println("   Periodo " + novaOcupacao.periodoDaOcupacao.horaInicio + ":" +
														   novaOcupacao.periodoDaOcupacao.minutosInicio + " - " +	
														   novaOcupacao.periodoDaOcupacao.horaTermino + ":" +
														   novaOcupacao.periodoDaOcupacao.minutosTermino +
														   ", na " + novaOcupacao.periodoDaOcupacao.diaDaSemana + " Atribuida a Nova Ocupação!\n");
					}
				}
			}
		}
		else if(auxDiaPeriodo.equalsIgnoreCase("Sabado")) {
			
			if (Periodos.listaSabado.size() == 0) {
				System.out.println("---------------------");
				System.out.println("#		ERRO: Nao existem periodos cadastrados na Sabado.\n");
				System.out.println("#       Por Favor, crie um período\n");
				
				Periodos.cadastrarPeriodos();
				criarECadastrarOcupacao();
			}
			else {
				
				Object[] objArrayPeriodos = Periodos.listaSabado.toArray();
				for(int i = 0; i < objArrayPeriodos.length; i++) {
					objArrayPeriodos[i] = objArrayPeriodos[i] + " : " + Periodos.listaSabado.get(i).minutosInicio + " - " + Periodos.listaSabado.get(i).horaTermino + " : " + Periodos.listaSabado.get(i).minutosTermino;
				}
				String auxPeriodo = String.valueOf(JOptionPane.showInputDialog(
						null,"Escolha o Dia da Semana dessa Ocupação","Escolha",JOptionPane.QUESTION_MESSAGE,
						null,objArrayPeriodos,objArrayPeriodos[0]));
				
				for(int auxB = 0; auxB < Periodos.listaSabado.size(); auxB++) {
					if(Periodos.listaSabado.get(auxB).horaInicio.equalsIgnoreCase(auxPeriodo.substring(0,1))) {
						
						novaOcupacao.periodoDaOcupacao = Periodos.listaSabado.get(auxB);
						
						System.out.println("---------------------\n");
						System.out.println("   " + novaOcupacao.periodoDaOcupacao.diaDaSemana + " da Semana Atribuida a Nova Ocupação!\n");
						System.out.println("   Periodo " + novaOcupacao.periodoDaOcupacao.horaInicio + ":" +
														   novaOcupacao.periodoDaOcupacao.minutosInicio + " - " +	
														   novaOcupacao.periodoDaOcupacao.horaTermino + ":" +
														   novaOcupacao.periodoDaOcupacao.minutosTermino +
														   ", na " + novaOcupacao.periodoDaOcupacao.diaDaSemana + " Atribuida a Nova Ocupação!\n");
					}
				}
			}
		}
		
		
		System.out.println("---------------------");
		System.out.println("		2º Passo: Escolher uma Turma para a Ocupacao.\n");
		
		Object[] objArrayDisciplina = Disciplina.listaDisciplina.toArray();
		
		String auxDisciplina = null;
		try {
			
			auxDisciplina = String.valueOf(JOptionPane.showInputDialog(
				null,"Escolha a Disciplina dessa Ocupação","Escolha",JOptionPane.QUESTION_MESSAGE,
				null,objArrayDisciplina,objArrayDisciplina[0]));
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("---------------------");
			System.out.println("#		ERRO: Nao existem disciplinas cadastradas, logo não existe turmas cadastradas.\n");
			System.out.println("#       Por Favor, crie uma disciplina\n");
			
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
					System.out.println("#		ERRO: Nao existem turmas cadastradas na disciplina " + auxDisciplina + ".\n");
					System.out.println("#       Por Favor, crie uma turma\n");
					
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
	
		System.out.println("     3º Passo: Escolher uma Sala para a Ocupacao.\n");
		
		
		Object[] objArrayCampus = Campus.listaDeCampus.toArray();
		
		String auxCampus = null;
		try {
			
			auxCampus = String.valueOf(JOptionPane.showInputDialog(
				null,"Escolha o Campus dessa Ocupação","Escolha",JOptionPane.QUESTION_MESSAGE,
				null,objArrayCampus,objArrayCampus[0]));
		}
		catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println("---------------------");
			System.out.println("#		ERRO: Nao existem campus cadastrados, logo não existe prédio e salas cadastradas.\n");
			System.out.println("#       Por Favor, crie um campus\n");
			
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
			for(int auxB = 0; auxB < Campus.listaDeCampus.get(aux).listaDePredios.size(); auxB++) {
				if(Campus.listaDeCampus.get(aux).listaDePredios.get(auxB).nomeDaEstrutura.equalsIgnoreCase(auxPredios)) { 
					
					Object[] objArraySalas = Campus.listaDeCampus.get(aux).listaDePredios.get(auxB).listaSala.toArray();
					
					try {
						
						auxSalas = String.valueOf(JOptionPane.showInputDialog(
							null,"Escolha a Sala do Prédio " + auxPredios + ", Campus " + auxCampus + ", para a Ocupação","Escolha",JOptionPane.QUESTION_MESSAGE,
							null,objArraySalas, objArraySalas[0]));
					}
					catch(ArrayIndexOutOfBoundsException e) {
						
						System.out.println("---------------------");
						System.out.println("#		ERRO: Nao existem salas cadastradas no predio " + auxPredios + ".\n");
						System.out.println("#       Por Favor, crie uma sala\n");
						
						Predio.criarSalaNoPredio();
						
						Object[] objNovoArraySalas = Campus.listaDeCampus.get(aux).listaDePredios.get(auxB).listaSala.toArray();
						
						auxSalas = String.valueOf(JOptionPane.showInputDialog(
								null,"Escolha a Sala do Prédio " + auxPredios + ", Campus " + auxCampus + ", para a Ocupação","Escolha",JOptionPane.QUESTION_MESSAGE,
								null,objNovoArraySalas, objNovoArraySalas[0]));	
					}
					
					for(int auxC = 0; auxC < Campus.listaDeCampus.get(aux).listaDePredios.get(auxB).listaSala.size(); auxC++) { 
						if(Campus.listaDeCampus.get(aux).listaDePredios.get(auxB).listaSala.get(auxC).nomeDaSala.equalsIgnoreCase(auxSalas)) { 

							novaOcupacao.salaDaOcupacao = Campus.listaDeCampus.get(aux).listaDePredios.get(auxB).listaSala.get(auxC);
							
							System.out.println("---------------------\n");
							System.out.println("		Sala " + novaOcupacao.salaDaOcupacao.nomeDaSala + ", do Prédio " + auxPredios + ", Campus " + auxCampus + ", Atribuida a Nova Ocupação!\n");
						}
					}
				}
			}
		}
		
		Ocupacao.listaDeOcupacoes.add(novaOcupacao);
		
		System.out.println(" ######################## "+ novaOcupacao.salaDaOcupacao + " " + novaOcupacao.periodoDaOcupacao + " " + novaOcupacao.turmaDaOcupacao);
//		System.out.println("---------------------\n");
//		System.out.println("		Sala " + novaOcupacao.salaDaOcupacao.nomeDaSala + ", do Prédio " + auxPredios + ", Campus " + auxCampus + "Atribuida a Nova Ocupação!\n");	
	}

	public static void listaDeOcupacoes() {
		
		if(listaDeOcupacoes.size() == 0 ) {
			
			System.out.println("---------------------");
			System.out.println("LISTA DE OCUPAÇÕES: \n");
			
			System.out.println("#		ERRO: Nao existem ocupacoes cadastradas, cadastre primeiro, para depois listar.\n");
			criarECadastrarOcupacao();
		}
		else {
			
			System.out.println("---------------------");
			System.out.println("LISTA DE OCUPAÇÕES: \n");
							
			for(int i = 0; i < Ocupacao.listaDeOcupacoes.size(); i++) {
							
				System.out.println(" - Disciplina: " + Ocupacao.listaDeOcupacoes.get(i).turmaDaOcupacao.disciplinaDaTurma);
				System.out.println("   Turma: " + Ocupacao.listaDeOcupacoes.get(i).turmaDaOcupacao);
				System.out.println("   Sala: " + Ocupacao.listaDeOcupacoes.get(i).salaDaOcupacao);
				System.out.println("   Professor: " + Ocupacao.listaDeOcupacoes.get(i).turmaDaOcupacao.professorDaTurma);
				System.out.println("   Horario: " + Ocupacao.listaDeOcupacoes.get(i).periodoDaOcupacao.horaInicio + ":" + 
											     Ocupacao.listaDeOcupacoes.get(i).periodoDaOcupacao.minutosInicio + " - " + 
											     Ocupacao.listaDeOcupacoes.get(i).periodoDaOcupacao.horaTermino + ":" +
											     Ocupacao.listaDeOcupacoes.get(i).periodoDaOcupacao.minutosTermino + "\n");      
			}
		}
	}
}
