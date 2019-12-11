package comunidade;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import instituicao.Campus;
import instituicao.Disciplina;
import instituicao.Turma;

public class Aluno extends Pessoa {
	
	public String matriculaDoAluno;
	public int periodosDoAluno;
	
	
	// association 
	
	public List<Turma> listaDeturmasAluno = new ArrayList<>();
	
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
	
	public static void cadastrarAlunoCasoTeste() {
		
		Aluno novoAluno1 = new Aluno();
		novoAluno1.nomeDaPessoa = "Bruno";
		novoAluno1.matriculaDoAluno = "500329778";
		Campus.listaDeAlunos.add(novoAluno1);
		
		Aluno novoAluno2 = new Aluno();
		novoAluno2.nomeDaPessoa = "Antônio";
		novoAluno2.matriculaDoAluno = "258691821";
		Campus.listaDeAlunos.add(novoAluno2);
		
		Aluno novoAluno3 = new Aluno();
		novoAluno3.nomeDaPessoa = "Geovani";
		novoAluno3.matriculaDoAluno = "769229926";
		Campus.listaDeAlunos.add(novoAluno3);
		
		Aluno novoAluno4 = new Aluno();
		novoAluno4.nomeDaPessoa = "Enzo";
		novoAluno4.matriculaDoAluno = "875941241";
		Campus.listaDeAlunos.add(novoAluno4);
		
		Aluno novoAluno5 = new Aluno();
		novoAluno5.nomeDaPessoa = "Pedro";
		novoAluno5.matriculaDoAluno = "828411452";
		Campus.listaDeAlunos.add(novoAluno5);
		
		Aluno novoAluno6 = new Aluno();
		novoAluno6.nomeDaPessoa = "José";
		novoAluno6.matriculaDoAluno = "697893097";
		Campus.listaDeAlunos.add(novoAluno6);
		
		Aluno novoAluno7 = new Aluno();
		novoAluno7.nomeDaPessoa = "André";
		novoAluno7.matriculaDoAluno = "479878157";
		Campus.listaDeAlunos.add(novoAluno7);
		
		Aluno novoAluno8 = new Aluno();
		novoAluno8.nomeDaPessoa = "João";
		novoAluno8.matriculaDoAluno = "751584490";
		Campus.listaDeAlunos.add(novoAluno8);
		
		Aluno novoAluno9 = new Aluno();
		novoAluno9.nomeDaPessoa = "Iury";
		novoAluno9.matriculaDoAluno = "477877588";
		Campus.listaDeAlunos.add(novoAluno9);
		
		Aluno novoAluno10 = new Aluno();
		novoAluno10.nomeDaPessoa = "Alberto";
		novoAluno10.matriculaDoAluno = "110769588";
		Campus.listaDeAlunos.add(novoAluno10);
		
		System.out.println("---------------------");
		System.out.println("Alunos Caso Testes Criados!\n");
	}
	
	// methods	
	public static void listarTurmasDoAluno() {
		
		try {
		
			Object[] objArrayAlunos = Campus.listaDeAlunos.toArray();
			
			String auxAluno = String.valueOf(JOptionPane.showInputDialog(
					null,"Escolha O Professor dessa turma","Escolha",JOptionPane.QUESTION_MESSAGE,
					null,objArrayAlunos,objArrayAlunos[0]));
			
			for(int aux = 0; aux < Campus.listaDeAlunos.size(); aux++) {
				if(Campus.listaDeAlunos.get(aux).nomeDaPessoa.equalsIgnoreCase(auxAluno)) {
					
					System.out.println("---------------------");
					System.out.println("LISTA DE TURMAS DO ALUNO " +Campus.listaDeAlunos.get(aux).nomeDaPessoa + ":\n");
					
					if(Campus.listaDeAlunos.get(aux).listaDeturmasAluno.size() == 0) {
						System.out.println("O aluno não está cadastrado em nenhuma turma.\n" );
					}
					else {
						for(int auxB = 0; auxB < Disciplina.listaDisciplina.size(); auxB++) {
							for(int auxC = 0; auxC < Disciplina.listaDisciplina.get(auxB).listaTurma.size(); auxC++) {
								
								for(int auxD = 0; auxD < Disciplina.listaDisciplina.get(auxB).listaTurma.get(auxC).listaDeAlunos.size(); auxD++) {
									if(Disciplina.listaDisciplina.get(auxB).listaTurma.get(auxC).listaDeAlunos.get(auxD).nomeDaPessoa.equalsIgnoreCase(auxAluno)) {
										
										System.out.println(" - Nome da Disciplina : " + Disciplina.listaDisciplina.get(auxB).nomeDisciplina);
										System.out.println("   Nome da turma: " + Disciplina.listaDisciplina.get(auxB).listaTurma.get(auxC).nomeDaTurma);
										System.out.println("   Nome do professor: " + Disciplina.listaDisciplina.get(auxB).listaTurma.get(auxC).professorDaTurma.nomeDaPessoa + "\n");
										
										break;
									}
								}
							}
						}
					}
				}
			}
		}catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("---------------------");
			System.out.println("LISTA DE TURMAS DE UM ALUNO:\n");
			
			System.out.println("# Não existe alunos cadastrados para listar suas turmas.\n");
		} 	
	}
	
	public static void listarAlunosCampus( ) {
		
		System.out.println("---------------------");
		System.out.println("LISTAR DO ALUNO:\n");
		
		if(Campus.listaDeAlunos.size() == 0) {
		
			System.out.println("# Não existe alunos cadastrados.\n");
		}
		else {
			for(int i=0; i < Campus.listaDeAlunos.size() ; i++) {
				
				System.out.println(" - Nome do Aluno: " + Campus.listaDeAlunos.get(i).nomeDaPessoa);
				System.out.println("   Matricula do Aluno: " + Campus.listaDeAlunos.get(i).matriculaDoAluno + "\n");
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

	public List<Turma> getListaDeturmasAluno() {
		return listaDeturmasAluno;
	}

	public void setListaDeturmasAluno(List<Turma> listaDeturmasAluno) {
		this.listaDeturmasAluno = listaDeturmasAluno;
	}

	

}
