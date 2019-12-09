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
			
			System.out.println("---------------------");
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
			System.out.println("# Novo Predio Sendo Criado...");
			
			Object[] objArrayCampus = listaDeCampus.toArray();
	    	
	    	String auxCampus = String.valueOf(JOptionPane.showInputDialog(
					null,"Criar Prédio - Campus:","Escolha",JOptionPane.QUESTION_MESSAGE,
					null,objArrayCampus,objArrayCampus[0]));
	    			
			novoPredio.cadastrarPredio(auxCampus, novoPredio, listaDeCampus);
			
			System.out.println("  Predio " + novoPredio.nomeDaEstrutura + " Criado no Campus " + auxCampus + "!\n");
	    	
	    	opcao = JOptionPane.showConfirmDialog(null,
					"Quer continuar criando Predios?", "Escolha um", JOptionPane.YES_NO_OPTION);
	    	
		}while(opcao == 0);
	}
	
	public static void criarProfessor() {
		
		Professor novoProfessor = new Professor();
		
		novoProfessor.cadastrarProfessor(novoProfessor);
	}
	
	public static void criarProfessorCasoTeste() {
	
		Professor novoProfessor1 = new Professor();
		novoProfessor1.nomeDaPessoa = "André Lanna";
		novoProfessor1.cadastro = "69053";
		Campus.listaDeProfessores.add(novoProfessor1);
		
		Professor novoProfessor2 = new Professor();
		novoProfessor2.nomeDaPessoa = "Ricardo Fragelli";
		novoProfessor2.cadastro = "13941";
		Campus.listaDeProfessores.add(novoProfessor2);
		
		Professor novoProfessor3 = new Professor();
		novoProfessor3.nomeDaPessoa = "Paula Meyer";
		novoProfessor3.cadastro = "36865";
		Campus.listaDeProfessores.add(novoProfessor3);
		
		Professor novoProfessor4 = new Professor();
		novoProfessor4.nomeDaPessoa = "Renato Coral";
		novoProfessor4.cadastro = "46654";
		Campus.listaDeProfessores.add(novoProfessor4);
		
		Professor novoProfessor5 = new Professor();
		novoProfessor5.nomeDaPessoa = "Tatiane da Silva";
		novoProfessor5.cadastro = "11112";
		Campus.listaDeProfessores.add(novoProfessor5);
	}
	
	public static void criarAluno() {
		
		Aluno novoAluno = new Aluno();
			
		cadastrarAlunoEmCampus(novoAluno);
	}

	public static void cadastrarAlunoEmCampus(Aluno aluno) {
		
		aluno.nomeDaPessoa = JOptionPane.showInputDialog("Digite o nome do Aluno");
		aluno.matriculaDoAluno = JOptionPane.showInputDialog("Digite a matricula do Aluno:");
		
		listaDeAlunos.add(aluno);
	}
}
