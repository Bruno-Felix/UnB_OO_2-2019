package instituicao;
import java.util.ArrayList;

import java.util.List;
import javax.swing.JOptionPane;

public class Disciplina {
	
	public String nomeDisciplina;
	public int numCreditos;
	static int opcao;
	List<Turma> listaTurma = new ArrayList<Turma>();
	static List<Disciplina> listaDisciplina = new ArrayList<Disciplina>();
	
	@Override
	public String toString() {
		nomeDisciplina = nomeDisciplina.substring(0, 1).toUpperCase() + nomeDisciplina.substring(1).toLowerCase();
		return  nomeDisciplina;
	}
	
	public String getNomeDisciplina() {
		return nomeDisciplina;
	}
	public void setNomeDisciplina(String nomeDisciplina) {
		this.nomeDisciplina = nomeDisciplina;
	}
	
	public int getNumCreditos() {
		return numCreditos;
	}
	public void setNumCreditos(int numCreditos) {
		this.numCreditos = numCreditos;
	}
	
	
	public static void criarDisciplina() {
		
		System.out.println("---------------------");
		
		do {
			Disciplina novaDisciplina = new Disciplina();
			
			System.out.println("# Nova Disciplina Sendo Criada...");
			
			novaDisciplina.cadastrarDisciplina(novaDisciplina);
			
			System.out.println("  Disciplina " + novaDisciplina.nomeDisciplina + " Criada!\n");
			
			opcao = JOptionPane.showConfirmDialog(null,
					"Quer continuar cadastrando disciplinas ?", "Escolha um", JOptionPane.YES_NO_OPTION);
		
		}while(opcao == 0);
	}
	
	public void cadastrarDisciplina(Disciplina novaDisciplina) {
		
		novaDisciplina.nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina");
		novaDisciplina.nomeDisciplina = validaNome(novaDisciplina.nomeDisciplina);
		novaDisciplina.numCreditos = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de creditos da disciplina"));
		novaDisciplina.numCreditos = validaNumCreditos(novaDisciplina.numCreditos);
		
		listaDisciplina.add(novaDisciplina);
	}
	
	//Objetivo: Listar disciplinas
	public static void listarDisciplinas() {
		
		System.out.println("---------------------");
		System.out.println("LISTA DE DISCIPLINAS:\n");
		
		for(int i = 0; i < Disciplina.listaDisciplina.size(); i++) {   
			
			System.out.println(" - " + (i+1) + "ª Disciplina:");
			System.out.println("   Nome Disciplina: " + Disciplina.listaDisciplina.get(i).nomeDisciplina);
			System.out.println("   Numero de creditos: " + Disciplina.listaDisciplina.get(i).numCreditos + "\n");
		} 
	}
		
	
	
	//objetivo: quando o usuario selecionar a opcao cadastrar turma, uma lista de disciplinas deve ser mostrada,
	//			e o usuario devera escolher uma disciplina para essa turma, e depois os seus atributos
	public static void criarTurma() {
		
		Object[] objArray = listaDisciplina.toArray();
		 
		do {
			Turma novaTurma = new Turma();
			
			System.out.println("# Nova Turma Sendo Criada...");
			
			String auxDisciplina = String.valueOf(JOptionPane.showInputDialog(
					null,"Escolha a Disciplina dessa nova turma","Escolha",JOptionPane.QUESTION_MESSAGE,
					null,objArray,objArray[0]));
			
			novaTurma.cadastrasTurma(auxDisciplina, listaDisciplina, novaTurma);
			
			System.out.println("   Turma " + novaTurma.nomeDaTurma + " Criada Na Disciplina " + auxDisciplina + "!\n");
			
			opcao = JOptionPane.showConfirmDialog(null,
					"Quer continuar cadastrando turmas ?", "Escolha um", JOptionPane.YES_NO_OPTION);
		}while(opcao==0);
	}
	
	//Objetivo: Alterar os dados da disciplina
	public static void alterarDisciplina() {
		
		Object[] objArray = listaDisciplina.toArray();
		
		String temporaria_Disciplina = String.valueOf(JOptionPane.showInputDialog(
				null,"Qual a disciplina voce quer alterar?","Escolha",JOptionPane.QUESTION_MESSAGE,
				null,objArray,objArray[0]));
		
		for(Disciplina disciplina : listaDisciplina) {
			if(disciplina.getNomeDisciplina().equalsIgnoreCase(temporaria_Disciplina)) {
		
				System.out.println(disciplina.getNomeDisciplina());
				System.out.println("   " + "Numero de creditos:  " + disciplina.getNumCreditos());
				
				int opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite :\n 1. Para alterar o nome\n2. Para alterar o numero de creditos "));
				
				if(opcao == 1) {
					
					disciplina.nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina");
					disciplina.nomeDisciplina = Disciplina.validaNome(disciplina.nomeDisciplina);
				}
				else if(opcao == 2) {
					
					disciplina.numCreditos = Integer.parseInt(JOptionPane.showInputDialog("Digite o novo numero de creditos"));
					disciplina.numCreditos = Disciplina.validaNumCreditos(disciplina.numCreditos);
				}
			}
		}
	}
	//Objetivo: Nao permitir que o usuario cadastre um valor invalido de pessoas por turma
	public static int validaQtd(int qtd) {
		
		while(qtd<10 || qtd>130) {
			Integer.parseInt(JOptionPane.showInputDialog("Quantidade invalida, digite uma quantidade entre 10 e 130"));
		}
		
		return qtd;
	}
	
	
	//objetivo: validar o numero de creditos, que nao pode ser menor ou igual a 0, e nao pode ser maior que 6
	public static int validaNumCreditos(int numCreditos) {
		
		while(numCreditos <= 0 || numCreditos > 6) {
			//exception
			numCreditos = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de creditos da disciplina"));
		}
		
		return numCreditos;
	}
	
	
	//Objetivo: Validar o nome da Disciplina, pois ele nao pode estar em branco
	public static String validaNome(String nome){
		
		while(nome == "") {
			//exception
			nome = JOptionPane.showInputDialog("Nome invalido, digite novamente");
		
		}
		
		nome = nome.substring(0, 1).toUpperCase() + nome.substring(1).toLowerCase();
		
		return nome;
	}
}
