package instituicao;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import comunidade.Aluno;
import comunidade.Professor;

public class Campus {
	@Override
	public String toString() {
		return nomeDoCampus;
	}

	public String nomeDoCampus;
	public int numeroDeEstruturas;
	public static int numeroDeCampus;
	public static ArrayList<Campus> listaDeCampus = new ArrayList<Campus>();
	List<Estrutura> estruturasDoCampus = new ArrayList<Estrutura>(); // ArrayList das estruturas desse campus
	List<Predio> listaDePredios = new ArrayList<Predio>();
	
	// associacao com Pessoa:
	
	public static List<Professor> listaDeProfessores = new ArrayList<>();
	public static List<Aluno> listaDeAlunos = new ArrayList<>();
	

	public String getnomeDoCampus() {
		return nomeDoCampus;
	}

	public void setnomeDoCampus(String nomeDoCampus) {
		this.nomeDoCampus = nomeDoCampus;
	}

	public int getnumeroDeEstruturas() {
		return numeroDeEstruturas;
	}

	public void setnumeroDeEstruturas(int numeroDeEstruturas) {
		this.numeroDeEstruturas = numeroDeEstruturas;
	}
	

	public static void criarCampus() {

		int opcao = 0;
		
		System.out.println("---------------------");
		do {
			Campus novoCampus = new Campus();
			
			System.out.println("# Novo Campus Sendo Criado...");
			
			novoCampus.nomeDoCampus = JOptionPane.showInputDialog("Digite o nome do Campus: ");
			novoCampus.numeroDeEstruturas = 0; // numero de estruturas começa como 0 e aumenta com a criação de estruturas
			Campus.numeroDeCampus++;
			
			listaDeCampus.add(novoCampus);
			
			System.out.println("  Campus " + novoCampus.nomeDoCampus + " Criado!\n");
			
			opcao = JOptionPane.showConfirmDialog(null,
					"Quer continuar criando Campus?", "Escolha um", JOptionPane.YES_NO_OPTION);
			
		}while(opcao == 0);
	}

	public static void listarCampus() {

		if (listaDeCampus.size() != 0) {
			
			System.out.println("---------------------");
			System.out.println("LISTA DE CAMPUS:\n");
		}else {
			
			System.out.println("Nenhum Campus Cadastrado!");
		}
		
		for(int aux = 0; aux<Campus.listaDeCampus.size(); aux++) {
		
			System.out.println(" - " + (aux+1) + "º campus:");
			System.out.println("   Nome do Campus: " + listaDeCampus.get(aux).nomeDoCampus);
			System.out.println("   Numero de Estruturas: " + listaDeCampus.get(aux).numeroDeEstruturas + "\n");
		}
	}
	
	void criarEstrutura() { // Criação de estruturas fica para o campus no qual está a estrutura]
		
		Estrutura novaEstrutura = new Estrutura();
		
		novaEstrutura.nomeDaEstrutura = JOptionPane.showInputDialog("Digite o nome da Estrutura: ");
		novaEstrutura.campusDaEstrutura = this;
		this.numeroDeEstruturas++;
		
		estruturasDoCampus.add(novaEstrutura);
	}
	
	public static void criarPredio() { // Criação de predio
		
		int opcao = 0;
		
		do {
			Predio novoPredio = new Predio();
			
			System.out.println("---------------------");
			System.out.println("# Novo Prédio Sendo Criado...");
			
			Object[] objArrayCampus = listaDeCampus.toArray();
	    	
	    	String auxCampus = String.valueOf(JOptionPane.showInputDialog(
					null,"Criar Prédio - Campus:","Escolha",JOptionPane.QUESTION_MESSAGE,
					null,objArrayCampus,objArrayCampus[0]));
	    			
			novoPredio.cadastrarPredio(auxCampus, novoPredio, listaDeCampus);
			
			System.out.println("  Prédio " + novoPredio.nomeDaEstrutura + " Criado no Campus " + auxCampus + "!\n");
	    	
	    	opcao = JOptionPane.showConfirmDialog(null,
					"Quer continuar criando Predios?", "Escolha um", JOptionPane.YES_NO_OPTION);
	    	
		}while(opcao == 0);
	}
	
public static void criarProfessor() {
		
		Professor novoProfessor = new Professor();
			
		cadastrarProfessoeEmCampus(novoProfessor);
	}
	
	public static void cadastrarProfessoeEmCampus(Professor professor) {
		listaDeProfessores.add(professor);
	}
	
	public static void criarAluno() {
		
		Aluno novoAluno = new Aluno();
			
		cadastrarAlunoEmCampus(novoAluno);
	}

	public static void cadastrarAlunoEmCampus(Aluno aluno) {
		listaDeAlunos.add(aluno);
	}
	
	public static void listarProfessoresCampus() {
		
		if(listaDeProfessores.size() == 0) {
			
			System.out.println("Não há professores cadastrados!");
		}
		else {
		
			System.out.println("---------------------");
			System.out.println("LISTA DE PROFESSORES:\n");
			
			for(int i = 0; i < listaDeProfessores.size(); i++) {
				
				System.out.println("Nome do Professor: " + listaDeProfessores.get(i).nomeDaPessoa);
				System.out.println("Cadastro do Professor: " + listaDeProfessores.get(i).cadastro + "\n");
			}
		}
	}
	
	public static void listarAlunosCampus( ) {
		
		if(listaDeAlunos.size() == 0) {
		
			System.out.println("Não há alunos cadastrados!");
		}
		else {
			
			System.out.println("---------------------");
			System.out.println("LISTA DE ALUNO:\n");
			
			for(int i=0; i < listaDeAlunos.size() ; i++) {
				
				System.out.println("Nome do Aluno: " + listaDeAlunos.get(i).nomeDaPessoa);
				System.out.println("Matricula do Aluno: " + listaDeAlunos.get(i).nomeDaPessoa + "\n");
			}
		}
	}
}
