package comunidade;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import instituicao.Campus;
import instituicao.Turma;

public class Aluno extends Pessoa {
	
	public String matriculaDoAluno;
	public int periodosDoAluno;
	
	
	// association 
	
	public List<Turma> turmas = new ArrayList<>();
	
	// constructors
	
	public Aluno(){
//		
	}
	
	public Aluno(String nomeDaPessoa, int idadeDaPessoa, String matriculaDoAluno, int periodosDoAluno){
		super(nomeDaPessoa, idadeDaPessoa);
		this.matriculaDoAluno = matriculaDoAluno;
		this.periodosDoAluno = periodosDoAluno;
	}
	
	public static Aluno cadastrarAluno(Aluno novoAluno) {
		
		novoAluno.nomeDaPessoa = JOptionPane.showInputDialog("Digite o nome do Aluno");
		novoAluno.matriculaDoAluno = JOptionPane.showInputDialog("Digite a matricula do Aluno:");
		
		return novoAluno;
	}
	
	// methods	
	public void listarTurmas() {
		
		System.out.println("Turmas do Aluno "+this.nomeDaPessoa);
		
		for(int i=0; i<this.turmas.size();i++) {
			
			System.out.println(this.turmas.get(i));
			
		}
	}
	
	public static void listarAlunosCampus( ) {
		
		if(Campus.listaDeAlunos.size() == 0) {
		
			System.out.println("Não há alunos cadastrados!");
		}
		else {
			
			System.out.println("---------------------");
			System.out.println("LISTA DE ALUNO:\n");
			
			for(int i=0; i < Campus.listaDeAlunos.size() ; i++) {
				
				System.out.println("Nome do Aluno: " + Campus.listaDeAlunos.get(i).nomeDaPessoa);
				System.out.println("Matricula do Aluno: " + Campus.listaDeAlunos.get(i).nomeDaPessoa + "\n");
			}
		}
	}

	// getters e setters

	public String getMatriculaDoAluno() {
		return matriculaDoAluno;
	}

	public void setMatriculaDoAluno(String matriculaDoAluno) {
		this.matriculaDoAluno = matriculaDoAluno;
	}

	public int getPeriodosDoAluno() {
		return periodosDoAluno;
	}

	public void setPeriodosDoAluno(int periodosDoAluno) {
		this.periodosDoAluno = periodosDoAluno;
	}

	public List<Turma> getTurmas() {
		return turmas;
	}

	public void setTurmas(List<Turma> turmas) {
		this.turmas = turmas;
	}

}
