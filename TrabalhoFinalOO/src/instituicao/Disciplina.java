package instituicao;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
public class Disciplina {
	public String nomeDisciplina;
	public int numCreditos;
	static int opcao;
	//public static List<Turma> listaTurma = ArrayList<Turma>();
	static List<Disciplina> listaDisciplina = new ArrayList<Disciplina>();
	@Override
	public String toString() {
		nomeDisciplina = nomeDisciplina.substring(0, 1).toUpperCase() + nomeDisciplina.substring(1).toLowerCase();
		return  nomeDisciplina;
	}
	
	
	
	public void criarDisciplina() {
		do {
			Disciplina preencheDsc = new Disciplina();
			preencheDsc.nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina");
			preencheDsc.nomeDisciplina = validaNome(preencheDsc.nomeDisciplina);
			preencheDsc.numCreditos = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de cr�ditos da disciplina"));
			preencheDsc.numCreditos = validaNumCreditos(preencheDsc.numCreditos);
			listaDisciplina.add(preencheDsc);
			opcao = JOptionPane.showConfirmDialog(null,
					"Quer continuar cadastrando disciplinas ?", "Escolha um", JOptionPane.YES_NO_OPTION);
		}while(opcao == 0);
	}
	
	//Objetivo: Listar disciplinas
	public void listarDisciplinas() {
			for(int i = 0; i < Disciplina.listaDisciplina.size(); i++) {   
				Disciplina.listaDisciplina.get(i).nomeDisciplina = Disciplina.listaDisciplina.get(i).nomeDisciplina + "\n";
			} 
		JOptionPane.showMessageDialog(null, listaDisciplina,"Disciplinas", JOptionPane.INFORMATION_MESSAGE);
	}
		
	
	
	//objetivo: quando o usuario selecionar a opcao cadastrar turma, uma lista de disciplinas deve ser mostrada,
	//			e o usuario devera escolher uma disciplina para essa turma, e depois os seus atributos
	public static void cadastrarTurmas() {
		Turma preencheTurma = new Turma();
		 Object[] objArray = listaDisciplina.toArray();
		 int indice;
		do {
			String temporaria = String.valueOf(JOptionPane.showInputDialog(
					null,"Escolha a Disciplina dessa nova turma","Escolha",JOptionPane.QUESTION_MESSAGE,
					null,objArray,objArray[0]));
			preencheTurma.nomeDaTurma = JOptionPane.showInputDialog("Digite o nome da turma");
			preencheTurma.nomeDaTurma = validaNome(preencheTurma.nomeDaTurma);
			preencheTurma.numeroDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de alunos"));
			preencheTurma.disciplinaDaTurma = temporaria;
				for(int aux=0; aux<listaDisciplina.size() ; aux++) {
					if(listaDisciplina.get(aux).nomeDisciplina.equalsIgnoreCase(temporaria)) {
						//listaDisciplina.get(aux).listaTurma.add(preencheTurma);
					}
				}
			opcao = JOptionPane.showConfirmDialog(null,
					"Quer continuar cadastrando turmas ?", "Escolha um", JOptionPane.YES_NO_OPTION);
		}while(opcao==0);
		
	}
	
	
	
	public static void listarTurmas() {
		Disciplina aux = new Disciplina ();
		//for(int i = 0; i < Disciplina.listaTurma.size(); i++) {   
		  //  Disciplina.listaTurma.get(i).nomeDaTurma = Disciplina.listaTurma.get(i).nomeDaTurma + "\n";
		} 
		//JOptionPane.showMessageDialog(null, listaTurma,aux.getNomeDisciplina(), JOptionPane.INFORMATION_MESSAGE);
	//}
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
			numCreditos = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero de cr�ditos da disciplina"));
		}
		return numCreditos;
	}
	
	
	//Objetivo: Validar o nome da Disciplina, pois ele n�o pode estar em branco
	public static String validaNome(String nome){
		while(nome == "") {
			//exception
			nome = JOptionPane.showInputDialog("Nome invalido, digite novamente");
		}
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
