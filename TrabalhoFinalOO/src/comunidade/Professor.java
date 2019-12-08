package comunidade;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import instituicao.Campus;
import instituicao.Turma;

public class Professor extends Pessoa {
	
	public String cadastro;
	
	// association
	
	public List<Turma> listaDeTurmasProfessor = new ArrayList<>();
		
	
	// constructor
	
	public Professor() {

	}
	
	public Professor(String nomeDaPessoa, int idadeDaPessoa, String cadastro){
		super(nomeDaPessoa, idadeDaPessoa);
		this.cadastro = cadastro;
	}
	
	///
			
	// methods
	
	public void cadastrarProfessor(Professor novoProfessor) {
		
		novoProfessor.nomeDaPessoa = JOptionPane.showInputDialog("Digite o Nome do Professor");
		novoProfessor.cadastro = JOptionPane.showInputDialog("Digite o cadastro do Professor:");
		
		Campus.listaDeProfessores.add(novoProfessor);
	}
	
	public void listarTurmas() {
		
		if(this.getListaDeTurmasProfessor().size() == 0) {
			System.out.println("N�o h� turmas cadastradas para o professor: "+ this.getNomeDaPessoa());
		}else {
			
			System.out.println("Turmas cadastradas do professor: "+this.getNomeDaPessoa());
			
			for(int i=0; i < this.getListaDeTurmasProfessor().size() ; i++) {
				System.out.println(this.listaDeTurmasProfessor.get(i));
			}
		}
	}

	public static void listarProfessoresCampus() {
		
		if(Campus.listaDeProfessores.size() == 0) {
			
			System.out.println("Não há professores cadastrados!");
		}
		else {
		
			System.out.println("---------------------");
			System.out.println("LISTA DE PROFESSORES:\n");
			
			for(int i = 0; i < Campus.listaDeProfessores.size(); i++) {
				
				System.out.println("Nome do Professor: " + Campus.listaDeProfessores.get(i).nomeDaPessoa);
				System.out.println("Cadastro do Professor: " + Campus.listaDeProfessores.get(i).cadastro + "\n");
			}
		}
	}

	// getters e setters
		
	public String getCadastro() {
		return cadastro;
	}

	public void setCadastro(String cadastro) {
		this.cadastro = cadastro;
	}

	public List<Turma> getListaDeTurmasProfessor() {
		return listaDeTurmasProfessor;
	}

	public void setListaDeTurmasProfessor(List<Turma> listaDeTurmasProfessor) {
		this.listaDeTurmasProfessor = listaDeTurmasProfessor;
	}

	
}
