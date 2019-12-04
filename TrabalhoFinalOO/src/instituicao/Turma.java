package instituicao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import comunidade.Aluno;
import comunidade.Professor;

public class Turma {
	
	public String nomeDaTurma;
	public int numeroDeAlunos;
	public Disciplina disciplinaDaTurma;
	List<Aluno> listaDeAlunos = new ArrayList<Aluno>();
	List<Aluno> listaDeProfessores = new ArrayList<Aluno>();
	
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
	
	
	public void cadastrasTurma(String temporaria, List <Disciplina> listaDisciplina, Turma preencheTurma) {
		
		int opcao = 0;
		
		preencheTurma.nomeDaTurma = JOptionPane.showInputDialog("Digite o nome da turma");
		preencheTurma.numeroDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));
		
		do {
			preencheTurma.inserirAlunoNaTurma();
			
			opcao = JOptionPane.showConfirmDialog(null,
					"Quer continuar inserindo Alunos na Turma ?", "Escolha um", JOptionPane.YES_NO_OPTION);
		}while(opcao == 0);
		
		for(int aux = 0; aux<Disciplina.listaDisciplina.size(); aux++) {
			if(Disciplina.listaDisciplina.get(aux).nomeDisciplina.equalsIgnoreCase(temporaria)) {
				
				preencheTurma.disciplinaDaTurma = Disciplina.listaDisciplina.get(aux);
				Disciplina.listaDisciplina.get(aux).listaTurma.add(preencheTurma);
			}
		}
	}
	
	public void inserirAlunoNaTurma() {
		
		Aluno novoAluno = new Aluno();
		
		novoAluno = Aluno.cadastrarAluno(novoAluno);
		
		listaDeAlunos.add(novoAluno);
	}
	
	public void inserirAlunoNaTurmaCasoTeste() {
		
//		Aluno novoAluno = new Aluno();
//		
//		novoAluno = Aluno.cadastrarAluno(novoAluno);
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

	public void atribuirProfessor() {
		
	}
}
