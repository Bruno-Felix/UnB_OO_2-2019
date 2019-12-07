package instituicao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import comunidade.Aluno;
import comunidade.Professor;
//import excessoes.DisciplinaNaoInformadaException;
//import excessoes.ProfessorNaoAtribuidoException;

public class Turma {
	
	public String nomeDaTurma;
	public int numeroDeAlunos;
	public Disciplina disciplinaDaTurma;
	List<Aluno> listaDeAlunos = new ArrayList<Aluno>();
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
			}
			else {
				System.out.println("\n   Alunos Caso Teste Sendo Inseridos na Turma...\n");
				
				inserirAlunoNaTurmaCasoTeste(turmaCriada);
			}
			
			opcaoAluno = JOptionPane.showConfirmDialog(null,
					"Quer continuar inserindo Alunos na Turma ?", "Escolha um", JOptionPane.YES_NO_OPTION);
		}while(opcaoAluno == 0);
		
//		Professor professorCriado = new Professor();
//		ProfessorNaoAtribuidoException.ProfessorNaoAtribuidoException(professorCriado, turmaCriada);
		
//		turmaCriada.professorDaTurma.cadastro = Integer.parseInt(JOptionPane.showInputDialog("Digite o cadastro do Professor"));
		
		for(int aux = 0; aux<Disciplina.listaDisciplina.size(); aux++) {
			if(Disciplina.listaDisciplina.get(aux).nomeDisciplina.equalsIgnoreCase(temporaria)) {
				
				turmaCriada.disciplinaDaTurma = Disciplina.listaDisciplina.get(aux);
				Disciplina.listaDisciplina.get(aux).listaTurma.add(turmaCriada);
			}
		}
	}
	
	public void inserirAlunoNaTurma(Turma turmaCriada, Aluno novoAluno) {
		
		novoAluno = Aluno.cadastrarAluno(novoAluno);
		
		turmaCriada.listaDeAlunos.add(novoAluno);
		
		System.out.println("   Aluno" + novoAluno.nomeDaPessoa + "Inserido!\n");
	}
	
	public void inserirAlunoNaTurmaCasoTeste(Turma turmaCriada) {
		
		Aluno novoAluno1 = new Aluno();
		novoAluno1.nomeDaPessoa = "Bruno";
		novoAluno1.matriculaDoAluno = "500329778";
		turmaCriada.listaDeAlunos.add(novoAluno1);
		
		Aluno novoAluno2 = new Aluno();
		novoAluno2.nomeDaPessoa = "Antônio";
		novoAluno2.matriculaDoAluno = "258691821";
		turmaCriada.listaDeAlunos.add(novoAluno2);
		
		Aluno novoAluno3 = new Aluno();
		novoAluno3.nomeDaPessoa = "Antônio";
		novoAluno3.matriculaDoAluno = "769229926";
		turmaCriada.listaDeAlunos.add(novoAluno3);
		
		Aluno novoAluno4 = new Aluno();
		novoAluno4.nomeDaPessoa = "Geovani";
		novoAluno4.matriculaDoAluno = "875941241";
		turmaCriada.listaDeAlunos.add(novoAluno4);
		
		Aluno novoAluno5 = new Aluno();
		novoAluno5.nomeDaPessoa = "Pedro";
		novoAluno5.matriculaDoAluno = "828411452";
		turmaCriada.listaDeAlunos.add(novoAluno5);
		
		Aluno novoAluno6 = new Aluno();
		novoAluno6.nomeDaPessoa = "Enzo";
		novoAluno6.matriculaDoAluno = "697893097";
		turmaCriada.listaDeAlunos.add(novoAluno6);
		
		Aluno novoAluno7 = new Aluno();
		novoAluno7.nomeDaPessoa = "André";
		novoAluno7.matriculaDoAluno = "479878157";
		turmaCriada.listaDeAlunos.add(novoAluno7);
		
		Aluno novoAluno8 = new Aluno();
		novoAluno8.nomeDaPessoa = "João";
		novoAluno8.matriculaDoAluno = "751584490";
		turmaCriada.listaDeAlunos.add(novoAluno8);
		
		Aluno novoAluno9 = new Aluno();
		novoAluno9.nomeDaPessoa = "Iury";
		novoAluno9.matriculaDoAluno = "477877588";
		turmaCriada.listaDeAlunos.add(novoAluno9);
		
		Aluno novoAluno10 = new Aluno();
		novoAluno10.nomeDaPessoa = "Alberto";
		novoAluno10.matriculaDoAluno = "110769588";
		turmaCriada.listaDeAlunos.add(novoAluno10);
		
		System.out.println("   Alunos Caso Teste Inseridos!\n");
	}
	
	public static void listarAlunosDaTurma() {
		
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
						
						System.out.println("LISTA DE ALUNOS DA TURMA:\n");
						
						System.out.println("Disciplina: " + Disciplina.listaDisciplina.get(aux) + " | " + 
								   "Turma: " + Disciplina.listaDisciplina.get(aux).listaTurma.get(aux1).nomeDaTurma + " | " +
								   "Numero de Alunos: " + Disciplina.listaDisciplina.get(aux).listaTurma.get(aux1).numeroDeAlunos + "\n");
				
						for(int i = 0; i < Disciplina.listaDisciplina.get(aux).listaTurma.get(aux1).listaDeAlunos.size(); i++) {
							
							System.out.println("Nome do Aluno: " +  Disciplina.listaDisciplina.get(aux).listaTurma.get(aux1).listaDeAlunos.get(i).nomeDaPessoa);
							System.out.println("Matricula do Aluno: " +  Disciplina.listaDisciplina.get(aux).listaTurma.get(aux1).listaDeAlunos.get(i).matriculaDoAluno);
							System.out.println("---------------------");
						}
					}
				}
			}
		}		
	}

	public static void atribuirProfessor(Professor professorCriado, Turma turmaCriada) throws NullPointerException{
		
		turmaCriada.professorDaTurma.nomeDaPessoa = JOptionPane.showInputDialog("Digite o nome do Professor");
	}
}
