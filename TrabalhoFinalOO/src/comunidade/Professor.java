package comunidade;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import instituicao.Campus;
import instituicao.Turma;

public class Professor extends Pessoa {
	
	public String cadastro;
	
	// association
	
	public List<Turma> listaDeTurmasProfessor = new ArrayList<Turma>();
		
	
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
			
			System.out.println("---------------------");
			System.out.println("LISTA DE PROFESSORES:\n");
			
			System.out.println("# Não existe professores cadastrados.\n");
			System.out.println("# Por Favor, crie um novo professor.\n");
			
			Campus.criarProfessor(); 
			listarProfessoresCampus();
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
	
	public static void listarTurmasDoProfessor() {
		
		if(Campus.listaDeProfessores.size() == 0) {
			
			System.out.println("---------------------");
			System.out.println("LISTA DE TURMAS DE UM PROFESSOR:\n");
			
			System.out.println("# Não existe professores cadastrados.\n");
			System.out.println("# Por Favor, crie um novo professor.\n");
			
			Campus.criarProfessor();
			listarTurmasDoProfessor();
		}
		else {
			
			int auxTemTurmasCadastradas = 0;
			
			Object[] objArrayProfessor = Campus.listaDeProfessores.toArray();
			
			String auxProfessor = String.valueOf(JOptionPane.showInputDialog(
					null,"Listar Turmas do Professor - Professor:","Escolha",JOptionPane.QUESTION_MESSAGE,
					null,objArrayProfessor,objArrayProfessor[0]));
			
			for(int aux = 0; aux < Campus.listaDeProfessores.size(); aux++) {
				if(Campus.listaDeProfessores.get(aux).nomeDaPessoa.equalsIgnoreCase(auxProfessor)) {
					
					System.out.println("---------------------");
					System.out.println("LISTA DE TURMAS DO PROFESSOR " + Campus.listaDeProfessores.get(aux).nomeDaPessoa + ":\n");
					
					for(int auxB = 0; auxB < Campus.listaDeProfessores.get(aux).listaDeTurmasProfessor.size(); auxB++) {
						
						auxTemTurmasCadastradas++;
						
						System.out.println(" - " + (auxB+1) + "ª Turma: ");
						System.out.println("   Nome da turma: " + Campus.listaDeProfessores.get(aux).listaDeTurmasProfessor.get(auxB).nomeDaTurma);
						System.out.println("   Nome do professor: " + Campus.listaDeProfessores.get(aux).listaDeTurmasProfessor.get(auxB).professorDaTurma.nomeDaPessoa);
						System.out.println("   Numero de alunos: " + Campus.listaDeProfessores.get(aux).listaDeTurmasProfessor.get(auxB).numeroDeAlunos + "\n");
					}
				}
			}
			
			if(auxTemTurmasCadastradas == 0) {
				
				System.out.println("O Professor " + auxProfessor + " tem nenhuma turma.\n");
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
