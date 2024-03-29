package instituicao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import comunidade.Aluno;
import comunidade.Professor;
import excessoes.DisciplinaNaoInformadaException;
//import excessoes.DisciplinaNaoInformadaException;
//import excessoes.ProfessorNaoAtribuidoException;
import excessoes.ProfessorNaoAtribuidoException;

public class Turma {
	
	public String nomeDaTurma;
	public int numeroDeAlunos;
	public Disciplina disciplinaDaTurma;
	public List<Aluno> listaDeAlunos = new ArrayList<Aluno>();
	public Professor professorDaTurma;
	
	@Override
	public String toString() {
		return nomeDaTurma;
	}
	
	public String getnomeDaTurma() {
		return nomeDaTurma;
	}

	public void setnomeDaTurma(String nomeDaTurma) {
		this.nomeDaTurma = nomeDaTurma;
	}

	public int getnumeroDeAlunos() {
		return numeroDeAlunos;
	}

	public void setnumeroDeAlunos(int numeroDeAlunos) {
		this.numeroDeAlunos = numeroDeAlunos;
	}
	
	public Disciplina getdisciplinaDaTurma() {
		return disciplinaDaTurma;
	}

	public void setdisciplinaDaTurma(Disciplina disciplinaDaTurma) {
		this.disciplinaDaTurma = disciplinaDaTurma;
	}
	
	
	public void cadastrasTurma(String temporaria, List <Disciplina> listaDisciplina, Turma turmaCriada) {
		
		int opcaoAluno = 0;
		
		turmaCriada.nomeDaTurma = JOptionPane.showInputDialog("Digite o nome da turma");
		turmaCriada.numeroDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));
		
		do {
			String opcaoTurmaCriada = JOptionPane.showInputDialog("Digite 1 para Inserir um Aluno\n"
															    + "Digite 2 para Inserir um Caso Teste de Alunos.");
			
			if(opcaoTurmaCriada.equalsIgnoreCase("1")) {
				
				System.out.println("\n   Aluno Sendo Inserido na Turma...\n");
				
				Aluno novoAluno = new Aluno();
				turmaCriada.inserirAlunoNaTurma(turmaCriada, novoAluno);
				Campus.listaDeAlunos.add(novoAluno);
			}
			else {
				System.out.println("\n   Alunos Caso Teste Sendo Inseridos na Turma...\n");
				
				inserirAlunoNaTurmaCasoTeste(turmaCriada);
			}
			
			opcaoAluno = JOptionPane.showConfirmDialog(null,
					"Quer continuar inserindo Alunos na Turma ?", "Escolha um", JOptionPane.YES_NO_OPTION);
		}while(opcaoAluno == 0);
		
		
		Object[] objArrayProfessores = Campus.listaDeProfessores.toArray();
		
		ProfessorNaoAtribuidoException.NaoAtribuidoException(turmaCriada, objArrayProfessores);
		
		for(int aux = 0; aux<Disciplina.listaDisciplina.size(); aux++) {
			if(Disciplina.listaDisciplina.get(aux).nomeDisciplina.equalsIgnoreCase(temporaria)) {
				
				Object[] objArrayDsc = Disciplina.listaDisciplina.toArray();
				
				DisciplinaNaoInformadaException.DisciplinaNaoInformadaException(turmaCriada, objArrayDsc);
				Disciplina.listaDisciplina.get(aux).listaTurma.add(turmaCriada);
			}
		}
	}
	
	public static void alterarTurmas() {
		
		try {
		
		Object[] objArrayDsc = Disciplina.listaDisciplina.toArray();
		Object[] objArrayTrm = Disciplina.listaDisciplina.toArray();
		
		String temporaria_disciplina = String.valueOf(JOptionPane.showInputDialog(
				null,"Selecione uma disciplina","Escolha",JOptionPane.QUESTION_MESSAGE,
				null,objArrayDsc,objArrayDsc[0]));
		
		for(Disciplina disciplina :  Disciplina.listaDisciplina) {
			if(disciplina.getNomeDisciplina().equalsIgnoreCase(temporaria_disciplina)) {
	
				String temporaria_turma = String.valueOf(JOptionPane.showInputDialog(
						null,"Selecione uma turma de " + temporaria_disciplina,"Escolha",JOptionPane.QUESTION_MESSAGE,
						null,objArrayTrm,objArrayTrm[0]));
				
				for(Turma turma: disciplina.listaTurma) {
					if(turma.nomeDaTurma.equalsIgnoreCase(temporaria_turma)) {
				
						int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite :\n 1. Para alterar o nome da turma\n2. Para alterar o numero de alunos"));
						
						if(opcao == 1) {
							turma.nomeDaTurma = JOptionPane.showInputDialog("Digite o novo nome da turma");
							turma.nomeDaTurma = Disciplina.validaNome(turma.nomeDaTurma);
						}
						else if(opcao == 2) {
							turma.numeroDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova quantidade de alunos"));
							turma.numeroDeAlunos = Disciplina.validaQtd(turma.numeroDeAlunos);
						}
					}
				}
			}
		}
		
		} catch (ArrayIndexOutOfBoundsException e) {
    		System.out.println("Nenhuma turma cadastrada para ser alterada!\n");
    	}
	}
	
	public static void listarTurmas() {
		
		try {
		
			Object[] objArray = Disciplina.listaDisciplina.toArray();
			
			String temporaria_turma = String.valueOf(JOptionPane.showInputDialog(
					null,"Qual a disciplina deve ter suas turmas listadas?","Escolha",JOptionPane.QUESTION_MESSAGE,
					null,objArray,objArray[0]));
			
			int aux = 1;
			int auxPrint = 0;
			
			for(Disciplina disciplina :  Disciplina.listaDisciplina) {
	
				if(auxPrint == 0) {
					
					System.out.println("---------------------");
					System.out.println("LISTA DE TURMAS DA DISCIPLINA " + temporaria_turma + ":\n");
					auxPrint++;
				}
				
				for(Turma turma: disciplina.listaTurma) {
					if(disciplina.getNomeDisciplina().equalsIgnoreCase(temporaria_turma)) {
						
						System.out.println(" - " + aux + "ª Turma: ");
						System.out.println("   Nome da turma: " + turma.nomeDaTurma);
						System.out.println("   Nome do professor: " + turma.professorDaTurma.nomeDaPessoa);
						System.out.println("   Numero de alunos: " + turma.numeroDeAlunos + "\n");
						aux++;
					}
				}
			}
		} catch (ArrayIndexOutOfBoundsException e) {
		
			System.out.println("---------------------");
			System.out.println("LISTA DE TURMAS: \n");
			System.out.println("# Nenhuma disciplina cadastrada para listar suas turmas.\n");
		}
	}

	public void inserirAlunoNaTurma(Turma turmaCriada, Aluno novoAluno) {
		
		novoAluno = Aluno.cadastrarAluno(novoAluno);
		
		turmaCriada.listaDeAlunos.add(novoAluno);
		
		//adicionando a turma na lista de turmas do aluno
		novoAluno.getListaDeturmasAluno().add(turmaCriada);
		
		System.out.println("   Aluno " + novoAluno.nomeDaPessoa + " Inserido!\n");
	}
	
	public void inserirAlunoNaTurmaCasoTeste(Turma turmaCriada) {
		
		Aluno novoAluno1 = new Aluno();
		novoAluno1.nomeDaPessoa = "Bruno";
		novoAluno1.matriculaDoAluno = "500329778";
		turmaCriada.listaDeAlunos.add(novoAluno1);
		novoAluno1.getListaDeturmasAluno().add(turmaCriada);
		Campus.listaDeAlunos.add(novoAluno1);
		
		Aluno novoAluno2 = new Aluno();
		novoAluno2.nomeDaPessoa = "Antônio";
		novoAluno2.matriculaDoAluno = "258691821";
		turmaCriada.listaDeAlunos.add(novoAluno2);
		novoAluno2.getListaDeturmasAluno().add(turmaCriada);
		Campus.listaDeAlunos.add(novoAluno2);
		
		Aluno novoAluno3 = new Aluno();
		novoAluno3.nomeDaPessoa = "Antônio";
		novoAluno3.matriculaDoAluno = "769229926";
		turmaCriada.listaDeAlunos.add(novoAluno3);
		novoAluno3.getListaDeturmasAluno().add(turmaCriada);
		Campus.listaDeAlunos.add(novoAluno3);
		
		Aluno novoAluno4 = new Aluno();
		novoAluno4.nomeDaPessoa = "Geovani";
		novoAluno4.matriculaDoAluno = "875941241";
		turmaCriada.listaDeAlunos.add(novoAluno4);
		novoAluno4.getListaDeturmasAluno().add(turmaCriada);
		Campus.listaDeAlunos.add(novoAluno4);
		
		Aluno novoAluno5 = new Aluno();
		novoAluno5.nomeDaPessoa = "Pedro";
		novoAluno5.matriculaDoAluno = "828411452";
		turmaCriada.listaDeAlunos.add(novoAluno5);
		novoAluno5.getListaDeturmasAluno().add(turmaCriada);
		Campus.listaDeAlunos.add(novoAluno5);
		
		Aluno novoAluno6 = new Aluno();
		novoAluno6.nomeDaPessoa = "Enzo";
		novoAluno6.matriculaDoAluno = "697893097";
		turmaCriada.listaDeAlunos.add(novoAluno6);
		novoAluno6.getListaDeturmasAluno().add(turmaCriada);
		Campus.listaDeAlunos.add(novoAluno6);
		
		Aluno novoAluno7 = new Aluno();
		novoAluno7.nomeDaPessoa = "André";
		novoAluno7.matriculaDoAluno = "479878157";
		turmaCriada.listaDeAlunos.add(novoAluno7);
		novoAluno7.getListaDeturmasAluno().add(turmaCriada);
		Campus.listaDeAlunos.add(novoAluno7);
		
		Aluno novoAluno8 = new Aluno();
		novoAluno8.nomeDaPessoa = "João";
		novoAluno8.matriculaDoAluno = "751584490";
		turmaCriada.listaDeAlunos.add(novoAluno8);
		novoAluno8.getListaDeturmasAluno().add(turmaCriada);
		Campus.listaDeAlunos.add(novoAluno8);
		
		Aluno novoAluno9 = new Aluno();
		novoAluno9.nomeDaPessoa = "Iury";
		novoAluno9.matriculaDoAluno = "477877588";
		turmaCriada.listaDeAlunos.add(novoAluno9);
		novoAluno9.getListaDeturmasAluno().add(turmaCriada);
		Campus.listaDeAlunos.add(novoAluno9);
		
		Aluno novoAluno10 = new Aluno();
		novoAluno10.nomeDaPessoa = "Alberto";
		novoAluno10.matriculaDoAluno = "110769588";
		turmaCriada.listaDeAlunos.add(novoAluno10);
		novoAluno10.getListaDeturmasAluno().add(turmaCriada);
		Campus.listaDeAlunos.add(novoAluno10);
		
		System.out.println("   Alunos Caso Teste Inseridos!\n");
	}
	
	public static void listarAlunosDaTurma() {
		
		try {
		
		Object[] objArray = Disciplina.listaDisciplina.toArray();
		String auxDisciplina = String.valueOf(JOptionPane.showInputDialog(
				null,"Listar Alunos - Disciplina:","Escolha",JOptionPane.QUESTION_MESSAGE,
				null,objArray,objArray[0]));

		for(int aux = 0; aux<Disciplina.listaDisciplina.size(); aux++) {
			if(Disciplina.listaDisciplina.get(aux).nomeDisciplina.equalsIgnoreCase(auxDisciplina)) {
				
				Object[] objArrayTurma = Disciplina.listaDisciplina.get(aux).listaTurma.toArray();
				String auxTurma = String.valueOf(JOptionPane.showInputDialog(
						null,"Listar Alunos - Turma:","Escolha",JOptionPane.QUESTION_MESSAGE,
						null,objArrayTurma,objArrayTurma[0]));
				
				for(int aux1 = 0; aux1 < Disciplina.listaDisciplina.get(aux).listaTurma.size(); aux1++) {
					if(Disciplina.listaDisciplina.get(aux).listaTurma.get(aux1).nomeDaTurma.equalsIgnoreCase(auxTurma)) {
						
						System.out.println("---------------------");
						System.out.println("LISTA DE ALUNOS DA TURMA:\n");
						
						System.out.println("Disciplina: " + Disciplina.listaDisciplina.get(aux) + " | " + 
								   "Turma: " + Disciplina.listaDisciplina.get(aux).listaTurma.get(aux1).nomeDaTurma + " | " +
								   "Numero de Alunos: " + Disciplina.listaDisciplina.get(aux).listaTurma.get(aux1).numeroDeAlunos + "\n");
				
						for(int i = 0; i < Disciplina.listaDisciplina.get(aux).listaTurma.get(aux1).listaDeAlunos.size(); i++) {
							
							System.out.println("Nome do Aluno: " +  Disciplina.listaDisciplina.get(aux).listaTurma.get(aux1).listaDeAlunos.get(i).nomeDaPessoa);
							System.out.println("Matricula do Aluno: " +  Disciplina.listaDisciplina.get(aux).listaTurma.get(aux1).listaDeAlunos.get(i).matriculaDoAluno + "\n");
						}
					}
				}
			}
		}
		
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("---------------------");
			System.out.println("LISTA ALUNOS DA TURMAS: \n");
    		System.out.println("# Nenhuma turma cadastrada para listar seus Aluno!\n");
    	}
	}

	public static void atribuirProfessor(Turma turmaCriada, Object[] objArrayProfessores) throws ArrayIndexOutOfBoundsException{
		
		String auxProfessor = String.valueOf(JOptionPane.showInputDialog(
				null,"Escolha O Professor dessa turma","Escolha",JOptionPane.QUESTION_MESSAGE,
				null,objArrayProfessores,objArrayProfessores[0]));
		
		for(int aux = 0; aux<Campus.listaDeProfessores.size(); aux++) {
			if(Campus.listaDeProfessores.get(aux).nomeDaPessoa.equalsIgnoreCase(auxProfessor)) {
				
				turmaCriada.professorDaTurma = Campus.listaDeProfessores.get(aux);
				
				//adicionando a turma na lista de turmas do professor
				turmaCriada.professorDaTurma.getListaDeTurmasProfessor().add(turmaCriada);
			}
		}
	}
	
	public static void atribuirDisciplina(Turma turmaCriada, Object[] objArrayDisciplinas) throws ArrayIndexOutOfBoundsException{
		
		String auxDisciplina = String.valueOf(JOptionPane.showInputDialog(
				null,"Escolha a Disciplina da turma","Escolha",JOptionPane.QUESTION_MESSAGE,
				null,objArrayDisciplinas,objArrayDisciplinas[0]));
		
		for(int aux = 0; aux<Disciplina.listaDisciplina.size(); aux++) {
			if(Disciplina.listaDisciplina.get(aux).nomeDisciplina.equalsIgnoreCase(auxDisciplina)) {
		
				turmaCriada.disciplinaDaTurma = Disciplina.listaDisciplina.get(aux);
			}
		}
	}
}

