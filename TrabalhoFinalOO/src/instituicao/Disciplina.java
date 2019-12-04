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
	
	
	public static void criarDisciplina() {
		
		do {
			Disciplina preencheDsc = new Disciplina();
			preencheDsc.nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina");
			preencheDsc.nomeDisciplina = validaNome(preencheDsc.nomeDisciplina);
			preencheDsc.numCreditos = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero de creditos da disciplina"));
			preencheDsc.numCreditos = validaNumCreditos(preencheDsc.numCreditos);
			listaDisciplina.add(preencheDsc);
			opcao = JOptionPane.showConfirmDialog(null,
					"Quer continuar cadastrando disciplinas ?", "Escolha um", JOptionPane.YES_NO_OPTION);
		
		}while(opcao == 0);
	}
	
	//Objetivo: Listar disciplinas
	public static void listarDisciplinas() {
		
		System.out.println("LISTA DE DISCIPLINAS:\n");
		
		for(int i = 0; i < Disciplina.listaDisciplina.size(); i++) {   
			
			System.out.println("Disciplina: " + Disciplina.listaDisciplina.get(i).nomeDisciplina);
			System.out.println("Numero de creditos: " + Disciplina.listaDisciplina.get(i).numCreditos);
			System.out.println("---------------------");
		} 
	}
		
	
	
	//objetivo: quando o usuario selecionar a opcao cadastrar turma, uma lista de disciplinas deve ser mostrada,
	//			e o usuario devera escolher uma disciplina para essa turma, e depois os seus atributos
	public static void criarTurma() {
		Object[] objArray = listaDisciplina.toArray();
		 
		do {
			
			Turma preencheTurma = new Turma(); 
			
			String temporaria = String.valueOf(JOptionPane.showInputDialog(
					null,"Escolha a Disciplina dessa nova turma","Escolha",JOptionPane.QUESTION_MESSAGE,
					null,objArray,objArray[0]));
			
//			Disciplina disciplinaParaCriarATurma = new Disciplina();
//			disciplinaParaCriarATurma = Disciplina.valueOf(JOptionPane.showInputDialog(
//					null,"Escolha a Disciplina dessa nova turma","Escolha",JOptionPane.QUESTION_MESSAGE,
//					null,objArray,objArray[0]));
			
			preencheTurma.cadastrasTurma(temporaria, listaDisciplina, preencheTurma);
			
//			preencheTurma.nomeDaTurma = JOptionPane.showInputDialog("Digite o nome da turma");
//			preencheTurma.nomeDaTurma = validaNome(preencheTurma.nomeDaTurma);
//			preencheTurma.numeroDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));
//			preencheTurma.disciplinaDaTurma = disciplinaParaCriarATurma;
//				for(int aux=0; aux<listaDisciplina.size() ; aux++) {
//					if(listaDisciplina.get(aux).nomeDisciplina.equalsIgnoreCase(disciplinaParaCriarATurma.getNomeDisciplina())) {
//						listaDisciplina.get(aux).listaTurma.add(preencheTurma);
//					}
//				}
			opcao = JOptionPane.showConfirmDialog(null,
					"Quer continuar cadastrando turmas ?", "Escolha um", JOptionPane.YES_NO_OPTION);
		}while(opcao==0);
		
	}
	
	//Objetivo: Alterar os dados das turmas
	
	public static void alterarTurmas() {
		Object[] objArrayDsc = listaDisciplina.toArray();
		String temporaria_disciplina = String.valueOf(JOptionPane.showInputDialog(
				null,"Selecione uma disciplina","Escolha",JOptionPane.QUESTION_MESSAGE,
				null,objArrayDsc,objArrayDsc[0]));
		for(Disciplina disciplina :  listaDisciplina) {
				if(disciplina.getNomeDisciplina().equalsIgnoreCase(temporaria_disciplina)) {
					Object[] objArrayTrm = disciplina.listaTurma.toArray();
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
			
		
	}
	
	public static void listarTurmas() {
		Object[] objArray = listaDisciplina.toArray();
		String temporaria_turma = String.valueOf(JOptionPane.showInputDialog(
				null,"Qual a disciplina deve ter as turmas listadas?","Escolha",JOptionPane.QUESTION_MESSAGE,
				null,objArray,objArray[0]));
		
		for(Disciplina disciplina :  listaDisciplina) {
			for(Turma turma: disciplina.listaTurma) {
				if(disciplina.getNomeDisciplina().equalsIgnoreCase(temporaria_turma)) {
					System.out.println("Turmas de " + disciplina + ":");
					System.out.println("  Nome da turma : " + turma.nomeDaTurma);
					System.out.println("    Numero de alunos: " + turma.numeroDeAlunos);

				}
			}
		}
	}
	
	//Objetivo: Alterar os dados da disciplina
	public static void alterarDisciplina() {
		Object[] objArray = listaDisciplina.toArray();
		String temporaria_Disciplina = String.valueOf(JOptionPane.showInputDialog(
				null,"Qual a disciplina voce quer alterar?","Escolha",JOptionPane.QUESTION_MESSAGE,
				null,objArray,objArray[0]));
		for(Disciplina disciplina : listaDisciplina) {
			if(disciplina.getNomeDisciplina().equalsIgnoreCase(temporaria_Disciplina)) {
				System.out.println(((Disciplina) Disciplina.listaDisciplina).getNomeDisciplina());
				System.out.println("   " + "Numero de creditos:  " + ((Disciplina) Disciplina.listaDisciplina).getNumCreditos());
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
}
